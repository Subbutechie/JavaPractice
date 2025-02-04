package com;

public class Factorial {
	
	public static void main(String[] args) {
		int num = 5;
		System.out.println(getFact(num));
		System.out.println("--------------------------");
		System.out.println(getFactorialUsingRecursion(num));
	}

	private static int  getFactorialUsingRecursion(int num) {
		
		if(num == 0) {
			return 1;
		}
		
		return num * getFactorialUsingRecursion(num-1);
		
		
		
	}

	private static int  getFact(int num) {
		
		
		int res = 0;
		int temp = 1;
		while(num>0) {
			temp *= num;
			num--;
		}
		return temp;
	}
	
	
	

}
