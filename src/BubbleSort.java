import java.util.Scanner;

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
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int list_number[] = new int[n] ;
		for (int i = 0;i < n; i++) {
			list_number[i] = input.nextInt();
		}
		
		Bubble(list_number, list_number.length -2);
		for (int i = 0;i < n; i++) {
			System.out.print(list_number[i]);
		}
	}
}
		


