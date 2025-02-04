package slate;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class NonRepeatingCharacters {
	
	public static void main(String[] args) {
		String str = "geeksforgeeks";
		//nonRepeating(str);
		System.out.println(nonRepeatingChar(str));
	}

	 static void nonRepeating(String str) {
		
		int[] freq = new int[256];  // Assuming ASCII characters, use 256 for the number of possible characters
		
		// Count frequency of each character in the string
		for (int i = 0; i < str.length(); i++) {
			freq[(int)str.charAt(i)]++;
		}
		
		// Find and print non-repeating characters
		for (int i = 0; i < str.length(); i++) {
			if (freq[(int)str.charAt(i)] == 1) {
				System.out.print(str.charAt(i) + " ");
			}
		}
	}
	 
	 static char nonRepeatingChar(String s) {
	        // Your code here
	       //In linkedHashMap order of insertion is preserved
	        Map<Character,Integer> mp = new LinkedHashMap<Character,Integer>();
	        int len =s.length();
	        for(int i =0; i<len;i++){
	            mp.put(s.charAt(i),mp.getOrDefault(s.charAt(i),0)+1);
	        }
	        
	        for(int i = 0; i<len; i++) {
	        	if(mp.get(s.charAt(i)) == 1) {
	        		return s.charAt(i);
	        	}
	        }
	        
	        
	        return '$';
	    }

}
