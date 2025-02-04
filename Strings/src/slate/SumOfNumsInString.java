package slate;

public class SumOfNumsInString {
	public static void main(String[] args) {
		String str = "1xyz23";
		System.out.println("Resultant sum is: ");
		System.out.println(resultSum(str));
	}

	private static int resultSum(String str) {
		
		String tempStr = "0";
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			
			if(Character.isDigit(c)) {
				tempStr += c;
			}
			else {
				sum += Integer.parseInt(tempStr);
				tempStr = "0";
			}
		}
		return sum+ Integer.parseInt(tempStr);
	}

}
