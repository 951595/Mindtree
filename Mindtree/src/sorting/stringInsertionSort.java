package sorting;

public class stringInsertionSort {
	void mindtree(String arr[]) {
        int n = arr.length;
        for(int i=0; i<n-1; i++) {
        	for(int j=i+1; j>0; j--) {
        		if((arr[j-1].compareToIgnoreCase(arr[j]))<0) {
        			String temp = arr[j];
        			arr[j] = arr[j-1];
        			arr[j-1] = temp;
        		}
        	}
        }
	}
	void printArray(String arr[]) {
		int n = arr.length;
		for(int i=0; i<n; i++) {
			System.out.println(arr[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    stringInsertionSort ob = new stringInsertionSort();
    String arr[] = {"krishna","ammu","chinnu","navi","divya"};
    ob.mindtree(arr);
    ob.printArray(arr);
	}

}
