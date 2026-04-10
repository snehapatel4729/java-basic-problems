package NumberPrograms;

public class IsPrime {

	public static void main(String[] args) {
		
		int num = 11;
		boolean isPrime = true;
		
		if(num <=1) {
			isPrime = false;
			
		}else {
			
			for(int i = 2; i< num; i++) {
				if(num%i==0)
					isPrime = false;
			}
			
			if(isPrime)
				System.out.println("Is Prime");
			else
				System.out.println("Is not Prime");
			}
		
	
			
	}

}
