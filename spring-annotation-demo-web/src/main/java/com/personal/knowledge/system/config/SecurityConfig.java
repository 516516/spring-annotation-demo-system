package com.personal.knowledge.system.config;

import com.personal.knowledge.system.interceptor.SecurityInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * @program: spring-annotation-demo-pom
 * @description: 角色校验拦截器
 * @author: bo.hu
 * @create: 2020-09-21 17:49
 **/
@Configuration
public class SecurityConfig extends WebMvcConfigurationSupport {

    @Bean
    public SecurityInterceptor securityInterceptor(){
        return new SecurityInterceptor();
    }

    @Override
    protected void addInterceptors(InterceptorRegistry registry) {
        InterceptorRegistration registration = registry.addInterceptor(securityInterceptor());
//        registration.excludePathPatterns("");
        registration.addPathPatterns("/testController/*");
        /*registration.excludePathPatterns("/home/*");
        registration.excludePathPatterns("/");
        registration.excludePathPatterns("/login");
        registration.addPathPatterns("/admin/*");
        registration.addPathPatterns("/admin");*/
    }
}
