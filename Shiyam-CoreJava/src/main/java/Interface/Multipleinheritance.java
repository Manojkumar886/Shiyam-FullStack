package Interface;

public class Multipleinheritance implements Mech,Electronics
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multipleinheritance multi=new Multipleinheritance();
		multi.light();
		multi.Switch();
		multi.Reparing();

	}

	@Override
	public void Switch() {
		// TODO Auto-generated method stub
		System.out.println("switch is nutral");
	}

	@Override
	public void light() {
		// TODO Auto-generated method stub
		System.out.println("Different type of lights used in house");
	}

	@Override
	public void Reparing() {
		// TODO Auto-generated method stub
		System.out.println("Car,bike all vechical repairing for my houseowner");
		
	}

}
