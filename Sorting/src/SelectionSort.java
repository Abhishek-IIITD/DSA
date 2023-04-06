
public class SelectionSort {

	private static void printArray(int[] arr) {
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i]+" ");
		}
	}
	
	private static void selectionSort(int[] arr) {
		int indexOfMinElement, temp;
		for(int i = 0; i < arr.length - 1; i++){
			indexOfMinElement = i;
			for(int j = i + 1; j < arr.length; j++){
				if(arr[indexOfMinElement] > arr[j]){
					indexOfMinElement = j;
				}
			}
			temp = arr[i];
			arr[i] = arr[indexOfMinElement];
			arr[indexOfMinElement] = temp;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {12,54,65,7,23,9};
		//printArray(arr);
		selectionSort(arr);
		printArray(arr);
		
	}

}
