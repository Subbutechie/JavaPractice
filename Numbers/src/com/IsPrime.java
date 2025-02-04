package com;

public class IsPrime {
	
	public static void main(String[] args) {
		int num = 11;
		if(isPrime(num)) {
			System.out.println(num+" is a prime number");
		}else
		{
			System.out.println("Not Prime");
		}
		
		if(isPrime(num,0)) {
			System.out.println(num+" is a prime number");
		}else
		{
			System.out.println("Not Prime");
		}
	}
	
	//BruteForce
	//TC: O(N)
	//SC: O(1)
	private static boolean isPrime(int num) {
		
		int count = 0;
		for (int i = 1; i <=num; i++) {
			if(num%i == 0) {
				count++;
			}
		}
		if(count == 2) {
			return true;
		}
		return false;
	}
	
	static boolean isPrime(int num,int count) {
		
		for(int i = 1; i <= Math.sqrt(num); i++) {
			if(num%i == 0) {
				count++;
				if(num/i != i) {
					count++;
				}
			}
		}
		if(count == 2) {
			return true;
		}else {
			return false;
		}
		
		
	}
	
	
	

}
