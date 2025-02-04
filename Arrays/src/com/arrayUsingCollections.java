package com;

import java.util.Arrays;
import java.util.Collections;

public class arrayUsingCollections {
	
	public static void main(String[] args) {
		Integer[] arr = {5,4,3,2,1};
		int n = arr.length;
		arrayReverse(arr,n);
		printArray(arr);
	}

	private static void arrayReverse(Integer[] arr, int n) {
		Collections.reverse(Arrays.asList(arr));
		
		
	}

	private static void printArray(Integer[] arr) {
		int n= arr.length;
		for(int i=0; i<n;i++) {
			System.out.println(arr[i]+"");
		}
	}

}
