package Array;

import java.util.Arrays;

public class BinarySearch {
	public void traverse(double[] yet)
	{
		for(double temp:yet)
		{
			System.out.println(temp);
		}
	}
	
	public int search(double[] say,int start,int end,double users)
	{
		if(end>start)
		{
			int mid=(end)/2;
			if(say[mid]==users)
				return mid;
			else if(say[mid]>users)
				return search(say, start, mid, users);
				
				return search(say, mid+1, end, users);
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] hai= {34.5,12.6,4.6,78.9,12.5,45.9,56.3,62.1,32.1,7.9,4.8,6.3,7.4};
		Arrays.sort(hai);
		System.out.println(Arrays.toString(hai));
		BinarySearch binary=new BinarySearch();
		binary.traverse(hai);
		System.out.println("That index  is"+binary.search(hai,0,hai.length,4.8));

	}

}
