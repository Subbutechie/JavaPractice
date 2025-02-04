package com;

public class KadanesAlgo {

	public static void main(String[] args) {
		int[] arr = {2, 3, -8, 7, -1, 2, 3};
		int[] res = findMaxSubArray(arr);
		
		for(int x: res) {
			System.out.print(x+",");
		}
	}

	private static int[] findMaxSubArray(int[] arr) {
		
		//edge case
		if(arr.length == 0) {
			return new int[] {};
		}
		
		int currentSum = arr[0];
		int max = arr[0];
		int start = 0, end =0, tempstart = 0;
		int n = arr.length;
		
		
		for(int i =1; i<n; i++) {
			if(arr[i] > currentSum+arr[i]) {
				currentSum = arr[i];
				tempstart = i;//potential start of new array
			}
			else {
				currentSum += arr[i];
			}
			
			
			if(max<currentSum) {
				max = currentSum;
				start = tempstart;
				end = i;//Update the end index of the subarray
			}
			
		}
		
		int[] subArr = new int[end - start+1];
		
		System.arraycopy(arr, start, subArr, 0, end - start+1);
		
		System.out.println("Max Sum: "+max);
	
		return subArr;
		
	}	

}
