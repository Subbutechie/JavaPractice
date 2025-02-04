package slate;

public class ConvertStrToInt {

	public static void main(String[] args) {
		
		String str = "  -0012gfg4";
		toInt(str);
	}
	
	//without using any built in functions
	private static void  toInt(String str) {
		int n = str.length();
		String newStr = "";
		boolean isminus = false;
		int temp =0 ;
		int num = 0;
		for(int i =0 ; i<n; i++) {
			char ch = str.charAt(i);
			
			if(ch == '-') {
				isminus = true;
			}
			
			if(ch == ' '|| ch != ch-'0') {
				continue;
			}
			else {
				temp = ch-'0';
				num = num * 10 + temp;
			}
			if(isminus) {
				num *= -1;
			}
			
		}
		System.out.println(num);
		
		
		
	}

}
