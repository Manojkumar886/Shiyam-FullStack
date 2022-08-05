package collection;

import java.util.Collections;
import java.util.LinkedList;

public class DemoLinkedLIst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Character> obj=new LinkedList<Character>();
		obj.add('S');
		obj.add('H');
		obj.add('I');
		obj.add('Y');
		obj.add('A');
		obj.add('M');
		System.out.println(obj);
		Collections.reverse(obj);
		System.out.println(obj);
		Collections.sort(obj);
		System.out.println(obj);
		System.out.println(obj.remove(3));
		System.out.println(obj.contains('A'));
		obj.set(4, 'A');
		System.out.println(obj);
		System.out.println(obj.indexOf('S'));
		obj.add(5, 'A');
		System.out.println(obj);
		System.out.println(obj.get(5));
	}

}
