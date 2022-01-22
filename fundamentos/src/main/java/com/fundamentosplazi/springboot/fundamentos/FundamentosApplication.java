package com.fundamentosplazi.springboot.fundamentos;

import com.fundamentosplazi.springboot.fundamentos.component.ComponentDependency;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FundamentosApplication implements CommandLineRunner {

	private ComponentDependency ComponentDependency;

	public FundamentosApplication( @Qualifier("componentImplementTwo") ComponentDependency componentDependency){
		this.ComponentDependency = componentDependency;
	}

	public static void main(String[] args) {
		SpringApplication.run(FundamentosApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		ComponentDependency.saludar();
	}
}
