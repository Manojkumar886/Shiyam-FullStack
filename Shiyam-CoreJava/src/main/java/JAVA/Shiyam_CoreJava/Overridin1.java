package JAVA.Shiyam_CoreJava;

public class Overridin1 extends overrriding 
{
	public void name()
	{
		System.out.println("child class");
	}
	public void fat(String names)
	{
		System.out.println("child name is something");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		overrriding over=new overrriding();
		over.fat("mani");
		over.name();
		Overridin1 over1=new Overridin1();
		over1.fat("nandha");
		over1.name();
	}

}
