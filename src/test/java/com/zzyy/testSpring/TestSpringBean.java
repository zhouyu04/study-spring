package com.zzyy.testSpring;


import com.zzyy.spring.entity.Student;
import com.zzyy.spring.factory.CustomBeanFactory;
import com.zzyy.spring.ioc.CustomApplicationContext;
import org.junit.Test;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class TestSpringBean {


    @Test
    public void test03(){

        ClassPathResource resource = new ClassPathResource("beans.xml");

        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();

        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);

        reader.loadBeanDefinitions(resource);


    }

    @Test
    public void test02(){

        ApplicationContext ac = new CustomApplicationContext("beans.xml");

        Student student = (Student) ac.getBean("student");

        boolean student1 = ac.isSingleton("student");


        System.out.println(student);

        System.out.println(student1);


    }

    @Test
    public void test01(){

        CustomBeanFactory cbf = new CustomBeanFactory();

        //是否有bean
        boolean student = cbf.containsBean("student");
        System.out.println(student);

        System.out.println("-------------------------------");

        System.out.println(cbf);


    }
}
