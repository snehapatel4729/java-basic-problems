package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeSort {

	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<>();

		empList .add(new Employee(101, "Rahul", 50000));
		empList .add(new Employee(102, "Amit", 70000));
		empList .add(new Employee(103, "Sneha", 45000));

        // Sort employees by salary (ascending)
//        Collections.sort(empList, (e1, e2) ->
//        Double.compare(e1.getSalary(), e2.getSalary()));
		

        
        // Sort employees by salary (descending)
        Collections.sort(empList, (e1, e2) ->
        Double.compare(e2.getSalary(), e1.getSalary()));
	
     

        for (Employee emp : empList) {
            emp.display();
        }
    }
	}


