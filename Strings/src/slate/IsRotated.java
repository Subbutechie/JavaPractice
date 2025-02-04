package slate;

public class IsRotated {

	public static void main(String[] args) {
		String s1 = "mightandmagic";
		String s2 = "andmagicmigth";
		
		
		
		System.out.println(isrotatedString(s1,s2));
	}
	
	//TC:O(N*N)
	private static boolean isRotated(String s1, String s2) {
		int n = s1.length();
		for(int i = 0; i<n; i++) {
			String rotated = s1.substring(i)+s1.substring(0,i);
			if(rotated.equals(s2)) {
				return true;
			}
		}
		return false;
	}
	
	
	static boolean isrotatedString(String s1, String s2) {
		s1 = s1.trim();
		s2 = s2.trim();
		String txt = s1+s1;
		String pat = s2;
		
		System.out.println("Concatenated txt: " + txt);
		System.out.println("Pattern: " + pat);
		
		//Search the pattern String s2 in the concatenated string
		int n = txt.length();
		int m = pat.length();
		
		//Creating an lps array that will hold the longest prefix suffix
		//values for pattern
		char[] pattern = pat.toCharArray();
		char[] text = txt.toCharArray();
		
		int[] lps =  computeLPSArray(pattern);
		
		
		
		
		int i=0,j=0;
		while(i<n) {
			
			if(pattern[j] == text[i]) {
				j += 1;
				i += 1;
			}
			
			if(j==m) {
				return true;
			}
			
			//mismatch after j matches
			else if(i<n && pattern[j] != text[i]) {
				//Do not match lps[0...lps[j-1]] characters
				//they will math anyway
				
				if(j != 0) {
					j = lps[j-1];
				}
				else {
					i += 1;
				}
			}
		}
		
		return false;
		
	}
	
	static int[] computeLPSArray(char[] pat) {
		 
		int n = pat.length;
		int[] lps = new int[n];
		
		//Length of the previous longest prefix suffix
		int patlen = 0;
		
		//lps[0] is always 0
		lps[0] = 0;
		
		//loop calculates lps[i] for 1 to n-1
		int i = 1;
		while(i<n) {
			
			
			//If the characters match, increment len
			//and extend the matching prefix
			
			if(pat[i] == pat[patlen]) {
				patlen++;
				lps[i] = patlen;
				i += 1;
			}
			
			//If there is a mismatch
			else {
				
				//If len is not zero, update len to last KNown prefix length
				if(patlen != 0) {
					patlen = lps[patlen - 1];
				}
				
				//No prefix matches, set lps[i] = 0
				//and move to the next character
				else {
					lps[i] = 0;
					i += 1;
				}
				
				
			}
		}
		
		return lps;
		
	}
}
