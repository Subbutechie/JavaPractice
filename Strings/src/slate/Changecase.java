package slate;

public class Changecase {
	public static void main(String[] args) {
		String str = "take u forward IS Awesome";
		method1(str);
	}

	private static void method1(String str) {
		
		String result ="";
		for (int i = 0; i < str.length(); i++) {
			 char ch = str.charAt(i);
			
			if(ch >= 97 && ch<=122){
				ch = Character.toUpperCase(ch);
				result += ch;
			}
			else if(ch>=65 && ch<=90)
			{
				ch = Character.toLowerCase(ch);
				result += ch;
			}
			else if(ch == ' ') {
				result += ch;
			}
			
		}
		
		System.out.println(result);
		
	}

}
