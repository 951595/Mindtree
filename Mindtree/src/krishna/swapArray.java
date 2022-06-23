package krishna;
import java.util.*;
import java.util.Arrays;

public class swapArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     List<Integer>list=Arrays.asList(1,2,3,4,5,6);
     System.out.println("List before swappin:"+list);
     Collections.swap(list, 0, 4);
     Collections.swap(list, 2, 5);
     Collections.swap(list, 1, 3);
     System.out.println("list after swapping:"+list);
	}

}
