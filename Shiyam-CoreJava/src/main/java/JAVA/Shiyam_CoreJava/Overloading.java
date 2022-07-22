package JAVA.Shiyam_CoreJava;
//Same method name
//same class
//different Arguments
public class Overloading {
	public void sweet()
	{
		int a=10;
		System.out.println(a);
	}
	public void sweet(int a)
	{
		System.out.println("i am Manojumar");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overloading over=new Overloading();
		over.sweet();
		over.sweet(1);
	}

}
