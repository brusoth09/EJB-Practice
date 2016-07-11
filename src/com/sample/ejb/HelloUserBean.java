package com.sample.ejb;

import javax.ejb.Stateless;

@Stateless
public class HelloUserBean implements HelloUser {
    @Override
    public void sayHello(String name) {
        System.out.println("Hello "+name+" Welcome to EJB 3!");
    }
}
