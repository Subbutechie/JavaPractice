package com;

public class FindElement {

	public static void main(String[] args) {
		
		int[] arr = {3,5,6,7,8,10};
		int n = arr.length;
		int k = 5;
		//linearSearch(arr,n, k);
		binarySearch(arr,n,k);
	}

	private static void binarySearch(int[] arr, int n, int k) {
		
		int start=0,end=n-1;
		int mid = 0;
		while(start<=end) {
			mid = start+(end-start)/2;
			if(arr[mid] == k) {
				System.out.println("Element found at index "+mid);
				break;
				
			}
			else if(k>arr[mid]) {
				start = mid+1;
			}
			else {
				end = mid-1;
			}
		}
		
	}

	private static void linearSearch(int[] arr, int n, int k) {
		int ans = -1;
		for(int i = 0; i<n; i++) {
			if(arr[i] == k) {
				ans = i;
				break;
			}
		}
		System.out.println("The element "+k+" is found at "+ans);
	}

}
