package slate;

import java.util.HashMap;
import java.util.Map;

public class PrintAllTheDuplicates {
	
	public static void main(String[] args) {
		String str = "asgadsgg";
		printDups(str);
	}

	private static void printDups(String str) {
		
		char[] ch = str.toCharArray();
		HashMap<Character, Integer> map = new HashMap<Character,Integer>();
		for(int i =0; i<ch.length; i++) {
			map.put(ch[i], map.getOrDefault(ch[i], 0)+1);
		}
		
		for(Map.Entry<Character,Integer> ans:map.entrySet()) {
			if(ans.getValue()>1) {
				
				System.out.print(ans.getKey()+","+"\n");
			}
		}
		System.out.println("Using streams: ");
		//Using streams
		map.entrySet().stream().filter(x -> x.getValue()>1).forEach(x -> System.out.println(x.getKey()));
	}
}
