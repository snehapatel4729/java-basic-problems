package EmployeeStreamAPIPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FindTopTwoHighestPaidEmployee {

	public static void main(String[] args) {
	
		List<Employee> employees = new ArrayList<>(Arrays.asList(
				new Employee("Sneha", "IT", 50000),
				new Employee("Jaimin", "Purchase", 70000),
				new Employee("Abhishek", "IT", 40000),
				new Employee("Tina", "HR", 45000),
				new Employee("Esha", "Finance", 60000),
				new Employee("Naman", "HR", 55000),
				new Employee("Sachit", "IT", 80000),
				new Employee("Pushp", "Marketing", 50000),
				new Employee("Sumit", "Marketing", 52000)
				));
		
		List<Employee> result = employees
				                .stream()
				                .sorted(Comparator.comparingInt(emp  -> -1 * emp.getSalary()))
				                .limit(2)
				                .collect(Collectors.toList());
		
		System.out.println(result);

	}

}
