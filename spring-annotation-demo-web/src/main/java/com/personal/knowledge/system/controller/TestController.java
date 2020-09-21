package com.personal.knowledge.system.controller;

import com.personal.knowledge.system.model.Model;
import com.personal.knowledge.system.service.ModelService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * @program: spring-annotation-demo-pom
 * @description:
 * @author: bo.hu
 * @create: 2020-09-21 15:05
 **/
@Controller
@RequestMapping(value = "/testController")
@Slf4j
public class TestController {

    @Autowired
    ModelService modelService;

    @RequestMapping(value = "/test", method = RequestMethod.POST)
    @ResponseBody
    public  Map<String, Object> test(HttpServletRequest request, HttpServletResponse response) {
        Map<String, Object> map = new HashMap();
        Long modelId=null;
        try {
            modelId= Long.valueOf(request.getParameter("modelId"));
            Model model = modelService.testDemo(modelId);
            map.put("code", 1);
            map.put("msg", "success");
            map.put("data",model);
        } catch (Exception e) {
            log.error("查询异常：modelId: "+modelId);
            map.put("code", 0);
            map.put("msg", "error");
            map.put("data",new Object());
        }
        return map;
    }

}