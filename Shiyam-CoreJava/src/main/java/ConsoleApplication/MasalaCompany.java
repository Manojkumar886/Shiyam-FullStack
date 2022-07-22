package ConsoleApplication;

import java.util.Scanner;

public class MasalaCompany  implements MasalaAgencyActions
{
	MasalaAgency[] agency=new MasalaAgency[10];
	Scanner scan=new Scanner(System.in);
	public MasalaCompany()
	{
		agency[0]=new MasalaAgency("SakthiMasala", "ChillyPowder", 45, "500g");
		agency[2]=new MasalaAgency("AachiMasala", "PepperPowder", 90, "100g");
		agency[3]=new MasalaAgency("AachiMasala", "PepperPowder", 90, "100g");
		agency[1]=new MasalaAgency("AachiMasala", "PepperPowder", 90, "100g");
		agency[4]=new MasalaAgency("AachiMasala", "PepperPowder", 90, "100g");
		agency[5]=new MasalaAgency("AachiMasala", "PepperPowder", 90, "100g");
		agency[6]=new MasalaAgency("AachiMasala", "PepperPowder", 90, "100g");
		agency[7]=new MasalaAgency("AachiMasala", "PepperPowder", 90, "100g");
		
	}
	public static void main(String[] args) 
	{
		MasalaAgency agency1=new MasalaAgency("SelvamMasala","CoridenderPowder", 1800, "10KG");
		MasalaCompany obj=new MasalaCompany();
		obj.ListAllProduct();
		obj.AddnewProductName(agency1);
		obj.ListAllProduct();
	
				
	}

	
	
	
	@Override
	public String AddnewProductName(MasalaAgency masala) {
		// TODO Auto-generated method stub
		for(int index=0;index<agency.length;index++)
		{
			if(agency[index]==null)
			{
				agency[index]=masala;
				System.out.println("has added");
				break;
			}
		}
		return null;
	}

	@Override
	public void ListAllProduct() {
		// TODO Auto-generated method stub
		for(MasalaAgency all:agency)
		{
			System.out.println(all);
		}
		
	}

	@Override
	public void DeleteProduct(String name) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void SearchProduct(String name) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void SearchProduct(int itemrate) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void SortProduct() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void UpdateProduct() {
		// TODO Auto-generated method stub
		
	}
	

}
