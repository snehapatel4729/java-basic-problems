package EmployeeStreamAPIPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class FindHighestPaidEmployeeDepartmentwise {

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
		
		Map<String, Optional<Employee>> result = employees.stream()
				                                 .collect(Collectors.groupingBy(emp -> emp.getDepartment(),
				                                	      Collectors.maxBy(Comparator.comparingInt(emp -> emp.getSalary()))));
   
		System.out.println(result);
	}

}
