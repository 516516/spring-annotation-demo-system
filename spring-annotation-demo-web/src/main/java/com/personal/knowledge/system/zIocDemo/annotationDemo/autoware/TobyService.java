package com.personal.knowledge.system.zIocDemo.annotationDemo.autoware;

import com.personal.knowledge.system.zIocDemo.componentScanPkg.TDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * @program: spring-annotation-demo-pom
 * @description:
 * @author: bo.hu
 * @create: 2020-09-23 21:10
 **/

//　@Autowired + @Qualifier：
@Service
public class TobyService {
    @Autowired
    @Qualifier("tobyDao")
    private TDao tobyDao;

    public TDao getTobyDao(){
        return this.tobyDao;
    }
}