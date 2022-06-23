package sorting;

public class selectionSort {
	void krishna(int arr[]) {
		int n = arr.length;
		for(int i=0;i<n-1;i++) {
			int min_idx=i;
			for(int j=i+1;j<n;j++) {
				if(arr[j]>arr[min_idx]) {
					min_idx=j;
				}
			}
					int temp = arr[min_idx];
					arr[min_idx] = arr[i];
					arr[i] = temp;
				
			
		}
			
	}
	void printArray(int arr[]) {
		int n = arr.length;
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]+"");
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     selectionSort ob = new selectionSort();
    int arr[] ={72,16,51,45,89,10,3,7};
    ob.krishna(arr);
    ob.printArray(arr);
	}

}
