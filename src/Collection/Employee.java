package Collection;

public class Employee {

	private int id;
	private String name;
	private double salary;
	
	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
    public double getSalary() {
        return salary;
    }
	
	public void display() {
		System.out.println(id + " " +  name + " " +  salary); 
	}
	
	
}
