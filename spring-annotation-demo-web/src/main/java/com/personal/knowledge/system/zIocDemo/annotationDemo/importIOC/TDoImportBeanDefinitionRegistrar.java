package com.personal.knowledge.system.zIocDemo.annotationDemo.importIOC;

import com.personal.knowledge.system.zIocDemo.componentScanPkg.TDao;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @program: spring-annotation-demo-pom
 * @description:
 * @author: bo.hu
 * @create: 2020-09-23 20:04
 **/
public class TDoImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {
    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        //创建一个bean定义对象
        RootBeanDefinition rootBeanDefinition = new RootBeanDefinition(TDao.class);
        //把bean定义对象导入到容器中
        registry.registerBeanDefinition("tDao",rootBeanDefinition);
    }
}
