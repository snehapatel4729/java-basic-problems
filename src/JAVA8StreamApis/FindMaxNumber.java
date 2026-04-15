package JAVA8StreamApis;

import java.util.Arrays;
import java.util.List;

public class FindMaxNumber {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,4,23,543,123,53,2,75,453,25,73);
		
		int max = list.stream().max(Integer::compare).get();
		
		System.out.println(max);

	}

}
