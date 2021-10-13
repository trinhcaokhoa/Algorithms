// These code has been referenced from GeeksforSeeks. KhoaTrinh coded and implemented  after reviewing 
import java.util.Random;
import java.util.Scanner;
class MergeSort
{
    // Merges two subarrays of arr[].
    // First subarray is arr[l..m]
    // Second subarray is arr[m+1..r]
	void merge( int arr[], int lo, int mid, int hi) {
		// Size of subarray
		int n1 = mid - lo + 1;
		int n2 = hi - mid;
		
		// Declare subarray
		int L[] = new int[n1];
		int R[] = new int[n2];
		
		// Copy array to new array 
		for (int i = 0; i < n1; ++i ) {
			L[i] = arr[ lo + i];
		}
		for (int j = 0; j < n2; ++j) {
			R[j] = arr[ mid + 1 + j];
		}
		
		// Assign the index of sub array
		int i = 0;
		int j = 0;
		
		// Merge the sub-sorted array
		int k = lo;
		while(i < n1 && j < n2) {
			if(L[i] <= R[j]) {
				arr[k] = L[i];
				i++ ;
			}
			else {
				arr[k] = R[j];
				j++;
			}
			k++;
		}
		while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
		 while (j < n2) {
	            arr[k] = R[j];
	            j++;
	            k++;
	        }
		
	}
	
	// Function to sort arr[1..n] using merge()
	void sort ( int arr[], int lo, int hi) {

		if( lo < hi ) {
			int mid =lo + (hi -lo)/2;
			sort(arr, lo, mid);
			sort(arr, mid+1, hi);
			merge(arr, lo, mid, hi);
			
		}
	}

    /* A utility function to print array of size n */
	static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    static int[] createarray() {
    	 Random rd = new Random(); // creating Random object
	     int[] arr = new int[20];
	     for (int i = 0; i < arr.length; i++) {
	    	 arr[i] = rd.nextInt(); 
	     }
	     return arr;
	     
	}
 
    // Driver code
    public static void main(String[] args) {
    	// Create array
		int arr[] = createarray();
		
		// Sort the array 
		MergeSort object = new MergeSort();
		object.sort(arr, 0, arr.length - 1);
		
		
		
		// Display the sorted array
		printArray(arr);
		}
	}
	