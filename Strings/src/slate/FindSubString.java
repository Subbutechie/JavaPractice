package slate;

public class FindSubString {

	public static void main(String[] args) {

		String str = "takeuforwardISAwesome";
		String substr = "forward";
		//method1(str, substr);
		
		//what if there are no spaces in the given String
		//method2(str,substr);
		System.out.println(method3(str,substr));
	}

	private static int method3(String str, String substr) {
		
		int N = str.length();
		int M = substr.length();
		
		
		for(int i= 0;i<N;i++) {
			int temp = i;
			int j = 0;
			for(j =0;j<M;j++) {
				if(str.charAt(temp) != substr.charAt(j)) {
					break;
				}
				temp++;
			}
			
			if(j == M) {
				return i;
			}
			
		}
		return -1;
	}

	private static void method2(String str, String substr) {
		
		System.out.println("SubString initial position: "+str.indexOf(substr));
	}

	private static void method1(String str, String substr) {

		int len = str.length();
		int initPos = 0;
		int i = 0, j = 0;
		while (j <= len) {
			if (j < len && str.charAt(j) != ' ') {
				j++;
			} else  {
				if (str.substring(i,j).equalsIgnoreCase(substr)) {
					initPos = i;
					System.out.println("Substring starts at " + initPos + " position ");
					break;
				}
				j++;
				i = j;
			} 
			
		}
		if(initPos == 0) {
			System.out.println("Substring not found");
		}
		
	}

}
