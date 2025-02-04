package slate;

import java.lang.Character.Subset;

public class CapitalizeFirstAndLast {
	public static void main(String[] args) {
		String str = "take u forward is awesome";
		Capitalize(str);
	}

	private static void Capitalize(String str) {
		
		String[] arr = str.split(" ");
		StringBuilder sb = new StringBuilder();
		String res = "";
		for(String newStr : arr) {
			int len = newStr.length();
			if(len>0) {
				char firstChar = Character.toUpperCase(newStr.charAt(0));
				char lastChar = Character.toUpperCase(newStr.charAt(len-1));
				
				if(len==1) {
					sb.append(firstChar);
				}
				else {
					sb.append(firstChar).append(newStr.substring(1,len-1)).append(lastChar);
				}
			}
			sb.append(" ");
			
			
			
		}
		System.out.println(sb.toString().trim());
		
	}

}
