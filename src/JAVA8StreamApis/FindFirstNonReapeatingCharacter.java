package JAVA8StreamApis;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class FindFirstNonReapeatingCharacter {

	public static void main(String[] args) {
		
		String str = "sfdgrgjrqkjxfdgcvjserjwi";
		
		Optional<Character> result = 
	      str.chars() 
	      //str.chars(): Converts string into stream of ASCII values. Example: "aabbc" → 97, 97, 98, 98, 99 Type: IntStream
	      
	      .mapToObj(c -> (char) c) 
	      //.mapToObj(c -> (char) c): Convert ASCII → actual characters 97 → 'a' 98 → 'b' Now stream becomes: 'a', 'a', 'b', 'b', 'c'
	      
	      .collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting()))
	      //.collect(...): Collect result into a Map
	      //groupingBy(c -> c, counting()):
          //c -> c: Group by character itself
          //counting(): Count how many times each appears
	      //LinkedHashMap::Maintains insertion order
	      //Result after this step: {a=2, b=2, c=1, d=1, e=1}
	      
	      .entrySet()
	      .stream()
	      //.entrySet().stream(): Convert map → stream of entries (a=2), (b=2), (c=1), ...
	      
	      .filter(e -> e.getValue() == 1)
	      //Keep only characters with frequency = 1 (c=1), (d=1), (e=1)
	      
	      .map(Map.Entry::getKey)
	      //Extract only characters: c, d, e
	      
	      .findFirst();
		  //Return first element: c
		
		System.out.println(result);
		//O/P: Optional[q]
	}

}
