package JAVA8StreamApis;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FindSecondHighestWord {

	public static void main(String[] args) {
		
		String s = "I am learning Stream API in Java";
		
		String result = Arrays.stream(s.split(" "))
				        .sorted(Comparator.comparing(String::length).reversed())
				        .skip(1).findFirst().get();
		
		System.out.print(result);
				        
	
	}

}
