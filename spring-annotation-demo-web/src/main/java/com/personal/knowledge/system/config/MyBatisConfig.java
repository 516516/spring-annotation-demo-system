package com.personal.knowledge.system.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

import javax.sql.DataSource;
import java.io.IOException;

/**
 * @program: spring-annotation-demo-pom
 * @description: mybatis
 * @author: bo.hu
 * @create: 2020-09-21 14:40
 **/
@Configuration
@PropertySource("classpath:application.properties")
public class MyBatisConfig {

    @Bean
    public DruidDataSource getDataSource(
            @Value("${spring.datasource.driver}")String driver,
            @Value("${spring.datasource.url}")String url,
            @Value("${spring.datasource.username}")String username,
            @Value("${spring.datasource.password}")String password){
        DruidDataSource ds=new DruidDataSource();
        ds.setDriverClassName(driver);
        ds.setUrl(url);
        ds.setUsername(username);
        ds.setPassword(password);
        return ds;
    }

    @Bean("sqlSessionFactory")
    public SqlSessionFactoryBean getFactory(@Autowired DataSource ds) throws IOException {
        SqlSessionFactoryBean factory=new SqlSessionFactoryBean();
        factory.setDataSource(ds);
        ResourcePatternResolver resolver=new PathMatchingResourcePatternResolver();
        Resource[] mapperLocations=resolver.getResources("classpath:mapper/*.xml");
        factory.setMapperLocations(mapperLocations);
        return factory;
    }

    @Bean
    public MapperScannerConfigurer getScanner(){
        MapperScannerConfigurer scanner=new MapperScannerConfigurer();
        scanner.setBasePackage("com.personal.knowledge.system.mapper");
        scanner.setSqlSessionFactoryBeanName("sqlSessionFactory");
        return scanner;
    }

}