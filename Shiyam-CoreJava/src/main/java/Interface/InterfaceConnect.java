package Interface;

public class InterfaceConnect implements Electronics
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceConnect connect=new InterfaceConnect();
		connect.Switch();
		connect.light();
	}

	@Override
	public void Switch() {
		// TODO Auto-generated method stub
		System.out.println("Switch process is ON and OFF");
	}

	@Override
	public void light() {
		// TODO Auto-generated method stub
		System.out.println("Light is blowing");
	}

}
