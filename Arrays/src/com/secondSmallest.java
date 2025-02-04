package com;

import java.util.Arrays;
import java.util.concurrent.ForkJoinPool;

public class secondSmallest {
	
	//Brute force, TimeComplexity:O(nlogn)
	
	/*
	 * public static void main(String[] args) { int arr[] = {2,4,5,5,6,7,96}; int n
	 * = arr.length; Arrays.sort(arr);
	 * System.out.println("Second Smallest: "+arr[1]);
	 * System.out.println("Second Largest: "+arr[n-2]); }
	 */
	
	
	//Better approach, TimeComplexity:O(N)
	public static void main(String[] args) {
		int arr[] = {10,10,10};
		int len = arr.length;
		//getSec_Smallest(arr,len);
		getSec_largest(arr, len);
		
		
	}

	

	/*
	 * private static void getElements(int[] arr, int len) {
	 * 
	 * int small = Integer.MAX_VALUE; int second_small = Integer.MAX_VALUE; int
	 * large = Integer.MIN_VALUE; int second_large = Integer.MIN_VALUE; int i;
	 * for(i=0; i<len; i++) { small = Math.min(arr[i], small); large =
	 * Math.max(arr[i], large); }
	 * 
	 * for(i=0; i<len; i++) { if(arr[i]<second_small && arr[i]!=small) {
	 * second_small = arr[i]; } if(arr[i]>second_large && arr[i]!=large) {
	 * second_large = arr[i]; } }
	 * 
	 * System.out.println("Second_smallest element is: "+second_small);
	 * System.out.println("Second Largest element is: "+second_large);
	 * 
	 * }
	 */
	
	
	//Optimal approach filter within a single traversal
	//Better approach, TimeComplexity:O(N)
	private static void getSec_Smallest(int[] arr, int len) {
		
		int small = Integer.MAX_VALUE;
		int second_small = Integer.MAX_VALUE;
		int i;
		
		for(i =0; i<len; i++) {
			if(arr[i]<small) {
				second_small = small;
				small = arr[i];
			}
			else if(arr[i]<second_small && arr[i] != small) {
				second_small = arr[i];
			}
		}
		System.out.println("Second smallest: "+second_small);
	}
		
private static void getSec_largest(int[] arr, int len) {
		
		int large = Integer.MIN_VALUE;
		int second_large = Integer.MIN_VALUE;
		int i;
		
		for (int j = 0; j < len; j++) {
			if( arr[j] == arr[len-j-1]) {
				System.out.println("-1");
				break;
		}
		
		for(i =0; i<len; i++) {
			if(arr[i]>large) {
				second_large = large;
				large = arr[i];
			}
			else if(arr[i]>second_large && arr[i] != large) {
				second_large = arr[i];
			}
			
		}
		System.out.println("Second largest: "+second_large);
		}}
	
}
