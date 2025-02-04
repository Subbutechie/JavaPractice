package com;

import java.util.Arrays;

public class Test {
	
	public static void main(String[] args) {
		int[] arr = {0 ,-10 ,1 ,3 ,-20};
		System.out.println(missingNumber(arr));
		
		System.out.println(findMissingNum(arr));
		
		System.out.println(firstMissingNum(arr));
	}


	
	public static int missingNumber(int[] arr) {
		
		Arrays.sort(arr);
		int res = 1;
		for (int i = 0; i < arr.length; i++) {
			
			if(arr[i] == res) {
				res += 1;
				
			}
			
			else if(arr[i]>res) {
				break;
			}
			
		}
      
		return res;
	}
	
	
	
	//TC:O(N)
	//SC:O(N)
	static int findMissingNum(int[] arr) {
		
		int n = arr.length;
		
		//To mark the occurence of elements
		boolean[] vis = new boolean[n];
		
		//if element is in the range from 1 to n
		//then mark it as visited
		for (int i = 0; i < n; i++) {
			if(arr[i]>0 && arr[i] <=n) {
				vis[arr[i]-1] =true;
			}
		}
		
		for(int  i = 1; i<n+1; i++) {
			if(!vis[i-1]) {
				return i;
			}
		}
		
		
		//if all the elements from 1 to are visited
		//then n+1 will be the first positive missing number
		
		return n+1;
		
	}
	
	
	//Optimal approach using cycling sort
	//TC:O(N)
	//SC:O(1)
	static int firstMissingNum(int[] arr) {
		
		int n = arr.length;
		
		//if arr[i] is within th range 1 to n
		//and arr[i] is not placed at (arr[arr[i]-1)th index in arr
		//swap the arr[i] to the index position
		
		for(int i = 0; i<n; i++) {
			while(arr[i]>=1 && arr[i]<=n && arr[i] != arr[arr[i]-1]) {
				
				//then swap arr[i] and arr[arr[i]-1] to place arr[i]
				//to it's corresponding index
				int temp = arr[i];
				arr[i] = arr[arr[i]-1];
				arr[temp-1] = temp;
				
				
			}
		}
		
		//If any number is not at its corresponding index, then
		//It is a missing number
		
		for(int i= 1; i<n+1; i++) {
			if(i != arr[i-1]) {
				return i;
			}
		}
		
		//If all number from 1 to n are present
		//then n+1 is the smallest missing number
		
		return n+1;
	
	}

}





