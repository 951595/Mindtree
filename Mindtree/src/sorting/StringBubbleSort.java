package sorting;

public class StringBubbleSort {
	public void mindtree(String arr[]) {
		int n=arr.length;
		for(int i=0; i<n; i++) {
			
		for(int j=0; j<n-i-1; j++) {
			if((arr[j].compareToIgnoreCase(arr[j+1]))<0) {
				String temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
			}
		}
		
	
		}

	}
	public void printArray(String arr[]) {
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]+" ");
			
		}
	}

	public static void main(String[] args) {
		StringBubbleSort ob =new StringBubbleSort();
		String[] arr = {"pepsi","coca-cola","limka","fanta","sprite"};
		ob.mindtree(arr);
		ob.printArray(arr);
		
			}
}


