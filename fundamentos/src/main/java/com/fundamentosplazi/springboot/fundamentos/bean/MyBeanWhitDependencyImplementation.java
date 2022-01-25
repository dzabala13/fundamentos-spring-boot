package com.fundamentosplazi.springboot.fundamentos.bean;



public class MyBeanWhitDependencyImplementation implements MyBeanWhitDependency{

    private MyOperation myOperation;

    public MyBeanWhitDependencyImplementation(MyOperation myOperation) {
        this.myOperation = myOperation;
    }

    @Override
    public void showSum(int numToSum) {

        System.out.println("el numero ingresado es de la operacion es "+numToSum+"");
        System.out.println("el resultado de la operacion es "+myOperation.sum(numToSum)+"");

    }
}
