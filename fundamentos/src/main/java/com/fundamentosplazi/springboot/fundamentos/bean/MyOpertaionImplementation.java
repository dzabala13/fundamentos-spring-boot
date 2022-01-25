package com.fundamentosplazi.springboot.fundamentos.bean;

public class MyOpertaionImplementation implements MyOperation{
    @Override
    public int sum(int num) {
        return num+2;
    }
}
