package Array;

import java.util.Arrays;

public class CreatingAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] weight= {23,56,78,98,200,1,455};
		//System.out.println(weight); -show only address values that time we are using a tostring
		
		//getting array length---1 to infinite
		System.out.println("Array length"+weight.length);
		
		//one easy type
		System.out.println(Arrays.toString(weight));
		
		//using for loop
		for(int index=0;index<weight.length;index++)
		{
			System.out.println(weight[index]);
		}
		
		//using for-each loop
		for(int weight1:weight)
		{
			System.out.println(weight1);
		}

	}

}
