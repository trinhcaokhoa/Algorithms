
public class InClassAlgorithms {
	void Merge( int arr[], int low, int mid, int high){
		
		// caculate the number of 2 sublist
		int n1 = mid - low + 1;
		int n2 = high - mid;
		
		// Create 2 sublist
		int L[] = new int[n1];
		int R[] = new int[n2];
		
		// Copy arr to new arr
		for (int i = 0; i<n1; i++) {
			L[i] = arr[low + i];
		}
		for(int i = 0; i<n2; i++) {
			R[i] = arr[mid +i+1];
		}
		
		// Compare and merge 2 sub array
		int i = 0;
		int j = 0;
		int k = low;
		while(i<n1 && j<n2) {
			if(L[i] <= R[j]) {
				arr[k] = L[i];
				k++;
				i++;
			}
			else {
				arr[k] = R[j];
				k++;
				j++;
				
			}
		 }
		
		// Copy the rest of the "left" arr
		while(i<n1) {
			arr[k] = L[i];
			i++;
			k++;
		}
		while(j<n2) {
			arr[k] = R[j];
			j++;
			k++;
		}
		
		
		
	}
	void Sort( int arr[], int low, int high) {
		if (low < high) {
			int mid = (low + high)/2;
			Sort(arr, low, mid);
			Sort(arr, mid+1, high);
			Merge(arr, low, mid, high);
			
		}
		
	}
}
	