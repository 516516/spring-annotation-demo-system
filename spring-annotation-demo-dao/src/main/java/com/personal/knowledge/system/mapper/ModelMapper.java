package com.personal.knowledge.system.mapper;

import com.personal.knowledge.system.model.*;
import com.personal.knowledge.system.vo.QueryReq;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
  * 1.mapper接口不用写接口实现类即可完成数据库操作，使用非常简单，也是官方推荐的使用方法
  * 2.mapper.xml  文件中的namespace必须和mapper接口的全路径保持一致
  * 3.mapper.xml  文件中的id必须和mapper接口的方法名称保持一致
  * 4.mapper.xml  文件中的输入参数类型必须与sql中定义的parameterType一致
  * 5.mapper.xml  文件中的输出参数类型必须与sql中定义的resultType一致
 */

/**
 * 1.Mybatis 一级缓存  作用域是session 当openSession后，执行相同的SQL 相同的参数  Mybatis不执行SQL，而是直接栋缓存中返回‘
 * 2.在mybatis中，一级缓存默认是开启的，并且一直无法关闭
 * 3.一级缓存满足条件：1、同一个session中  2、相同的SQL和参数
 * 4.sqlSession.clearCache();可以强制清除缓存
 * 5.执行update、insert、delete的时候，会清空缓存
 *
 * 6.mybatis 的二级缓存的作用域是一个mapper的namespace ，同一个namespace中查询sql可以从缓存中命中。
 * 7.开启二级缓存，实体必须序列化：
 *
 */

// Mybatis  关于查询对象  查询集合   返回值问题确定
/** 查询对象----无值  返回为空(null)     查询集合----无值  返回大小为0的集合   不会返回空(not null)*/

// 批量操作   入参为空时如何处理  in  后面没有东西  不做处理的话   没条件全表扫描
/** 这种情况就不应该查库，业务程序控制，为空不查库，不然查库也是空跑一遍得到一个空集合没有意义。*/

/**
 * 索引分类：
 * 1.覆盖索引：select name from table where name=‘’;---要查的字段就在where条件里的索引字段  本质 减少回表[索引-结果行主键值-数据文件]
 * 2.组合索引：最左匹配
 * 3.主键索引（primary key）：唯一,不允许null,【复合主键索引】
 * 5.唯一索引（unique index）：唯一,允许null,但有且只有一个null,【联合唯一索引】
 * 7.普通索引（index）：没限制
 */

/**
 * 索引使用技巧
 * 1.MySQL会一直向右匹配直到遇到范围查询(>、<、between、like)就停止匹配
 * 2.=和in可以乱序，比如a = 1 and b = 2 and c = 3，建立(a,b,c)索引可以任意顺序
 * 3.区分度的公式是count(distinct col)/count(*)
 * 4.is null这种语句只能全表扫描---索引树不会存储null值
 */

/**
 * 索引失效的几种情况
 * 1.idx(usename,url)  组合索引最左匹配，没有最左字段
 * 2.varchar 类型  不加''、int 类型 加''  [隐式类型转换导致失效] 字符串与数字比较的时候   是对原字段做了函数操作，导致索引失效
 * 3.like '%156757706289000010%'  [左边出现%或则_]
 * 4.or、<> 、!=、 not in、not exists [in能走索引]、函数运算索引失效[查询优化器兄弟节点有序无法保证]
 * 5.join  两张表的编码不同会导致索引失效[本质还是使用了函数]
 */

/**
 * 一个经典慢查询案例
 * CREATE TABLE `table_a` (`id` int(11) NOT NULL,b` varchar(10) DEFAULT NULL,PRIMARY KEY (`id`),KEY `b` (`b`)) ENGINE=InnoDB;
 * 假如表里有100万的数据，10万行数据是1234567890
 * 执行：select * from table_a where b='1234567890abcd';
 * step1.在传给引擎执行的时候，做了字符截断。因为引擎里面这个行只定义了长度是 10，所以只截了前 10 个字节，就是’1234567890’进去做匹配；
 * step2. 这样满足条件的数据有 10 万行；
 * step3. 因为是 select *， 所以要做 10 万次回表；
 * step4. 但是每次回表以后查出整行，到 server 层一判断，b 的值都不是’1234567890abcd’;
 * step5. 返回结果是空。
 */
@Mapper
@Component(value = "modelMapper")
public interface ModelMapper {

    int deleteByPrimaryKey(Long id);

    //开启主键回写功能----实际应用中有实际的场景
    int insert(Model record);

    int insertSelective(Model record);

    Model selectByPrimaryKey(Long id);

    //根据条件更新
    int updateByPrimaryKeySelective(Model record);

    int updateByPrimaryKey(Model record);

    List<ModelVo> selectByName(Model model);

    //批量新增
    int batchInsert(List<Model> modelList);

    //批量更新
    int batchUpdate(List<Model> modelList);

    //批量删除
    int batchDelete(List<Model> modelList);

    //批量查询---list
    List<Model> batchSelect(List<Long> idList);

    //批量查询---array
    List<Model> batchArraySelect(Long array[]);

    //使用param注解传单个参数，parameterType传javaBean
    Model selectByTableName(@Param("tableName") String tName, @Param("model") Model model);

    //parameterType传单个参数
    List<Model> selectByOneParam(String id);

    //parameterType多个参数，多参数的这种情况 优先选用JavaBean 不使用Map,保证字段安全
    List<Model> selectByMultiParam(Map<String, Object> paramMap);

    //测试if语句
    List<Model> testIfExpression(Model model);

    //choose then otherwise
    List<Model> testCWOEspression(Model model);

    //where
    List<Model> testWhereExpression(Model model);

    //高级查询 1对1查询  继承拓展方式实现
    List<ModelExpandVo> testOneToOneQueryF1(ModelExpandVo expandVo);

    //高级查询 1对1查询  添加属性方式实现
    List<ModelObjVo> testOneToOneQueryF2(ModelObjVo objVo);

    //高级查询 1对多查询 添加属性方式实现
    List<ModelVo> testOneToMore(Model bean);

    //高级查询 多对多查询 添加属性方式实现
    List<ModelListVo> testMoreToMore(Model bean);

    //特殊字符的解决办法
    List<Model> testSpecialCharacters(@Param("model") Model model, @Param("endTime") String endTime);

    //日期范围查询的处理
    List<Model> testDateRangeQuery(QueryReq req);

    //先判断是否存在，如果不存在直接插入   如果存在就更新
    /**慎用replace into【影响原落表数据】  全字段插入且带有唯一键的考虑使用这种方式
       这种情况建议   先查库  判断有无然后确定  插入还是更新  这种方式最稳妥*/
    int replaceInsert(Model model);

}