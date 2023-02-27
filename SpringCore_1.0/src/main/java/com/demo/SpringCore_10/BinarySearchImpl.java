package com.demo.SpringCore_10;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {
	
	@Autowired
	private SortAlgorithm sortAlgorithm;
	
	//This constructor will used for constructor based injection
//	public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
//		super();
//		this.sortAlgorithm = sortAlgorithm;
//	}
	
	// This will used for setter based injection
//	public void setSortAlgorithm(SortAlgorithm algorithm) {
//		this.sortAlgorithm = algorithm;
//	}

	public int binarySearch(int[] arr, int number) {
		// Sorting on array
		// Bubble sort
		int[] sortedNumber = sortAlgorithm.sort(arr);
		System.out.println(sortAlgorithm);
		// quick sort
		
		
		// Searching on array
		
		
		// Return the result
		return 3;
	}

}
