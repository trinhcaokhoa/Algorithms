import java.util.Arrays;
public class HeapSort {
	// Build a heap from arr by using heapify from bottom up
	public void build_heap(int arr[]) {
		int size = arr.length;
		for(int i = arr.length/2 -1; i >= 0; i--) {
			heapify(arr, size, i);
		}
		
		// Remove the root element and replace by the last one
		for (int i=arr.length-1; i>=0; i--){

			 //arrA[0] is a root of the heap and is the max element in heap
			 int x = arr[0];
			 arr[0] = arr[i];
			 arr[i] = x;

			 // call max heapify on the reduced heap
			 heapify(arr, i, 0);
		}
	}
	
	// Maintain the Max_heap property
	public void heapify(int arr[],int size, int index) {
		int lc = index*2 + 1;
		int rc = index*2 + 2;
		int largest = index;
		if( lc < size && arr[lc] > arr[index]) {
			largest = lc; 
		}
		if(rc < size && arr[rc] > arr[largest]) {
			largest = rc;
		}
		if( largest != index){
			int swap = arr[index];
			arr[index] = arr[largest];
			arr[largest] = swap; 
			
			// Recursive the heapify to heap the whole tree
			heapify(arr,size, largest);
			
		}
	}

public static void main(String args[]) {
	 int arrA[] = {2,3,7,1,8,5,6};

	 System.out.println("Original array is: " + Arrays.toString(arrA));
	 HeapSort heapSort = new HeapSort();
	 heapSort.build_heap(arrA);
		 

	 System.out.println("Sorted array is (Heap Sort): " + Arrays.toString(arrA));
		 }
		}
