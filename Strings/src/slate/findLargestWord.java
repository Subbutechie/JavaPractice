package slate;

public class findLargestWord {
	public static void main(String[] args) {
	String str = "Big stepper underground methods";
	findlargestword(str);
	System.out.println(largeWord(str));
	}

	private static String largeWord(String str) {
		
		int len = str.length();
		String maxword = "";
		int i=0,j=0;
		int max_start = 0,max_length = 0;
		
		
		while(j<=len) {
			if(j<len && str.charAt(j) !=' ') {
				j++;
			}
			else {
				int current_len = j - i;
				if(current_len>max_length) {
					max_length = current_len;
					max_start = i;
				}
				
				j++;
				i=j;
			}
		}
		
		maxword = str.substring(max_start,max_start+max_length);
		return maxword;
	}

	private static void findlargestword(String str) {
		String[] arr = str.split(" ");
		String maxLenWord = "";
		for(String word : arr) {
			if(word.length()>maxLenWord.length()) {
				maxLenWord = word;
			}	
		}
		
		System.out.println(maxLenWord);
	}
	
	

}
