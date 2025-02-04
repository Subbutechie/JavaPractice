package slate;

public class WordwithMostRepeatedLetters {
	public static void main(String[] args) {
		String str = "abcdefghij google microsoft";
		method1(str);
		
				
	}

	private static void method1(String str) {
		
		String[] arr = str.toLowerCase().split(" ");
		int maxRepeatCount = 0;
		String resultWord = "";
		
		
		for(int i =0; i<arr.length;i++) {
			
			int[] freq = new int[26]; 
			
			for(int j =0; j<arr[i].length();j++) {
				freq[arr[i].charAt(j)-'a']++;
			}
			
			
			int maxFreq = 0;
			for(int k =0;k<freq.length;k++) {
				maxFreq = Math.max(freq[k],maxFreq);
			}
			
			if(maxFreq>maxRepeatCount) {
				maxRepeatCount = maxFreq;
				resultWord = arr[i];
			}
			
		}
		
		System.out.println("Word with most Repeated letters is " + resultWord);
		
		
	}

}
