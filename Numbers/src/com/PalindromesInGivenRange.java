package com;

public class PalindromesInGivenRange {
	
	public static void main(String[] args) {
		int start = 100;
		int end  = 150;
		
		//GivePalindromes(start, end);
		
		for(int i = start; i<end; i++) {
			if(isPalindrome(i))
				System.out.print(i+",");
		}
		
	}

	private static boolean isPalindrome(int i) {
		
		int temp = i;
		int res = 0;
		while(temp>0) {
			res = res*10 + temp%10;
			temp /= 10;
		}
		
		return res == i;
		
	}

	private static void GivePalindromes(int start, int end) {
		int n= start+1;
		while(start<end) {
			
			int ans = 0;
			int original = n;
			while(n>0) {
				ans = ans*10+n%10;
				n = n/10;
			}
			if(ans == original) {
				System.out.println(ans+ ",");
			}
			
			n = original+1;
			start++;
		}
	}

}
