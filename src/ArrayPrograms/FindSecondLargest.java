package ArrayPrograms;

public class FindSecondLargest {

	public static void main(String[] args) {
		
		int arr[] = {2,6,43,21,34,98,7,45,3,87,1};
		int largest = arr[0];
		int secondLargest = arr[1];
		
		for(int i = 1; i<arr.length; i++) {
			if(arr[i]>largest) {
				secondLargest = largest;
				largest = arr[i];
		}
			else if(arr[i]>secondLargest && arr[i]<largest)
				secondLargest = arr[i];
		}
		System.out.println(secondLargest);

	}

}
