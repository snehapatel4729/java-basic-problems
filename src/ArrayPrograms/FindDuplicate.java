package ArrayPrograms;

import java.util.HashSet;

public class FindDuplicate {

	public static void main(String[] args) {
	
		int arr[] = {3,6,1,2,5,4,3,6,3,7,8,5,9,0,4};
		
		HashSet<Integer> set = new HashSet<>();
		HashSet<Integer> duplicates = new HashSet<>();
		
		for(int num : arr) {
			if(!set.add(num))
				duplicates.add(num);
		}
		System.out.println(duplicates);
			
		

	}

}
