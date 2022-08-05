package collection;

import java.util.Arrays;
import java.util.Stack;

public class DemoStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack obj=new Stack();//generic
		obj.push("Shiyam");
		obj.push(987654567654l);
		obj.push(true);
		obj.push(82.2f);
		obj.push("Shiyam");
		System.out.println(obj);obj.pop();
		System.out.println(obj);
		System.out.println(obj.peek());
		System.out.println(obj.empty());
		System.out.println(obj.search("Shiyam"));
	}

}
