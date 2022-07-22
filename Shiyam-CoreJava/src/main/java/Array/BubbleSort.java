package Array;

import java.util.Arrays;
//ascending order
public class BubbleSort {
	public void bubble(int[] hey)
	{		
		int a=hey.length;
		for(int i=0;i<a-1;i++)
			for(int j=0;j<a-i-1;j++)
				if(hey[j]>hey[j+1])
				{
					int temp=hey[j];
					hey[j]=hey[j+1];
					hey[j+1]=temp;
				}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] age= {6,5,3,1,8,7,2,4};
		BubbleSort sort=new BubbleSort();
		System.out.println(Arrays.toString(age));
			sort.bubble(age);
			System.out.println("After BubbleSort"+Arrays.toString(age));
	}

}
