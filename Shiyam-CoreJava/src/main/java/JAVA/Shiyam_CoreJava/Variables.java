package JAVA.Shiyam_CoreJava;

public class Variables {
	
	static int a=10;//static variable
	public void local()//local variable
	{
		System.out.println("This local Variable");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="Shiyam is play Boy";//global or instance variable
		System.out.println(name);
		Variables var=new Variables();
		var.local();
		System.out.println(a);
		

	}

}
