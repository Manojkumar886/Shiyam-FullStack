package Array;

import java.util.Scanner;

public class Searching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] cast= {"Dweyne","Evans","Robert","Hemsworth","Holland","Pratt","Ruffalo","Hiddlwson","Jhonson"};
		Scanner scan=new Scanner(System.in);
		System.out.println(cast.length);
		
		System.out.println("Tell us your favorit actor: ");
		String favor=scan.next();
		
		for(int pos=0;pos<cast.length;pos++)
		{
			if(favor.equalsIgnoreCase(cast[pos]))
			{
				System.out.println(favor+" actor found @ "+pos);
				return;
			}
		}
		
		System.out.println(favor+" actor not found anywhere");
		
		//scan.close();
	}

}
