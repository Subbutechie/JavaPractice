package com;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		
		
		int[] arr = {2,587,8,54,2};
		insertion(arr);
		System.out.println(Arrays.toString(arr));
	}

	private static void insertion(int[] arr) {
		//we loop from 0 to n-2 since we will take j as i+1
		for(int i = 0; i < arr.length-1; i++) {
			for(int j = i+1; j>0; j--) {
				//when jth element is less than j-1th element we swap 
				if(arr[j]<arr[j-1]) {
					swap(arr,j,j-1);
				}else {
					//if jth element is not smaller than j-1th element that means it's already sorted
					//so we break the loop
					break;
				}
			}
		}
	}

	private static void swap(int[] arr, int start, int end) {
		
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
		
	}

}
