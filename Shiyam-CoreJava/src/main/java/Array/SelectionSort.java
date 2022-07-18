package Array;

import java.util.Arrays;
//decending order
public class SelectionSort {
	public void selection(int[]arr)
	{
		for(int select=0;select<arr.length;select++)
		{
			for(int com=0;com<arr.length;com++)
			{
				if(arr[select]>arr[com])
				{
					arr[select]^=arr[com];
					arr[com]^=arr[select];
					arr[select]^=arr[com];
				}
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] say= {221,43,56,86,98,52};
		System.out.println(Arrays.toString(say));
		SelectionSort sort=new SelectionSort();
		sort.selection(say);
		System.out.println("After Selection"+Arrays.toString(say));
	}

}
