package JAVA8StreamApis;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class FindSecondHighestNumber {

	public static void main(String[] args) {
	
		List<Integer> list = Arrays.asList(20,10,10,45,30,45,5,20);
		
		Optional<Integer> result = list
				               .stream()
				               .distinct()  //20,10,45,30,5
				               .sorted(Comparator.reverseOrder())  //45, 30, 20, 10, 5
				               .skip(1)   //30,20,10,5
				               .findFirst(); // 30    we can use limit(1) too
		
		System.out.println(result.get());

	}

}
