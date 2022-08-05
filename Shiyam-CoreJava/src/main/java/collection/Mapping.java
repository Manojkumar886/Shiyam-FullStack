package collection;

import java.util.Hashtable;
import java.util.TreeMap;


public class Mapping {
	public static void main(String[] args) {
		Hashtable<String, Mobile> owner=new Hashtable<String, Mobile>();
		
		Mobile mob1=new Mobile("Realme 5s",4,128,14500.3);
		Mobile mob2=new Mobile("IQOO Z3",8,64,21300.5);
		Mobile mob3=new Mobile("Nokia 6.1 plus",4,64,11500.9);
		Mobile mob4=new Mobile("Redmi 10T",8,12,25500.9);
		
		owner.put("Manojkumar",mob2);
		owner.put("Pavithra",mob1);
		owner.put("Geetha",mob3);
		owner.put("Annamalai", mob1);
		owner.put("Razak", mob3);
		owner.put("Sabari", mob4);
		owner.put("Arasan", mob2);
		System.out.println(owner);
		
		TreeMap<Mobile, String> own=new TreeMap<Mobile, String>();
		own.put(mob1, "Razak Mohamed");
		own.put(mob2, "Razak Mohamed");
		own.put(mob3, "Razak Mohamed");
		own.put(mob4, "Razak Mohamed");
		
		System.out.println(own);
		System.out.println(own.containsValue("Razak Mohamed"));
		System.out.println(own.containsKey(mob2));
	}
	

}
