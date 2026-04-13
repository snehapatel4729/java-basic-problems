package ArrayPrograms;

public class FindLargestAndSmallestElement {

	public static void main(String[] args) {
		
		int arr[]= {34,76,12,99,87,3,1,90,24};
		int smallest = arr[0];
		int largest = arr[0];
		
		for(int i=0; i< arr.length-1; i++) {
			if(largest<arr[i]) {
				
				largest = arr[i];
				
			}else if(smallest>arr[i] ) {
			smallest = arr[i];
		}
		

	}
		System.out.println(largest +" "+smallest);
	}
}
