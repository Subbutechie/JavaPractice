package com;

public class MoveZeroesToENd {
	
	public static void main(String[] args) {
		int[] arr =  {3,5,0,0,4};
		method(arr);
		moveZeros(arr);
		System.out.println();
		pushZeroesToEnd(arr);
	}
	
	
	static void method(int[] arr) {
		/*
		 * int count = 0,i=0,limit =0; int len = arr.length; while(i<len) { if(arr[i] ==
		 * 0) { count++; } i++; } System.out.println(count);
		 * 
		 * for(int j =0;j<len;j++) { if(arr[j]!=0) //System.out.print(arr[j]+" "); limit
		 * = arr.length; }
		 * 
		 * for(int k = len-1;k>limit;k--) { arr[k] = 0; }
		 * 
		 * for(int x:arr) { System.out.print(x+" "); }
		 */
	}
	
	static void moveZeros(int[] arr) {
		int nonzerofoundat = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]!=0) {
				arr[nonzerofoundat] = arr[i];
				
				if(nonzerofoundat != i) {
					arr[i] = 0;
				}
				
				nonzerofoundat++;
			}
			
		}
		
		for(int num: arr) {
			System.out.print(num+" ");
		}
	}
	
	public static void pushZeroesToEnd(int[] arr) {
		int count = 0;
		for(int i= 0; i<arr.length;i++) {
			int temp = 0;
			if(arr[i]!=0) {
				temp = arr[count];
				arr[count] = arr[i];
				arr[i]  = temp;
				
				count++;
			}
			
		}
		
		for(int num : arr) {
			System.out.print(num+" ");;
		}
	}
	

}
