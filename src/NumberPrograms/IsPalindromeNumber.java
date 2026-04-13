package NumberPrograms;

public class IsPalindromeNumber {

	public static void main(String[] args) {
		
		int num = 132231;
		int original = num;
		int rev = 0;

		while(num >0) {
			int digit = num % 10;
			rev = rev * 10 + digit;
			num = num/10;
			System.out.println(rev);
			
			
		}
		if(rev==original)
			System.out.println("Is Palindrome number");
		else
			System.out.println("Is not Palindrome number");
	}

}
