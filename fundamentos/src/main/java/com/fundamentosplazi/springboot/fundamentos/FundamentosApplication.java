package com.fundamentosplazi.springboot.fundamentos;

import com.fundamentosplazi.springboot.fundamentos.bean.MyBean;
import com.fundamentosplazi.springboot.fundamentos.bean.MyBeanWhitDependency;
import com.fundamentosplazi.springboot.fundamentos.bean.MyBeanWhitProperties;
import com.fundamentosplazi.springboot.fundamentos.component.ComponentDependency;
import com.fundamentosplazi.springboot.fundamentos.pojo.UserPojo;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FundamentosApplication implements CommandLineRunner {

	private MyBeanWhitProperties myBeanWhitProperties;
	private ComponentDependency ComponentDependency;
	private MyBean myBean;
	private MyBeanWhitDependency myBeanWhitDependency;
	private UserPojo userPojo ;

	public FundamentosApplication(
			@Qualifier("componentImplementTwo") ComponentDependency componentDependency,
			MyBean myBean,
			MyBeanWhitDependency myBeanWhitDependency,
			 MyBeanWhitProperties myBeanWhitProperties,
			UserPojo userPojo){
		this.ComponentDependency = componentDependency;
		this.myBean =myBean;
		this.myBeanWhitDependency = myBeanWhitDependency;
		this.myBeanWhitProperties = myBeanWhitProperties;
		this.userPojo= userPojo;
	}

	public static void main(String[] args) {
		SpringApplication.run(FundamentosApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//ComponentDependency.saludar();
		//myBean.print();
		myBeanWhitDependency.showSum(2);
		System.out.println(myBeanWhitProperties.function ());
		System.out.println(		userPojo.getEmail() + "-" +userPojo.getPassword());
	}
}
