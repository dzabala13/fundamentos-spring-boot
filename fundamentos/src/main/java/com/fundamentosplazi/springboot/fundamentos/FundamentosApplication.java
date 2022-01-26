package com.fundamentosplazi.springboot.fundamentos;

import com.fundamentosplazi.springboot.fundamentos.bean.MyBean;
import com.fundamentosplazi.springboot.fundamentos.bean.MyBeanWhitDependency;
import com.fundamentosplazi.springboot.fundamentos.bean.MyBeanWhitProperties;
import com.fundamentosplazi.springboot.fundamentos.component.ComponentDependency;
import com.fundamentosplazi.springboot.fundamentos.entity.User;
import com.fundamentosplazi.springboot.fundamentos.pojo.UserPojo;
import com.fundamentosplazi.springboot.fundamentos.repository.UserRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class FundamentosApplication implements CommandLineRunner {

	private MyBeanWhitProperties myBeanWhitProperties;
	private ComponentDependency ComponentDependency;
	private MyBean myBean;
	private MyBeanWhitDependency myBeanWhitDependency;
	private UserPojo userPojo ;
	private UserRepository userRepository;

	public FundamentosApplication(
			@Qualifier("componentImplementTwo") ComponentDependency componentDependency,
			MyBean myBean,
			MyBeanWhitDependency myBeanWhitDependency,
			 MyBeanWhitProperties myBeanWhitProperties,
			UserPojo userPojo,
			UserRepository userRepository){
		this.ComponentDependency = componentDependency;
		this.myBean =myBean;
		this.myBeanWhitDependency = myBeanWhitDependency;
		this.myBeanWhitProperties = myBeanWhitProperties;
		this.userPojo= userPojo;
		this.userRepository= userRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(FundamentosApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		PreviousExamples();
		SaveUserInDB();
		}

	private void SaveUserInDB(){
		User user1 =new User("user1","exampel1@gmail.com", LocalDate.now());
		User user2 =new User("user2","exampel2@gmail.com", LocalDate.now());
		User user3 =new User("user3","exampel3@gmail.com", LocalDate.now());
		User user4 =new User("user4","exampel4@gmail.com", LocalDate.now());
		User user5 =new User("user5","exampel5@gmail.com", LocalDate.now());
		User user6 =new User("user6","exampel6@gmail.com", LocalDate.now());
		User user7 =new User("user7","exampel7@gmail.com", LocalDate.now());
		User user8 =new User("user8","exampel8@gmail.com", LocalDate.now());
		User user9 =new User("user9","exampel9@gmail.com", LocalDate.now());
		User user10 =new User("user10","exampel10@gmail.com", LocalDate.now());
		List<User> UserList= Arrays.asList(user1,user2,user3,user4, user5, user6,user7,user8,user9,user10);
		UserList.stream().forEach(userRepository::save);
	}

	private void PreviousExamples(){
		//ComponentDependency.saludar();
		//myBean.print();
		myBeanWhitDependency.showSum(2);
		System.out.println(myBeanWhitProperties.function ());
		System.out.println(	userPojo.getEmail() + "-" +userPojo.getPassword()+"-"+userPojo.getAge2());


	}

}
