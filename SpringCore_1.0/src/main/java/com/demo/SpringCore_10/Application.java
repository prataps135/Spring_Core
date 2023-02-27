package com.demo.SpringCore_10;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {
	
	public static void main(String[] args) {
		ApplicationContext context =
				SpringApplication.run(Application.class, args);
		
		BinarySearchImpl binarySearch =  
				context.getBean(BinarySearchImpl.class);
		
		int result = binarySearch.binarySearch(new int[] {1,2,3,4,5}, 5);
		System.out.println(result);
		
		
		
//		BinarySearchImpl binarySerach = new BinarySearchImpl(new QuickSort());
//		int result = binarySerach.binarySearch(new int[] {1,2,3,4,5}, 5);
//		System.out.println(result);
		
		
		
	}

}
