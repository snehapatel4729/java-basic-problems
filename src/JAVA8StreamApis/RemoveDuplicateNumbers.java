package JAVA8StreamApis;

import java.util.Arrays;
import java.util.List;

public class RemoveDuplicateNumbers {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,4,2,1,7,8,9,4);
		
		list.stream().distinct().forEach(System.out::println);

	}

}
