/**
* UnStable sort
* time: O(n^2) Quadratic Time(could be better depending on the Gap)
* in-place Algorithm 
*/
public class ShellSort{

	public static int[] shellSort(int[] arr){
		for (int gap = arr.length / 2; gap > 0; gap /= 2) {
			
			for(int i = gap; i < arr.length; i++){
				int newElement = arr[i];

				int j;
				for(j = i; j >= gap && arr[j - gap] > newElement; j -= gap){
					arr[j] = arr[j - gap];
				}
				arr[j] = newElement;
			}
		}

		return arr;
	}

	public static void main(String[] args) {
		
		int[] arr = {23, 435, 5,  6, 88, 99, -32, 4, -665};
		int[] sortedArray = shellSort(arr);

		for(int item: sortedArray){
			System.out.println(item);	
		}
	}
}