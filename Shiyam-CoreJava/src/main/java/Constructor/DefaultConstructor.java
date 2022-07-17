package Constructor;

public class DefaultConstructor {
	int age;
	String name;
	public DefaultConstructor()
	{
		System.out.println("Student details from Goverment Higher secondary School");
		System.out.println("Student Name"+name);
		System.out.println("student age"+age);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DefaultConstructor constr=new DefaultConstructor();
	}

}
