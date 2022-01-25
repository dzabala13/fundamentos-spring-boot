package com.fundamentosplazi.springboot.fundamentos.configuration;

import com.fundamentosplazi.springboot.fundamentos.bean.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfigurationBean {
    @Bean
    public MyBean beanOperation(){
        return new MyBean2Implementation();
    }

    @Bean
    public MyOperation MyOperationBean(){
        return new MyOpertaionImplementation();
    }

    @Bean
    public MyBeanWhitDependency MyBeanWhitDependency(MyOperation myOperation){
        return new MyBeanWhitDependencyImplementation(myOperation);
    }
}
