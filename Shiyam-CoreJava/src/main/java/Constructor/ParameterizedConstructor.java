package Constructor;

public class ParameterizedConstructor {
	int age;
	String name;
	public ParameterizedConstructor(int age1,String name1)
	{
		int a;
		age=age1;
		name=name1;
		System.out.println("Student details from Goverment Higher secondary School");
		System.out.println("Student Name "+name);
		System.out.println("student age "+age);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParameterizedConstructor pconstr=new ParameterizedConstructor(12,"manoj");
		new ParameterizedConstructor(9, "annamalai");
	}

}
