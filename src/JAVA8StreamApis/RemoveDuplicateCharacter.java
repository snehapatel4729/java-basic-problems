package JAVA8StreamApis;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateCharacter {

	public static void main(String[] args) {
		
		String s = "sfdfgerascxzczasxzxxzaxc";
		
		 s.chars().distinct().mapToObj(x->(char)x).forEach(System.out::print);
		
		//Arrays.stream(s.split("")).distinct().forEach(System.out::print);
		
//		List<String> result = Arrays.stream(s.split("")).distinct().collect(Collectors.toList());
//		
//	    System.out.println(result);	
	}

}
