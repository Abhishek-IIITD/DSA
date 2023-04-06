
public class BubbleSort {

	private static void printArray(int[] arr) {
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i]+" ");
		}
	}
	
	private static void bubbleSort(int[] arr) {
		for(int i = 0; i < arr.length - 1; i++){ //no of passes
			for(int j = 0; j < arr.length-1-i; j++){ //no of comparisons in each pass
				if(arr[j] > arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}		
	}

	private static void bubbleSortAdaptive(int[] arr) {
		int isSorted = 0;
		for(int i = 0; i < arr.length - 1; i++){
			isSorted = 1;
			for(int j = 0; j < arr.length-1-i; j++){
				if(arr[j] > arr[j+1]){
					int temp = 0;
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					isSorted = 0;
				}				
			}
			if(isSorted == 1)
				return;
		}		
	}

	public static void main(String[] args) {
		int[] arr = {12,54,65,7,23,9};
		//printArray(arr);
		bubbleSort(arr);
		printArray(arr);
		
	}


}
