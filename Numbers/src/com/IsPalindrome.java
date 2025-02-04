package com;

public class IsPalindrome {
	
	public static void main(String[] args) {
		int x= 4554;
		
		checkPalindrome(x);
	}

	private static void checkPalindrome(int x) {
		
		int ans =0;
		int temp = x;
		while(x>0) {
			ans = ans*10 + x%10;
			x = x/10;
		}
		if(temp == ans) {
			System.out.println("It is a palindrome "+ans);
		}
		else {
			System.out.println("Not a Palindrome");
		}
		
		
	}

}
