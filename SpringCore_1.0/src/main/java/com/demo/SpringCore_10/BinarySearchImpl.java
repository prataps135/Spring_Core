package com.demo.SpringCore_10;

public class BinarySearchImpl {
	private SortAlgorithm sortAlgorithm;
	
	public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
		super();
		this.sortAlgorithm = sortAlgorithm;
	}

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
