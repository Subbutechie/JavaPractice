package com;

public class PrimeNumInRange {
	public static void main(String[] args) {
		int min = 1,max = 20;
		for(int i =min ; i<max; i++) {
			if(isPrime(i)){
				System.out.println(i +" ");
			}
		}
		
	}

	private static boolean isPrime(int num) {
		int count = 0;
		

		for(int i =1; i<=Math.sqrt(num);i++) {
			
			if(num % i == 0) {
				count++;
				
				if(num/i != i) {
					count++;
				}
			}
		}
		
		if(count == 2) return true;
		
		return false;
		
	}
}
