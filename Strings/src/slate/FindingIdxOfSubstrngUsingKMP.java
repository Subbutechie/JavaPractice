package slate;

public class FindingIdxOfSubstrngUsingKMP {
	
	 public static void main(String[] args) {
	        String str= "takeuforward";
	        String pat = "forward";
	        System.out.println(KMPPatternMatch(str,pat));
	    }
	    
	    static int KMPPatternMatch(String str,  String pat){
	       /*char[] text = str.toCharArray();
	       char[] pattern = pat.toCharArray();*/
	       
	       int[] lps = computeLPSArray(pat);
	       int m =  pat.length();
	       int n = str.length();
	       if(m>n){
	           return -1;
	       }
	       
	       int i = 0;
	       int j = 0;
	       
	       while(i<n){
	           if(str.charAt(i) == pat.charAt(j)){
	               i += 1;
	               j += 1;
	           }
	           if(j==m){
	               return i-j;
	           }
	           else if(str.charAt(i) != pat.charAt(j)){
	               if(j!=0){
	                   j = lps[j-1];
	               }else{
	                   i = i+1;
	               }
	           }
	       }
	       return -1;
	    }
	    
	    static int[] computeLPSArray(String pat){
	        int i=1;
	        int n = pat.length();
	        int length = 0;
	        int[] lps = new int[n];
	        while(i<n){
	            if(pat.charAt(i) == pat.charAt(length)){
	                length++;
	                lps[i] = length;
	                i++;
	            }
	            else{
	                if(length!=0){
	                    length = lps[length-1];
	                }
	                else{
	                    lps[i] = 0;
	                    i++;
	                }
	            }
	        }
	        return lps;
	    }

}
