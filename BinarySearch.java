import java.util.*;

public class BinarySearch {

	public static int binarySearch(int arr[]) {
		//Array should be sorted 
		int start = 0;
		int end = arr.length - 1;
		int target = 4;
		
		while (start <= end) {
			int mid = start + (end - start) / 2;
			System.out.println(arr[mid]);
			if (target < arr[mid])
				return mid;
			else if (target < arr[mid])
				end = mid - 1;
			else
				start = mid + 1;
		}

		return -1;
	}

	static int findPeak(int arr[], int n) {
		if (n == 1)
			return 0;
		if (arr[0] >= arr[1])
			return 0;
		if (arr[n - 1] >= arr[n - 2])
			return n - 1;
		// Check for every other element
		for (int i = 1; i < n - 1; i++) {
			// Check if the neighbors are smaller
			if (arr[i] >= arr[i - 1] && arr[i] >= arr[i + 1])
				return i;
		}
		return 0;
	}

	public static void main(String[] args) {

		int arr[] = { 1, 2, 2, 3, 4, 5, 6, 7, 8};
		//System.out.print("Index of a peak point is " + findPeak(arr, arr.length));
		System.out.print("Search : " + binarySearch(arr));
	}

}
