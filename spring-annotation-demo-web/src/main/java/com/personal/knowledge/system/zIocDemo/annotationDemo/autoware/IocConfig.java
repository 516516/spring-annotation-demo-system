package com.personal.knowledge.system.zIocDemo.annotationDemo.autoware;

import com.personal.knowledge.system.zIocDemo.componentScanPkg.TDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * @program: spring-annotation-demo-pom
 * @description:
 * @author: bo.hu
 * @create: 2020-09-23 21:12
 **/
@Configuration
public class IocConfig {
    @Bean
    @Primary
    public TDao tobyDao(){
        return new TDao();
    }

    @Bean
    public TDao tobyDao2(){
        return new TDao();
    }
}