package com.personal.knowledge.system.project_optimization;

public class OPS_yh {
    public static void main(String[] args) {
        //重复发验证码  1.客户端倒计时控制   2.服务端控制
        //短信的服务提供商怎么选择?
        //redis  手机号： 一分钟 3次，超次5分钟不能发   一小时 10次  限24小时内不能发。
        //信息模板缓存：常用、万年不变的用缓存(redis  map)、不要每次db、IO瓶颈：网络、磁盘。
        //短信模板更换：直接作废原模版、使用新模板。
        //顺序：先存redis  在发送短信。
        //本地map
        String code=(Math.random()+"").substring(2,8);

        String code1=String.valueOf((int)((Math.random()*9+1)*Math.pow(10,5)));

        System.out.println(code);
        System.out.println(code1);

        /**
         * CPU核数  估算 线程数目
         * 线程数=cpu*可用核数/（1-阻塞系数）
         * 阻塞系数：IO密集型接近1  计算密集型接近0
         */

        /**
         * QPS提升策略：
         * 提高并发数：
         * {
         *      多线程
         *      增加各种连接数（redis tomcat mysql）
         *      服务无状态：便于系统横向扩张、扩机器
         *      让服务对等：serviceUrl 打乱顺序
         * }
         *
         * 减少响应时间:
         * {
         *     异步（下单成功发短信这种，不需要及时），流量削峰。
         *     缓存（减少db读取，减少磁盘IO，读多写少）（redis(数据量大的情况) map(数据量小，给面试官快速估算内存，1万条短信才1M)）
         *     数据库优化
         *     分批处理数据、多的数据、分批次返回
         *     减少调用链（没必要的服务不要独立出来）
         *     长连接、不要轮询（内存、配置、预估长连接）
         * }
         */

        /**
         * 简历：review代码，提升10倍效率,以及QPS的提高。
         */
    }
}