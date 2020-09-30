package com.personal.knowledge.system.config;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JSR310Module;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.Map;

/**
 * @program: spring-annotation-demo-pom
 * @description:
 * @author: bo.hu
 * @create: 2020-09-21 14:20
 **/
@Configuration
@ComponentScan(basePackages = {"com.personal.knowledge.system.aspect",
        "com.personal.knowledge.system.config",
        "com.personal.knowledge.system.controller",
        "com.personal.knowledge.system.interceptor",
        "com.personal.knowledge.system.service"}) // 扫描路径  @Controller @Service @Component
@EnableWebMvc  // 开启注解驱动  <mvc:annotation-driven/>     原始的DispatcherServlet:  org.springframework.web.servlet.DispatcherServlet
@EnableAspectJAutoProxy(proxyTargetClass = false)  //开启AOP代理  设置proxyTargetClass=false，或默认为false，则是用JDK代理，否则使用的是CGLIB代理
public class ServletConfig implements WebMvcConfigurer {

//    @Bean(name ="OBJECT_MAPPER_BEAN")
//    public ObjectMapper jsonObjectMapper (){
//        return Jackson2ObjectMapperBuilder.json()
//                .serializationInclusion(JsonInclude.Include.NON_NULL)//不包含空值
//                .featuresToDisable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS)// ISODate
//                .modules(new JSR310Module())
//                .build();
//    }

    @Bean
    public StringHttpMessageConverter stringHttpMessageConverter(){
        return new StringHttpMessageConverter();
    }

    @Bean
    public MappingJackson2HttpMessageConverter mappingJackson2HttpMessageConverter(){
        return new MappingJackson2HttpMessageConverter();
    }

}