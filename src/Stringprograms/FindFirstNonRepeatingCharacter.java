package Stringprograms;

import java.util.HashMap;

public class FindFirstNonRepeatingCharacter {

	public static void main(String[] args) {
		
		String str = "sdfghryrqwgahfxsdce";

		//using brute force: Time Complexity- O(n²)
//		for(int i=0; i<str.length(); i++) {
//			int count = 0;
//			
//			for(int j = 0; j<str.length(); j++) {
//				if(str.charAt(i) == str.charAt(j)) {
//					count++;
//			}
//		}
//		if(count==1) {
//			System.out.println(str.charAt(i));
//			break;
//		}
//	}
		
		//using hashMap: Time Complexity - O(n)
		HashMap<Character, Integer> map = new HashMap<>();
		
		for(int i=0; i<str.length(); i++) {
			char ch= str.charAt(i);
			map.put(ch, map.getOrDefault(ch, 0) + 1);
		}
		
		for(int i= 0; i<str.length(); i++) {
			char ch= str.charAt(i);
			if(map.get(ch)==1) {
				System.out.println(ch);
				break;
			}
		}
		
//Output:y	
		
		
		
		
		
		
		
		
		
		
	}
}
