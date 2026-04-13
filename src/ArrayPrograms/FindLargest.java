package ArrayPrograms;

public class FindLargest {

	public static void main(String[] args) {
		
		int arr[] = {23,65,12,3,1,98,45};
		int largest = arr[0];
		
		//tip: You don’t need to start loop from 0 again since you already took arr[0].
		for(int i = 1; i<arr.length; i++) {
			if(largest<arr[i])
				largest = arr[i];
		}
		System.out.println(largest);
	}

}

//Output: 98