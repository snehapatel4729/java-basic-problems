package JAVA8StreamApis;

import java.util.Arrays;
import java.util.List;

public class FindEvenNumbers {

	public static void main(String[] args) {
	
		List<Integer> list = Arrays.asList(4,7,2,1,8,3,0,9);
		
		list.stream()
		.filter( n -> n % 2==0)
		.forEach(System.out::println);
		
	}

}
