package com;

import java.util.Arrays;

public class CycleSort {

	public static void main(String[] args) {
		int[] arr = {3,1,3,4,2};
		System.out.println(cyclesort(arr));
		System.out.println(Arrays.toString(arr));
	}

	private static int cyclesort(int[] arr) {
		int n = arr.length;
		int i = 0;
		
		//Cyclic sort is used when a range is specified(0 to N)
		//normally when the array is sorted the index = value-1
		while(i<n) {
			int correctIndex = arr[i] - 1;
			if(arr[i] != arr[correctIndex]) {
				int temp = arr[i];
				arr[i] = arr[correctIndex];
				arr[temp-1] = temp;
			}
			else {
				i++;
			}			
		}
		
		for(int j = 0; j<n; j++) {
			if(arr[j] != j+1) {
				return arr[j];
			}
		}
		return -1;

	}

}
