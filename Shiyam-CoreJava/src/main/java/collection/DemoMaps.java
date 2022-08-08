package collection;

import java.util.Collections;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeMap;

public class DemoMaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<String,Mobile> owners=new Hashtable<String, Mobile>();
			
		TreeMap<String, Integer> check=new TreeMap<String, Integer>();
		check.put("Shiyam", 20);
		check.put("Manojkumar", 21);
		check.put("Zero", 19);
		check.put("Fazel", 20);
		
		System.out.println(check);
		check.remove("Zero");
		System.out.println(check);
		System.out.println(check.containsKey("Shiyam"));
		System.out.println(check.containsValue(20));
		
		List<Character> use=new LinkedList<Character>();
		use.add('S');
		use.add('H');
		use.add('I');
		Collections.sort(use);
		System.out.println(use);
		
		
		System.out.println(check);
	}

}
