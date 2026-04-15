package JAVA8StreamApis;

import java.util.Map;
import java.util.stream.Collectors;

public class CountFrequencyOfCharacter {

	public static void main(String[] args) {
		
		String str = "ascdvfwedasaaxd";
		
		Map<Character, Long> map = 
         str.chars()  //Converts string into stream of ASCII values EX: "aabbc" → 97, 97, 98, 98, 99 Type: IntStream
         .mapToObj(c -> (char) c) //Convert ASCII → actual characters 97 → 'a' 98 → 'b' Now stream becomes: 'a', 'a', 'b', 'b', 'c'
         .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
		//collect(...): Collect result into a Map
		//groupingBy(c -> c, counting()): c -> c: Group by character itself
		//counting(): Count how many times each appears
		System.out.println(map);
	}

}
//O/P: {a=4, c=1, s=2, d=3, e=1, f=1, v=1, w=1, x=1}