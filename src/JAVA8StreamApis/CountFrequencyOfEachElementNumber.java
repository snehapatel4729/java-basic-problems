package JAVA8StreamApis;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountFrequencyOfEachElementNumber {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(3,2,4,5,2,1,4,1,5,2,5);
		
		Map<Integer, Long> result= list.stream().collect(Collectors.groupingBy(n -> n, Collectors.counting()));
        // keys              values	
	   //   3     -->         Count(3)
	   //   2     -->         Count(2)
	   //   4     -->         Count(4)
	   //   5     -->         Count(5)
	   //   1     -->         Count(1)
		
		System.out.println(result);
	
	}

}
