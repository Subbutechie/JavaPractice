package slate;

public class RemoveAnythingExceptAlphabets {
	public static void main(String[] args) {
		String str = "@$.5435T^oday is S2@&*(aturday";
		int len = str.length();
		String res= removeCharacters(str,len);
		System.out.println(res);
		
	}

	private static String removeCharacters(String str, int len) {
		 
		StringBuffer reader = new StringBuffer();

		for(int i=0; i<len;i++) {
			int ascii = (int)str.charAt(i);
			
			if((ascii >= 65 && ascii <=90 )|| (ascii>=97 && ascii<=122)) {
				reader.append(str.charAt(i));
			}
			
		}
		return reader.toString();
	}

}
