package com.gvn.test;

import com.gvn.container.Student;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

@SuppressWarnings("all")
public class BeanFactoryDemo {
    public static void main(String[] args) {
       XmlBeanFactory xmlBeanFactory = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
        Student student = (Student)xmlBeanFactory.getBean("student");
        System.out.println(student.getName());
    }
}
