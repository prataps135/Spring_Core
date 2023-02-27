package com.demo.SpringCore_10;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class QuickSort implements SortAlgorithm{
	public int[] sort(int[] arr) {
		// Some logic here
		return arr;
	}
}
