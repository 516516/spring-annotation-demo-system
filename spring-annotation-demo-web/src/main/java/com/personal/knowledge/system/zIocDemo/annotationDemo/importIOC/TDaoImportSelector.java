package com.personal.knowledge.system.zIocDemo.annotationDemo.importIOC;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @program: spring-annotation-demo-pom
 * @description:
 * @author: bo.hu
 * @create: 2020-09-23 20:01
 **/
public class TDaoImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[]{"com.personal.knowledge.system.zIocDemo.componentScanPkg.TDao"};
    }
}
