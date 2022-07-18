package Array;

import java.util.Arrays;
//ascending order
public class BubbleSort {
	public void bubble(int[] hey)
	{
		for(int time=0;time<hey.length-1;time++)
		{
			for(int point=0;point<hey.length-time-1;point++)
			{
				if(hey[point]>hey[point+1])
				{
					hey[point]+=hey[point+1];
					hey[point+1]=hey[point]-hey[point+1];
					hey[point]-=hey[point+1];
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] age= {98,76,44,35,75,35,21,23};
		BubbleSort sort=new BubbleSort();
		System.out.println(Arrays.toString(age));
			sort.bubble(age);
			System.out.println("After BubbleSort"+Arrays.toString(age));
	}

}
