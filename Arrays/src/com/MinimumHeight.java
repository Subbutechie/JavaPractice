package com;

import java.util.Arrays;

public class MinimumHeight {
	
	public static void main(String[] args) {
		int [] arr = {1, 8, 10, 6, 4, 6, 9, 1};
				
		int k =2;
		System.out.println(method1(arr,k));
	}

	private static int method1(int[] arr, int k) {
		 int n = arr.length;

	        // Step 1: Sort the array of tower heights
	        Arrays.sort(arr);
	        
	        // Initialize the maximum difference
	        int maxDiff = arr[n-1] - arr[0];

	        // Step 2: Iterate and calculate the minimum difference
	        for (int i = 1; i < n; i++) {
	            // The new possible minimum and maximum after adjusting the tower heights
	            int minHeight = Math.min(arr[0] + k, arr[i] - k); // Either increase the smallest tower or decrease the current one
	            int maxHeight = Math.max(arr[i-1] + k, arr[n-1] - k); // Either increase the previous tower or decrease the largest one

	            // Update the maxDiff to the minimum of current maxDiff and new maxHeight - minHeight
	            maxDiff = Math.min(maxDiff, maxHeight - minHeight);
	        }

	        return maxDiff;
	      
	}

}
