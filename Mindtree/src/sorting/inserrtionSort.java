package sorting;

public class inserrtionSort {
	void mindtree(int arr[]) {
		int n=arr.length;
		for(int i=0;i<n-1;i++) {
			
			for(int j=i+1;j>0;j--) {
				if(arr[j]>arr[j-1]) {
					int temp =arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
				}else {
					break;
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
  inserrtionSort ob =new inserrtionSort();
  int arr[]= {6,3,1,5,2,4};
  ob.mindtree(arr);
  ob.printArray(arr);
	}

}
