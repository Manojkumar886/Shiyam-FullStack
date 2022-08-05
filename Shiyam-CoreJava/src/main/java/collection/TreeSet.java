package collection;



public class TreeSet {

	public static void main(String[] args) {
		java.util.TreeSet<Mobile> Poorvika=new java.util.TreeSet<Mobile>();
		Poorvika.add(new Mobile("Realme1",4,64,12000.43));
		Poorvika.add(new Mobile("Realme2",6,128,15000.43));
		Poorvika.add(new Mobile("Realme3",2,32,8000.43));
		Poorvika.add(new Mobile("Redmi3",1,256,32000.43));
		Mobile mob=new Mobile("Redmi 10T",8,12,25500.9);
		Poorvika.add(mob);
	
		System.out.println(Poorvika);
	}

}
class Mobile implements Comparable<Mobile>
{
	String model;
	Integer ram, internal;
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
		return "Mobile [model=" + model + ", ram=" + ram + ", internal=" + internal + ", price=" + price + "]\n";
	}

	@Override
	public int compareTo(Mobile o) {
		// TODO Auto-generated method stub
//		return this.price.compareTo(o.price);
//		return o.model.compareTo(this.model);
		return this.ram.compareTo(o.ram);
	}
	
}