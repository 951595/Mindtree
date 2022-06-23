package java8;

import java.util.ArrayList;
import java.util.List;

public class Libraray {
	public static List<Books> getALLBooks(){
		List<Books> list=new ArrayList<>();
		list.add(new Books(1,"learn to earn","peter lynch"));
		list.add(new Books(2,"Iet us c","Yashwant kanetkar"));
		list.add(new Books(3,"The intelligent investor","Benjamin grahm"));
		list.add(new Books(4,"The psychology of money","Morgan Housell"));
		list.add(new Books(5,"A Brief history of time","Stephen Hawking"));
		list.add(new Books(6,"Rich dad poor dad","Robert Kyosaki"));
		return list;
	}

}
