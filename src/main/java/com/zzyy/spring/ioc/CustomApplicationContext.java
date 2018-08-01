package com.zzyy.spring.ioc;

import org.springframework.beans.BeansException;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 一个继承了ClassPathXmlApplicationContext 的容器；本身没有任何及资自己的操作；
 */
public class CustomApplicationContext extends ClassPathXmlApplicationContext {

    public CustomApplicationContext(String configLocation) throws BeansException {
        super(configLocation);
    }
}
