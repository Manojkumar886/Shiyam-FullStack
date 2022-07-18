package Array;

import java.util.Arrays;

public class JaggedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//declaring 2-d array with 2 rows
		int arr[][]=new int[2][];
		arr[0]=new int [3];//first row three colums
		arr[1]=new int [2];//second row two colums
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				arr[i][j]=count++;
			}
		}
		System.out.println("contents on 2-d jagged array");
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println("");
		}

	}

}
