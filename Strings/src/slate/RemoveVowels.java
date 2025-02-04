package slate;

public class RemoveVowels {
	
	
	public static void main(String[] args) {
		String str = "take u forward";
		//removeVowels(str);
		removeVowelsnew(str);
		removeVowelsBySB(str);
	}

	private static void removeVowels(String str) {
		
		int len = str.length();
		String newstr="";
		for(int i=0; i<len; i++) {
			char ch= str.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'O' || str.charAt(i) == 'U') {
				 newstr += str.substring(0,i)+str.substring(i+1);
				 i--;
			}	
		}
		
		System.out.println(newstr);
	}
	
	private static void removeVowelsnew(String str) {
		
		String newStr = "";
		String comp = "aeiouAEIOU";
		for (int i = 0; i < str.length(); i++) {
			
			String ch = String.valueOf(str.charAt(i));
			if(!comp.contains(ch)) {
				newStr +=ch;
			}
			
		}
		
		System.out.println(newStr);
	}
	
	private static void removeVowelsBySB(String str) {
		
		StringBuilder sb= new StringBuilder();
		
		
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if((ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u' &&
		            ch != 'A' && ch != 'E' && ch != 'I' && ch != 'O' && ch != 'U')){
				sb.append(ch);
			}
		}
		System.out.println(sb);
	}
	
	

}
