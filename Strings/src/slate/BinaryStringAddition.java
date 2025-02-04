package slate;

import java.util.ArrayList;

public class BinaryStringAddition {

	public static void main(String[] args) {
		String s1 = "1101";
		String s2 = "111";
		
		System.out.println(add(s1, s2));
	}

	private static String add(String s1, String s2) {
				
		s1 = trimleadingzeroes(s1);
		s2 = trimleadingzeroes(s2);
		
		int n = s1.length();
		int m = s2.length();
		
		//swap the strings if s1 is smaller length
		if(n<m) {
			String temp = s1;
			s1 = s2;
			s2 = temp;
			int tempLen = n;
            n = m;
            m = tempLen;
		}
		
		int j = m-1;//for s2
		int carry = 0;
		ArrayList<Integer> result = new ArrayList<Integer>();
		
		//traversing from the end
		for(int i = n-1; i>=0; i--) {
			
			//current bit of s1
			int bit1 = Integer.parseInt(String.valueOf(s1.charAt(i)));
			int bitsum = bit1 + carry;
			if(j >= 0) {
				int bit2 = Integer.parseInt(String.valueOf(s2.charAt(j)));
				bitsum += bit2;
				j = j-1;
			}
			
			//calculate the result bit and update carry
			int bit = bitsum %2;
			carry = bitsum /2;
			
			result.add(bit);
		}
		
		if(carry>0) {
			result.add(1);
		}
		
		StringBuilder sb = new StringBuilder();
        for (int i = result.size() - 1; i >= 0; i--) {
            sb.append(result.get(i));
        }
		
		return sb.toString();
		
	}

	private static String trimleadingzeroes(String s) {
		int n = s.length();
		int start = 0;
		for(int i = 0 ; i<n; i++ ) {
			if(s.charAt(i)!= '0') {
				start = i;
				break;
			}
		}
		
		return s.substring(start);
	}

}
