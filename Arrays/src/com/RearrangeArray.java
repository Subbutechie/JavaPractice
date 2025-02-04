package com;

import java.util.Arrays;

public class RearrangeArray {
	
	public static void main(String[] args) {
		int arr[] = {1,2,5,6,4,3};
		int n = arr.length;
		
		Arrays.sort(arr);
		
		for (int i = 0; i < n/2; i++) {
			System.out.println(arr[i]+ " ");
		}
		
		for (int i = n-1; i >= n/2; i--) {
			System.out.println(arr[i]+ " ");
		}
	}

}
