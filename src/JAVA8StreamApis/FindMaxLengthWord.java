package JAVA8StreamApis;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class FindMaxLengthWord {

	public static void main(String[] args) {
		
		String s = "I am learning Stream API in Java";
		
		String result = Arrays.stream(s.split(" "))
				.max(Comparator.comparing(String::length)).get();
		
		System.out.println(result);
		System.out.println("------------------------------------------");
		
		//Another Example: Find the longest string in a list
		
		List<String> list = new ArrayList<>(Arrays.asList("Java", "SpringBoot", "API"));
		
		Optional<String> output = list.stream()
				                      .max(Comparator.comparing(String::length));
		
		if(output.isPresent()) {
			System.out.println(output.get());
		}

	}

}
