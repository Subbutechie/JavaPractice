package com;

public class AddingElements {
	
	public static void main(String[] args) {
		int[] num = {1,35,6,7,8,9,6};
		int n= num.length;
		int value=27;
		
		  int[] result=insertAtBegining(num,n,value);
		  for(int x: result)
		  System.out.print(x+ " ");
		  System.out.println();
		 
		insertAtEnd(num,n,value);
		
		
		System.out.println();
		int pos = 4;
		insertAtPosition(num,n,value,pos);
	}

	private static void insertAtPosition(int[] num, int n, int value, int pos) {
		int[] newArr = new int[n+1];
		for(int i =0;i<n;i++) {
			newArr[i] = num[i];
		}
		
		for(int i=n; i>=pos; i--) {
			newArr[i] = num[i-1]; 
		}
		newArr[pos-1] = value;
		
		for(int x: newArr)
			System.out.print(x+ " ");
		
	}

	private static void insertAtEnd(int[] num, int n, int value) {
		 int[] modArr = new int[n+1];
		 for (int i = 0; i < num.length; i++) {
			modArr[i] = num[i];
		}
		 modArr[n] = value;
		 for(int x: modArr)
			 System.out.print(x+" ");
	}

	private static int[] insertAtBegining(int[] arr,int n, int value) {
		int newarr[] = new int[n+1];
		
		
		for(int i=n-1; i>=0 ;i--) {
			newarr[i+1] = arr[i];
		}
		newarr[0] = value;
		
		return newarr;
	}

}
