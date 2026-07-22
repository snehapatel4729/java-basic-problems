package equalsVShashCode;

public class Employee {

int id;
String name;

public boolean equals(Object obj) {
    Employee e = (Employee) obj;
    if(e.id == this.id && e.name.equals(this.name)) {
    	return true;
    } else {
    	return false;
    }
}
}
