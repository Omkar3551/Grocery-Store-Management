package com.lifeline.grocerystore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GroceryStoreApplication {

	public static void main(String[] args) 
	{
		SpringApplication.run(GroceryStoreApplication.class, args);
		
		System.out.println("LIFELINE GROCERY STORE");
	}

}
