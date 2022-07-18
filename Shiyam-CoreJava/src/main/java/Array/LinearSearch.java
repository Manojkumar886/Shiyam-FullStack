package Array;

import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch {
	public static int linearsearch(int [] arr,int key)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==key)
			{
				return i;
			}
		}
		return key;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {10,290,30,40,50,60};
		Arrays.sort(a);
		Scanner scan=new Scanner(System.in);
		System.out.println(Arrays.toString(a));
		System.out.println("which number in found at index");
		int key=scan.nextInt();
		System.out.println(key+" is found at index"+linearsearch(a, key) );
	}

}
