package Array;

import java.util.Arrays;
import java.util.Scanner;

public class UpdatingAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] movie= {"Ghilli","kuruvi","mersal","bigil","master"};
		for (String movies:movie)
		{
			System.out.println("before updating movie"+movies);
		}
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Tell us position to update");
		int pos=scan.nextInt();
		System.out.println("tell us values to replace/update in the particular position"+pos);
		String data=scan.next();
		
		movie[pos]=data;
		System.out.println(Arrays.toString(movie));

	}

}
