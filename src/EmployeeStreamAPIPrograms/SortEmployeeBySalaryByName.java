package EmployeeStreamAPIPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortEmployeeBySalaryByName {

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
		
		List<Employee> collect = employees.stream()
		         .sorted((Employee emp1, Employee emp2) -> {
		        	 if(emp1.getSalary()> emp2.getSalary()) {
		        		 return 1;
		        	 } else if(emp1.getSalary()<emp2.getSalary()) {
		        		 return -1;
		        	 } else {
		        		 return emp1.getName().compareTo(emp2.getName());
		        	 }
		        	 
		         })
               .collect(Collectors.toList());
		
		System.out.println(collect);
	}

}
