package Array;

import java.util.Scanner;

public class Read {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] kiran= {45.9,1.2,89.5,3.4,9.1,32.9,5.6,4.1,7.4,13.9,56.9};
		Scanner scan=new Scanner(System.in);
		
		// read by index/pos
		System.out.println(kiran[4]+" by position of 4");
		
		Read rd=new Read();
		System.out.println("Tell us desired value to read based on that ");
		double tmp=scan.nextDouble();

		for(int index=0;index<kiran.length;index++) {
				if(kiran[index]<=tmp)
				System.out.println(kiran[index]);
		}

	}

}
