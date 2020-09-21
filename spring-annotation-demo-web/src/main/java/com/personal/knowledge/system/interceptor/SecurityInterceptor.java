package com.personal.knowledge.system.interceptor;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @program: spring-annotation-demo-pom
 * @description: 角色校验拦截器
 * @author: bo.hu
 * @create: 2020-09-21 17:50
 **/
@Component
@Slf4j
public class SecurityInterceptor extends HandlerInterceptorAdapter {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("+++++++++++++++++++++++++++++++++++++++拦截请求++++++++++++++++++++++++++++++++++++++++");
        Cookie[] cookie=request.getCookies();
        log.info("cookies: "+ JSON.toJSONString(cookie));
        return true;
    }
}
