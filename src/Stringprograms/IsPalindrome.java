package Stringprograms;

public class IsPalindrome {

	public static void main(String[] args) {
		
		String str = "madam";
		String original = str;
		String rev = "";
		
		for(int i = str.length()-1; i>=0; i--) {
			rev = rev + str.charAt(i);
			
		}
		if(rev.equals(original))
			System.out.println("String is Palindrome");
		else
			System.out.println("String is not Palindrome");

	}

}
