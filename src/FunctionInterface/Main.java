package FunctionInterface;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {

	public static void main(String[] args) {
		//Predicate
		Predicate<Integer> p1 = (num) -> num%2==0;
		
		System.out.println(p1.test(10));
		System.out.println(p1.test(7));
		
		Predicate<String> p2 = (str) ->  str.isEmpty();
		
		System.out.println(p2.test(""));
		System.out.println(p2.test("Sneha"));
		//Function
		Function<String, Integer> f1 = (str) -> str.length();
		System.out.println(f1.apply("Sneha"));
		
		Function<Integer, Integer>f2 = (num) -> num*num;
		System.out.println(f2.apply(2));
		//Consumer
		Consumer<String> c1 = (name) -> System.out.println("My name is: "+name);
		c1.accept("Sneha");
		
		Consumer<Integer> c2 = (age) -> System.out.println("My Age is: "+age);
		c2.accept(27);
		//Supplier
		Supplier<Integer> s1 = () -> (int) Math.random();
		System.out.println(s1.get());
		
		Supplier<String> s2 = ()-> {
			String a = "Sneha";
			String b = "Patel";
			return a.concat(b);
		};
		System.out.println(s2.get());
	} 

}
