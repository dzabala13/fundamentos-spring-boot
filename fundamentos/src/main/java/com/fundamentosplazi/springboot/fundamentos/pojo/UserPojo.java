package com.fundamentosplazi.springboot.fundamentos.pojo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;

@ConstructorBinding
@ConfigurationProperties(prefix = "user")
public class UserPojo {


    private String password2;
    private String email;
    private String age;
    private String age2;


    public UserPojo( String password, String email,String age, String age2) {
        this.email = email;
        this.password2 = password;
        this.age = age;
        this.age2 = age2;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password2;
    }

    public void setPassword(String password) {
        this.password2 = password;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }


    public String getAge2() {
        return age2;
    }

    public void setAge2(String age2) {
        this.age2 = age2;
    }



}
