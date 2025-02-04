package slate;

public class MInCharsToMakePalinfdrome {
	
	//BruteForce
	//TC : O(N*N)
	//SC : O(1)
	public static int minChar(String s) {
        // Write your code here
		int n = s.length();
		int i = n-1;
		while(i>=0) {
			if(isPalindrome(0,s)) {
				return n-i-1;
				
			}
			else {
				s = s.substring(0,i);
			}
			
			i--;
		}
		return 0;
        
	}
    
    static boolean isPalindrome(int i,String str){
        int n = str.length();
        if(i>=n/2) return true;
        if(str.charAt(i) != str.charAt(n-i-1)) return false;
        return isPalindrome(i+1,str);
    }
	
	public static void main(String[] args) {
		String s = "abc";
		System.out.println(minChar(s));
	}

}
