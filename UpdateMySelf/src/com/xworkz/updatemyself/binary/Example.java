package com.xworkz.updatemyself.binary;

public class Example {
	
	package com.xworkz.updatemyself.binary;

	public class BinarySearch {

		public static int binarySearch(int arr[], int target) {
			int low = 0;// represents the start of the array (index 0) =0
			int high = arr.length - 1;// represents the last index of the array. =9

			while (low <= high) {
				int mid = (low + high) / 2; // mid will be calculated as (low + high) / 2.
				// mid = (0 + 1) / 2 = 4
//				(so arr[4] = 5)
				// In the second iteration (if we need it): (low=0, high=3) -> mid = (0 + 3) / 2
				// = 1 (so arr[1] = 2)
				// In the third iteration (if needed): (low=2, high=3) -> mid = (2 + 3) / 2 = 2
				// (so arr[2] = 3)

				if (arr[mid] == target) { // arr[0] = 1,arr[1] = 2.
					return mid; // 0,1,2,3,4,5,6,7,8 //index
				}

				if (arr[mid] > target) { // arr[0] > 1.
					high = mid - 1; // 8=arr[0]-1
				} else {

					low = mid + 1; //0=0+1,0=1+1,0=2+1,0=3+1
				}
			}

			return -1;
		}

		public static void main(String[] args) {
			int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 }; // Example sorted array
			int target = 5; // Element we are searching for

			int result = binarySearch(arr, target);

			// Display the result
			if (result == -1) {
				System.out.println("Element not found");
			} else {
				System.out.println("Element found at index: " + result);
			}
		}
	}

	
	public static void main(String[] args) {
		
		int i = 0;
		while (i > 3) {
		    System.out.println("Value of i: " + i);
		    i++;
		}
		
		int num = 3;
		for(int j=0;j<num;j++) {
			System.out.println(num);
			System.out.println("entered");
		}
		
		int k = 0;
		do {
		    System.out.println("Value of i: " + k);
		    k++;
		} while (k < 3);

	}

}
