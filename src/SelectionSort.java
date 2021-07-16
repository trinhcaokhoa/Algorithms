import java.util.Scanner;
import java.util.*;

public class SelectionSort {
	public static void selection( int arr[]){
		int n = arr.length;
		for (int i = 0; i<n-1; i++) {
			int min = i;
			int compare = i+1;
		
			while(compare < n-1) {
				if (arr[compare] < arr[min]) {
					min = compare;
					
				}
				compare++;
			}
			int sub = arr[i];
			arr[i] = arr[min];
			arr[min] = sub;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] list_number = {3, 7, 9, 4, 2, 92};
		selection(list_number);
		int n = list_number.length;
		for (int i = 0; i<n; i++) {
			System.out.print(list_number[i]);
		}
	}
}

