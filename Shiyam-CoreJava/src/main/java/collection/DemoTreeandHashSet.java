package collection;

import java.util.HashSet;
import java.util.TreeSet;

public class DemoTreeandHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet object=new HashSet();
		object.add("Shiyam");
		object.add(98765789);
		object.add(45.6);
		object.add(98765789);
		object.add("Shiyam");
		TreeSet obj1=new TreeSet();
		obj1.addAll(object);
		System.out.println(object+"Hashset");
		System.out.println(obj1+"Treeset");

	}

}
