package Array;

public class ListingAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] age= {1,23,4,54,35,345,35};
		//using for loop
				for(int index=0;index<age.length;index++)
				{
					System.out.println(age[index]);
				}
				
				//using for-each loop
				for(int weight1:age)
				{
					System.out.println(weight1);
				}

	}

}
