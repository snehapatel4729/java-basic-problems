package JAVA8StreamApis;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DivideTheNumberListintoEvenAndOdd {

	public static void main(String[] args) {
		
		//Key:      true     false
       //Values:    {2,4}    {1,3,5}
		
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		
		Map<Boolean, List<Integer>> result = list
				                             .stream()
				                             .collect(Collectors.partitioningBy(n -> n%2 == 0));
		
		System.out.println(result);
		
	}

}
