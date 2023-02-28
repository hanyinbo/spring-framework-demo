package com.gvn.container;

import org.springframework.beans.factory.BeanNameAware;

public class Student implements BeanNameAware {
    private String name = "hanyinbo";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBeanName(String s) {
        System.out.println("beanName:"+s);
    }
}
