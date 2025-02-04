package slate;

public class CountVCS {

	public static void main(String[] args) {
		
		String str = "India won the cricket match";
		countVCS(str);
		
	}

	private static void countVCS(String str) {
		str = str.toLowerCase();
		int vowels = 0, consonants = 0, whitespaces= 0;
		for(int i= 0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(ch == 'a'|| ch == 'e' ||ch == 'i' ||ch == 'o' || ch == 'u' ) {
				vowels++;
			}
			else if(ch >= 'a' && ch <= 'z') {
				consonants++;
			}
			else if(ch == ' ') {
				whitespaces++;
			}

		}
		
		System.out.print("number of vowels "+vowels+"\n"
						+"number of Consonants "+consonants+"\n"
						+"number of whitespaces "+whitespaces);
		
	}
}
