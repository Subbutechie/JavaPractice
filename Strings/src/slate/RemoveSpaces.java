package slate;

public class RemoveSpaces {
	
	public static void main(String[] args) {
		char[]  str = "I am practicing coding".toCharArray();
		int k= removeWhiteSpaces(str);
		/*
		 * for(int i =0; i<k; i++) { System.out.println(str[i]); }
		 */
		System.out.println(String.valueOf(str).subSequence(0, k));
		
	}

	private static int removeWhiteSpaces(char[] str) {
		int len = str.length;
		int count =0;
		for (int i = 0; i < len; i++) {
			if(str[i] != ' ') {
				str[count]=str[i];
				count++;
			}
		}
		return count;
	}

}
