package JAVA8StreamApis;

import java.util.Arrays;
import java.util.Comparator;

public class FindSecondHighestLengthOftheWord {

	public static void main(String[] args) {
		
		String s = "I am learning Stream API in Java";
		
		int result = Arrays.stream(s.split(" ")).map(x->x.length())
				     .sorted(Comparator.reverseOrder()).skip(1)
				     .findFirst().get();
		
		System.out.print(result);

	}

}
