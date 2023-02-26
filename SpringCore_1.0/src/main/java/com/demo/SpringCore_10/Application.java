package com.demo.SpringCore_10;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
	
	public static void main(String[] args) {
		BinarySearchImpl binarySerach = new BinarySearchImpl(new QuickSort());
		int result = binarySerach.binarySearch(new int[] {1,2,3,4,5}, 5);
		System.out.println(result);
		
//		SpringApplication.run(Application.class, args);
		
	}

}
