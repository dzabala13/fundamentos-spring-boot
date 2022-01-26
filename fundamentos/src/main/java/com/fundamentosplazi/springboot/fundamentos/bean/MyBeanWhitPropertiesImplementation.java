package com.fundamentosplazi.springboot.fundamentos.bean;

public class MyBeanWhitPropertiesImplementation implements MyBeanWhitProperties {

    private String name;
    private String apellido;

    public MyBeanWhitPropertiesImplementation(String name, String apellido) {
    this.name=name;
    this.apellido=apellido;
    }

    @Override
    public String function() {
         return name + "-" +apellido;
    }
}
