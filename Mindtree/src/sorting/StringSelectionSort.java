package sorting;

public class StringSelectionSort {
	public void printArr(String arr[]) {
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]+"");
		}
	}

	public static void main(String[] args) {
		StringSelectionSort ob = new StringSelectionSort();
		String[] arr= {"krishna","ammu","navi","chinnu","divya"};
		for(int i=0; i<arr.length-1; i++) {
			for(int j=0; j<arr.length-i-1; j++) {
				if(arr[j].compareTo(arr[j+1])>0) {
					String temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp; 
				}
			}
		}
      ob.printArr(arr);
	}

}
