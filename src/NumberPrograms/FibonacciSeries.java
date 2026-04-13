package NumberPrograms;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		int num = 10;
        int a = 0;
        int b = 1;
        int count = 0;
        System.out.print(a+" "+b+" ");
        
        for(int i = 2;i<=num; i++) {
         int next = a+b;
         System.out.print(next +" ");
         
         a = b;
         b = next; 
        }
       
	}

}
