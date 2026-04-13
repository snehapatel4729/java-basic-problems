package ArrayPrograms;

public class MoveZeros {

	public static void main(String[] args) {
		
		int arr[] = {3,0,1,2,0,9,7,8,5,0,9};
		int index = 0;
		
		// Step 1: Move non-zero elements
		for(int i=0; i<arr.length-1; i++) {
			if(arr[i]!=0) {
				arr[index]=arr[i];
				index++;
			}
		}
		
		// Step 2: Fill remaining with zeros
		while(index < arr.length) {
			arr[index]=0;
			index++;
		}
		
		// Print result
		for(int num : arr) {
			System.out.print(num +" ");
		}
	}

}
