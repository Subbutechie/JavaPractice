package slate;

public class MaxOccuringCharacter {

	public static void main(String[] args) {
		String str = "apple";
		maxoccurChar(str);
	}

	private static void maxoccurChar(String str) {
		int[] freq = new int[200];
		int max= Integer.MIN_VALUE;
		for(int i =0; i<str.length();i++) {
			 freq[(int)str.charAt(i)]++;
			
		}
		
		for (int i = 0; i < 200; i++) {
			
			max = Math.max(max, freq[i]);
		}
		
		for(int i =0; i<str.length();i++) {
			if(freq[str.charAt(i)] == max) {
				System.out.println(str.charAt(i));
				freq[str.charAt(i)] = -1;
			}
		}
	}
}
