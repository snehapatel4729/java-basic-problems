package equalsVShashCode;

public class Test {

	public static void main(String[] args) {
	Employee e1 = new Employee();
	e1.id = 1;
	e1.name = "Sneha";
	
	Employee e2 = new Employee();
	e2.id = 1;
	e2.name = "Sneha";
	
	System.out.println(e1.equals(e2));
	
	}

}
