package com.fundamentosplazi.springboot.fundamentos.bean;

public class MyBeanImplement implements MyBean{
    @Override
    public void print() {
        System.out.println("TE saludo desde mi propia interfaz Bean ");
    }
}
