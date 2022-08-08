package Array;

import java.util.Arrays;
import java.util.Scanner;

public class InsertingAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] name=new String[10];
		
		
		
		Scanner scan=new Scanner(System.in);
		for(int counter=0;counter<name.length;counter+=2)
		{
			System.out.println("Enter Your name ");
			name[2]="Vinod";
			name[counter]=scan.next();
		}
		
		System.out.println(Arrays.toString(name));
	}

}
