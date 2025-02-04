package slate;

public class Palindrome {
	
	public static void main(String[] args) {
		String word =  "ABCBA";
		String str = "$abdcdba#";
		boolean check = checkPalindrome(str);
		if(check == true) 
			System.out.println("It is a palindrome");
		else
			System.out.println("It is not a palindrome");
		
		String res = (checkPalindromeUsingRecursion(0,word)) ? "is palindrome":"is not a palindrome";
		System.out.println(res);
		
		
		/*boolean ans = checkPalindromeUsingRecursion(0,word);
		if(ans) System.out.println("It is a palindrome");
		else System.out.println("It is not a Palindrome");*/
	}

	private static boolean checkPalindromeUsingRecursion(int i,String word) {
		
		if(i>=word.length()/2) return true;
		
		if(word.charAt(i) != word.charAt(word.length()-i-1)) return false;
		
		
		return checkPalindromeUsingRecursion(i+1,word);
		
	}

	private static boolean checkPalindrome(String word) {
		
		int left = 0, right = word.length()-1;
		while(left<right) {
			char l = word.charAt(left), r = word.charAt(right);
			
			if(!Character.isLetterOrDigit(l)) {
				left++;
			}
			else if(!Character.isLetterOrDigit(r)) {
				right--;
			}
			else if(Character.toLowerCase(r) != Character.toLowerCase(l)) {
				return false;
			}
			else {
				left++;
				right--;
			}
		}
		return true;
		
	}

}
