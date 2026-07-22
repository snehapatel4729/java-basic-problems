package MethodRefernce;

public class Main {

	public static void main(String[] args) {
		//1.Using Lambda
		Calculator c1 = (a,b) -> MathOperation.add(a, b);
        System.out.println(c1.calculate(10, 20));
        //Using Static Method Reference
        Calculator c2 = MathOperation::add;
        System.out.println(c2.calculate(20, 30));
        
        //2.Using Lambda
        Calculator c3 = (a,b) -> MathOperation.multiply(a, b);
        System.out.println(c3.calculate(3, 5));
        //UsingStatic Method Reference
        Calculator c4 = MathOperation::multiply;
        System.out.println(c4.calculate(4, 6));
        
        //3.Using Lambda
        MathOperation m1 = new MathOperation();
        Validator v1 = (num) -> m1.isPositive(num);
        System.out.println(v1.validate(10));
        System.out.println(v1.validate(-2));
        //Using Instance Method Reference(Of a Particular Object)
        Validator v2 = m1::isPositive;
        System.out.println(v2.validate(12));
        System.out.println(v2.validate(0));
        
        //4.Using Lambda
        StringOperations s1 = (str) -> str.length();
        System.out.println(s1.operate("Sneha"));
        //Using Instance Method Reference(Of an Arbitrary Object)
        StringOperations s2  = String::length;
        System.out.println(s2.operate("Sneha"));
        //Using Lambda
        StringOperations s3 = (str) -> {
        	return str.hashCode();
        };
        System.out.println(s3.operate("Sneha"));
        //Using Instance Method Reference(Of an Arbitrary Object)
        StringOperations s4 = String::hashCode;
        s4.operate("Sneha");
        System.out.println(s4.operate("Patel"));
        
        //5.Using Lambda
        Creator<User> x1 = (name) -> {
        	return new User(name);
        };
        User u1 = x1.create("Jaimin");
        System.out.println(u1.name);
        //Using Constructor
        Creator<User> x2 = User::new;
        User u2 = x2.create("Jaimin");
        System.out.println(u2.name);
        //Using Lambda
        Creator<Product> x3 = (name) -> {
        	return new Product(name);
        };
        Product p1 = x3.create("Apple watch");
        System.out.println(p1.productName);
        //Using Constructor
        Creator<Product> x4 = Product::new;
        Product p2 = x4.create("Samsung watch");
        System.out.println(p2.productName);
        
        
        
        
	}

}
