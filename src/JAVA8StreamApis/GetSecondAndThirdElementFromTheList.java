package JAVA8StreamApis;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GetSecondAndThirdElementFromTheList {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(10, 20, 30, 40, 50);
		
		List<Integer> result = list
				               .stream()
				               .skip(1)  // 20, 30, 40, 50
				               .limit(2)  // 20, 30
				               .collect(Collectors.toList());
		
		System.out.println(result);

	}

}
