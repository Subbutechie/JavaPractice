package slate;

public class RemoveCharactersExceptAlphabets {
	
	public static void main(String[] args) {
		String str = "take12% *&u ^$#forward";
		
		remove(str);
		
		String line = "1.Python & 2.Java";
		System.out.println();
		System.out.print(removeUsingStringBuffer(line));
	}

	private static void remove(String str) {
		char[] arr =  str.toCharArray();
		int len = arr.length;
		char[] res = new char[len];
		int count = 0;
		for (int i = 0; i < len; i++) {
			if(Character.isLetter(arr[i])) {
				if(arr[i] != ' ') {
					res[count] = arr[i];
					count++;
				}
				
			}
		}
		for(int i =0; i<count; i++) {
			System.out.print(res[i]);
		}
		
	}
	
	private static String removeUsingStringBuffer(String str) {
		StringBuffer sb = new StringBuffer();
		
		for (int j = 0; j < str.length(); j++) {
			int ascii = (int) str.charAt(j);
			
			if((ascii >= 65 && ascii <= 90)|| (ascii >=97 && ascii<=122)) {
				sb.append(str.charAt(j));
			}
			
		}
		
		return sb.toString();
		
	}

}
