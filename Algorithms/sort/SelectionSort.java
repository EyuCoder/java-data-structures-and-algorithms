/**
* UnStable sort
* time: O(n^2) Quadratic Time
* in-place Algorithm
*/
public class SelectionSort{

	public static void swap(int[] arr, int i, int j){
		if(i == j){
			return;
		}

		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;	
	}

	public static int[] selectionSort(int [] arr){
		for(int i = arr.length - 1; i > 0; i--){
			
			int largest = 0;
			for(int j = 0; j <= i; j++){
				if(arr[j] > arr[largest]){
					largest = j;				
				}			
			}
			
			swap(arr, largest, i);	
		}

		return arr;
	}

	public static void main(String[] args) {
		int[] arr = {23, 43, 43, 21, 2, 4, 77, 9, 0, 788, 7};
		int[] sortedArray = selectionSort(arr);

		for(int item: sortedArray){
			System.out.println(item);	
		}
	}
}
