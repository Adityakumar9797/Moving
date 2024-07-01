package com.aditya;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.aditya.entity.Player;
import com.aditya.repository.PlayerRepository;

@SpringBootApplication
public class L23DataJpaApp1Application {

	public static void main(String[] args) {
		
//		SO HERE WE WANT TO GET THE REPOSITORY BEAN BY USING REPOSITORY WE WANT TO CALL THE METHOD SO WE CAN DO 
//		BY USING aUTOwIRE BEACAUSE WE WANT TO GET THE BEAN OBJECT FROM ioc WE CAN GET IT
//		SO WE GOT THE CONTEXT FROM THE RUN METHOD
//				PlayerRepository playerRepository=context.getBean(PlayerRepository.class);
// so  here player repository is a interface so we can't get the object of interface 
//		now how Ioc will create the object for interface
//		is it creating the object for interface so player repository for interface
		
//			System.out.println(playerRepository.getClass().getName()); //this will give us the Proxy class proxy object 
//After doing this we will the get the Proxy class 
//		so whenever we call the Ioc container.get bean for the player repository
//		it will give us one  object 
		
//		conclusion--> is that playerRepository is the interface for interface so we cannot   create the object
//		System.out.println(playerRepository.getClass().getName()); //this will give us the Proxy class proxy object 
//		conclusion--> is that playerRepository is the interface for interface we cannot create the object

		
//		so the thing is here whenever we  call Ioc conatainer.getBean for player repository it will give us one object
//		so player repository is an interface we cannot cretae the object of it
		
//so whenever we call repository bean we get the proxy object which is created by the data JPa in the runtime

//		so for example if we call the save metod than this save method is coming from the crudRepository os tgis save method taking the parameter entity class
		
//		now the thing is where these methods are coming -->CrudRepository
//		so our repository is extending the properties form the crudRepository
//		so we are getting all the methods from the crudeRepository
		
		
//		Configuration will be taken care by the Spring boot
		
		
//		Note::--> so here right now we are currently Writing our logic 
//		in the main method so later we are not going to write our logic in main method(when we go for layered architecture)
//		than we will call database logic in the Service layer when we developed a layred architecture
		
		ConfigurableApplicationContext context = SpringApplication.run(L23DataJpaApp1Application.class, args);
		PlayerRepository playerRepository=context.getBean(PlayerRepository.class);
		System.out.println(playerRepository.getClass().getName()); //this will give us the Proxy class proxy object s
	
		
//		By this we are inserting the data into the database
	Player p1=new Player();
	p1.setPlayerId(101);
	p1.setPlayerName("sachin");
	p1.setPlayerAge(42);
	p1.setLocation("mumbai");
	playerRepository.save(p1);
	System.out.println("Record has been inserted");
	
	
	
	}

}
