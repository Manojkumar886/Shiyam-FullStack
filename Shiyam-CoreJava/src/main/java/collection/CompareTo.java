package collection;

import java.util.TreeSet;

public class CompareTo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Mobile> poorvika=new TreeSet<Mobile>();
		poorvika.add(new Mobile("samsung J7", 2, 16, 10000.0));
		poorvika.add(new Mobile("realme1", 4, 64, 12000.0));
		poorvika.add(new Mobile("Apple i13", 12, 128, 89000.0));
		poorvika.add(new Mobile("Nokia 66", 1, 2, 1200.0));
		Mobile mob=new Mobile("Redmi note 5", 6, 64,18000.0);
		poorvika.add(mob);
		System.out.println(poorvika);

	}

}

class Mobile implements Comparable<Mobile>
{
	String model;
	Integer ram,internal;
	Double price;

	public Mobile() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Mobile(String model, Integer ram, Integer internal, Double price) {
		super();
		this.model = model;
		this.ram = ram;
		this.internal = internal;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Mobile [model=" + model + ", ram=" + ram + ", internal=" + internal + ", price=" + price + "]";
	}

	@Override
	public int compareTo(Mobile o) {
		// TODO Auto-generated method stub
		return o.price.compareTo(this.price);
	}
	
}