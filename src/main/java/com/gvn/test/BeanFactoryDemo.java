package com.gvn.test;

import com.gvn.container.BeanNameAwareImpl;
import com.gvn.container.Student;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

@SuppressWarnings("all")
public class BeanFactoryDemo {
    public static void main(String[] args) {
        XmlBeanFactory xmlBeanFactory = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
//        Student student = (Student)xmlBeanFactory.getBean("student");
        BeanNameAwareImpl beanNameAwareImpl = (BeanNameAwareImpl)xmlBeanFactory.getBean("beanNameAwareImpl");
        System.out.println(beanNameAwareImpl.getName());
    }
}
