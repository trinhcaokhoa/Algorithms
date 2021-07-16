import java.util.Scanner;
public class InsertionSort {
	public static void sort ( int arr[]) {
		int n = arr.length;
		for(int i = 1; i<n; i++) {
			int key = arr[i];
			int j = i-1;
			while( j >=0 && arr[j]>key) {
				arr[j+1] = arr[j];
				j--;
				
			}
			 arr[j + 1] = key;
		}
			
			
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int list_number[] = new int[n] ;
		for (int i = 0;i < n; i++) {
			list_number[i] = input.nextInt();
		}
		sort(list_number);
		for (int i = 0;i < n; i++) {
			System.out.print(list_number[i]);
		
				}
		}
	}
		
		
	


