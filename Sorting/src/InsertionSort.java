
public class InsertionSort {

	private static void printArray(int[] arr) {
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i]+" ");
		}
	}
	
	private static void insertionSort(int[] arr) {
		int key, j;
		for(int i = 0; i < arr.length - 1; i++){ //for passes
			//Loop for each pass
			key = arr[i+1];
			j = i;
			while(j >= 0 && key < arr[j]){
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = key;
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {12,54,65,7,23,9};
		//printArray(arr);
		insertionSort(arr);
		printArray(arr);
		
	}

}
