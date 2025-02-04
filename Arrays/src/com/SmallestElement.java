package com;

import java.util.Arrays;
import java.util.Scanner;

public class SmallestElement {
	
	
	public static int findSmallest(int[] arr, int len) {
		
		int smallest = arr[0];
		for(int i = 1; i<len;i++) {
			if(arr[i]<smallest) {
				smallest = arr[i];
			}
		}
		return smallest;
		
	}
	
	
	//Using arrays.sort()
	static int smallest(int[] arr) {
		
		Arrays.sort(arr);
		return arr[0];
	}
	
	
	public static void main(String[] args) {
		//Here I am going to use Linear Search approach
		/*
		 * Scanner sc = new Scanner(System.in); int[] num = new int[10]; int len =
		 * num.length; for(int i = 0; i<len;i++) { num[i] = sc.nextInt(); }
		 */
		
		
		int[] num = {23,5,45,4,25,66};
		int len = num.length;
		int smallestElement =  findSmallest(num,len);
		System.out.println("The smallest element in the array is :"+smallestElement);
		
		int smallest =  smallest(num);
		System.out.println("The smallest element in the array is :"+smallest);
		
	}
	
	

}
