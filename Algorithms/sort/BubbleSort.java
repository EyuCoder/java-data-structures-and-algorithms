/**
* Stable sort
* time: O(n^2) Quadratic Time
* in-place Algorithm
*/
public class BubbleSort{

	public static void swap(int[] arr, int i, int j){
		if(i == j){ 
			return;
		}

		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;	
	}

	public static int[] bubbleSort(int[] arr){
		for(int i = arr.length - 1; i > 0 - 1; i--){

			for(int j = 0; j < i; j++){
				if(arr[j] > arr[j + 1]){
					swap(arr, j, j+1);
				}			
			}		
		}

		return arr;
	}

	public static void main(String[] args) {
		
		int[] arr = {23, 43, 43, 21, 2, 4, 77, 9, 0, 788, 7};
		int[] sortedArray = bubbleSort(arr);

		for(int item: sortedArray){
			System.out.println(item);	
		}	
	}
}
