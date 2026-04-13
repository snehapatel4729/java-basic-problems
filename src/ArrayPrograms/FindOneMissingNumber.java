package ArrayPrograms;

public class FindOneMissingNumber {

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,5};
		int n = 5;
		
		int expectedSum = n * (n+1)/2;
		
		int actualSum = 0;
		for(int i=0; i<=arr.length-1; i++) {
			actualSum = actualSum + arr[i]; 
		}
		int value = expectedSum - actualSum;
		System.out.println(value);
		

	}

}
