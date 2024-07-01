package com.aditya.repository;

import org.springframework.data.repository.CrudRepository;

import com.aditya.entity.Player;


//@Repository here the repository annotation is optional because our interface is not a normal interface our interface is extending the  properties from the CrudRepositoryso 
//our interface is becoming  JPA Repository interface when we are extending the Properties
public interface PlayerRepository extends CrudRepository<Player,Integer> {
 
	
}
 