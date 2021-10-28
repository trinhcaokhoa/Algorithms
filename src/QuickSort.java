import java.util.Arrays;
import java.util.Random;

public class QuickSort {
	// Recursive call partition ( Conquer)
	public static void quick_sort(int arr[],int low,int high) {
		if (low < high) {
			int mid = partition(arr, low, high);
			quick_sort(arr, low, mid-1);
			quick_sort(arr, mid+1, high);
		}
	}
	
	// Partition by pivot (Divide) 
	public static int partition(int arr[], int low, int high) {
		int pivot = arr[high];
		int i = low -1;
		for( int j = low; j <= high-1; j++) {
			if (arr[j] < pivot) {
				i++;
				// Swap 
				int swap = arr[j];
				arr[j] = arr[i];
				arr[i] = swap;
			}
		}
		int swap = arr[high];
		arr[high] = arr[i+1];
		arr[i+1] = swap;
		
		return i+1;
	}

	public static void main(String[] args) {
		// Create a new array
		int arr[] = {2,3,7,1,8,5,6};
	         
		
		
		System.out.println("Original array is: " + Arrays.toString(arr));
		quick_sort(arr,0, arr.length-1);
		System.out.println("Sorted array is: " + Arrays.toString(arr));
		}
}

