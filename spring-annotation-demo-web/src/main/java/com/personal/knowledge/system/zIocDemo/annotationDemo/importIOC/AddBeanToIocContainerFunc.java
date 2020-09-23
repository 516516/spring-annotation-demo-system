package com.personal.knowledge.system.zIocDemo.annotationDemo.importIOC;

import com.personal.knowledge.system.zIocDemo.componentScanPkg.T;
import com.personal.knowledge.system.zIocDemo.componentScanPkg.TDao;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @program: spring-annotation-demo-pom
 * @description:  向IOC容器中添加组件的方式
 * @author: bo.hu
 * @create: 2020-09-23 19:41
 **/
@Configuration
//@ComponentScan(basePackages = {"com.personal.knowledge.system.zIocDemo.componentScanPkg"})  + @Controller、@Service、@Repository、@Component 针对我们自己写的组件可以通过该方式来加载到容器中
//@Import({TDao.class})
//@Import({TDaoImportSelector.class})
//@Import({TDoImportBeanDefinitionRegistrar.class})
public class AddBeanToIocContainerFunc implements FactoryBean<TDao> {
    @Override
    public TDao getObject() throws Exception {
        return new TDao();
    }

    @Override
    public Class<?> getObjectType() {
        return TDao.class;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }

/*    @Bean
    public TDao getDao(){
        return new TDao();
    }*/

}