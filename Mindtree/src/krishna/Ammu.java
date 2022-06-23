package krishna;
import java.util.Stack;
public class Ammu {

	public static void main(String[] args) {
		Stack<Integer> stk = new Stack<>();
		stk.push(10);
		stk.push(20);
		stk.push(30);
		stk.push(40);
		stk.push(50);
		stk.push(60);
		System.out.println("stack :"+stk);
		Integer element = stk.pop();
		System.out.println("removed element:"+element);
		 int k = stk.peek();
	        System.out.println(k);
        int poistion = stk.search(50);
        System.out.println(poistion);
       
	}

}
