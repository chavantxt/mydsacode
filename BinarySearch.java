import java.util.*;

public class BinarySearch {

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

	public static int binarySearch(int arr[]) {
		// Array should be sorted in Asecbeding order
		int start = 0;
		int end = arr.length - 1;
		int target = 4;

		while (start <= end) {
			int mid = start + (end - start) / 2;
			System.out.println(arr[mid]);
			if (target == arr[mid])
				return mid;
			else if (target < arr[mid])
				end = mid - 1;
			else
				start = mid + 1;
		}

		return -1;
	}

	public static int reverseBinarySearch(int arr[]) {
		// Array Should be sorted in Descebbding order
		int start = 0;
		int end = arr.length - 1;
		int target = 3;
		while (start <= end) {

			int mid = (start + end) / 2;
			if (arr[mid] == target)
				return mid;
			else if (arr[mid] < target)
				start = mid + 1;
			else
				end = mid - 1;

		}
		return 0;
	}

	public static void firstLastOccuranceOfElement(int arr[]) {
		int start = 0;
		int end = arr.length - 1;
		int target = 6;
		int result = 0;
		while (start <= end) {

			int mid = (start + end) / 2;
			if (arr[mid] == target) {
				end = mid - 1;
				result = mid;
			} else if (arr[mid] < target)
				start = mid + 1;
			else
				end = mid - 1;

		}
		System.out.println("Array Element : " + result);
	}

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5, 6, 6, 6, 6, 6, 6, 6, 6, 6, 7, 8 };
		// System.out.print("Index of a peak point is " + findPeak(arr, arr.length));
		// System.out.print("Search : " + binarySearch(arr));
		//firstLastOccuranceOfElement(arr);

	}

}
