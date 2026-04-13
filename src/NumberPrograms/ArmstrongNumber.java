package NumberPrograms;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		int num = 153;
		int original = num;
		int sum = 0;
		
		while(num > 0) {
			int digit  = num % 10;
			sum = sum +(digit * digit * digit);
			num = num / 10;
		}
		if(sum == original)
			System.out.println("Armstrong Number");
		else
			System.out.println("Not Armstrong Number");
	}

}
//For 153:
//
//Count digits → 3
//Extract digits:
//3 → 3³ = 27
//5 → 5³ = 125
//1 → 1³ = 1
//Sum = 153
//Compare with original