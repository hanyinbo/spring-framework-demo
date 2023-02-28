package com.gvn.container;

import org.springframework.beans.factory.BeanNameAware;

public class BeanNameAwareImpl implements BeanNameAware {
    private String beanName;
    public String getName(){
        return beanName;
    }
    public void setBeanName(String beanName) {
       this.beanName = beanName;
    }
}
