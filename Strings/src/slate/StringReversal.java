package slate;

import java.util.Stack;

public class StringReversal {
	public static void main(String[] args) {
		String str = "Neither Me";
		System.out.println(reverse(str));
		System.out.println(reverseString(str));
		System.out.println(reverseStringUsingStack(str));
		
		
		int i = 0;
		int j = str.length()-1;
		System.out.println(StringReversalUsingStringBuilder(str,i,j));
		
	}
	
	
	private static StringBuffer reverse(String str) {
		
		StringBuffer sb= new StringBuffer(str);
		sb.reverse();
		return sb;
	}
	
	static String reverseString(String str) {
		char[] arr = str.toCharArray();
		
		for (int i = 0; i < arr.length/2; i++) {
			char temp = arr[i];
			arr[i] = arr[arr.length-i-1];
			arr[arr.length-i-1] = temp;
		}
		
		return new String(arr);
	}
	
	private static  String reverseStringUsingStack(String str) {
		char[] arr = str.toCharArray();
		
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < arr.length; i++) {
			stack.push(arr[i]);
		}
		
		for (int s = 0; s < arr.length; s++) {
			arr[s] = stack.pop();
		}
		
		return new String(arr);
	}
	
	private static String StringReversalUsingStringBuilder(String str, int i, int j) {
		StringBuilder sb = new StringBuilder(str);
		while(i<j) {
			sb.setCharAt(i, str.charAt(j));
			sb.setCharAt(j, str.charAt(i)); 
			i++;
			j--;
		}
		return sb.toString();
		
		
	}

}
