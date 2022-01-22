package com.fundamentosplazi.springboot.fundamentos.component;


import org.springframework.stereotype.Component;

@Component
public class ComponentImplement implements ComponentDependency {
    @Override
    public void saludar() {
        System.out.println("Te saludo desde mi primer componente");
    }
}
