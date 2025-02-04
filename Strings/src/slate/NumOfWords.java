package slate;

public class NumOfWords {
	
	
	public static void main(String[] args) {
		String str = "HI AMY AND JAY";
		numOfWords(str);
		otherWay(str);
	}

	private static void otherWay(String str) {
		int spaces = 0;
		for (int j = 0; j < str.length(); j++) {
			char ch  = str.charAt(j);
			
			if(ch == ' ') {
				spaces++;
			}
		}
		System.out.println("number of words in the string are  "+(spaces+1));
	}

	private static void numOfWords(String str) {
		
		int len = str.length();
		
		String[] word = str.split(" ");
		
		System.out.println("number of words in the string are:"+word.length);
		
	}
	
	

}
