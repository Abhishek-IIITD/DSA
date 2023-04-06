
public class QuickSortLastPivot {

	private static void printArray(int[] arr) {
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i]+" ");
		}
	}
	
	private static int partition(int[] arr, int low, int high){
		int i = low;
		int j = high;
		int pivot = arr[high];
		int temp;
		while(i < j){
			
			while(i <= arr.length - 1 && arr[i] < pivot){ //we need to find element which is greater than pivot
				i++;
			}
			while(j > 0 && arr[j] >= pivot){ //we need to find element which is less than or equal to pivot
				j--;
			}
			if(i < j){
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
			
		}
		
		//swap A[i] and pivot
		temp = arr[high];
		arr[high] = arr[i];
		arr[i] = temp;		
		return i;		
	}
	
	private static void quickSort(int[] arr, int low, int high) {
		if(low < high){
			int partitionIndex = partition(arr, low, high);
			printArray(arr);
			System.out.println("");
			quickSort(arr, 0, partitionIndex - 1);
			quickSort(arr, partitionIndex + 1, high);
			
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {9, 4, 4, 8, 7, 5, 6};
		//printArray(arr);
		quickSort(arr, 0, arr.length - 1);
		printArray(arr);
		
	}

}
