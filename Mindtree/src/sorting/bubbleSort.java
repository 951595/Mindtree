package sorting;

public class bubbleSort {
	public void mindtree(int arr[]) {
		int n=arr.length;
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-i-1;j++) {
				if(arr[j]<arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
	void printArray(int arr[]) {
		int n=arr.length;
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]+"");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      bubbleSort ob=new bubbleSort();
      int arr[] = {1,4,3,5,2};
      ob.mindtree(arr);
      ob.printArray(arr);
	}

}
