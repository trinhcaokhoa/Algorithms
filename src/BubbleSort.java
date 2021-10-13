import java.util.Scanner;
import java.util.Random;

public class BubbleSort {
	public static void Bubble( int arr[], int high) {
		while( high >= 1) {
			for (int i = 0; i<= high; i++) {
				int j = i + 1;
				// if arr[i] > arr[j] => swap 2 element
				if(arr[i] >= arr[j]) {
					int swap = arr[i];
					arr[i] = arr[j];
					arr[j] = swap;
				}
			}
			high--;
		}
	}

	public static void main(String[] args) {
		// Create a new array
		 Random rd = new Random(); // creating Random object
	     int[] arr = new int[20];
	     for (int i = 0; i < arr.length; i++) {
	    	 arr[i] = rd.nextInt(); 
	         
	      }
		
		Bubble(arr, arr.length -2);
		for (int i = 0;i < 20; i++) {
			System.out.print(arr[i]+' '+' ');
		}
	}
}
		


