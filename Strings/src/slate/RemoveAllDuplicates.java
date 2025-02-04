package slate;

public class RemoveAllDuplicates {
	
	public static void main(String[] args) {
		String str = "cbacdcbc";
		removeDuplicates(str);
		removeDuplicateLetters(str);
	}

	private static void removeDuplicateLetters(String str) {
		boolean[] arr = new boolean[26];
		String ans ="";
		for(int i =0; i<str.length(); i++) {
			if(arr[str.charAt(i)-'a']==false) {
				ans += str.charAt(i);
				arr[str.charAt(i)-'a'] = true;
			}
		}
		System.out.println(ans);
	}

	private static void removeDuplicates(String str) {
		
		String tempstr = "";
		for(int i =0 ; i<str.length(); i++) {
			String ch = String.valueOf(str.charAt(i));
			if(!tempstr.contains(ch)) {
				tempstr += ch;
			}
		}
		System.out.println(tempstr);
	}
	
	
			
}
