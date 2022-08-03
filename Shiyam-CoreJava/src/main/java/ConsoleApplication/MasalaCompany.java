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
		agency[8]=new MasalaAgency("selvamMasala", "ChillyPowder", 567, "5kg");
		
	}
	public static void main(String[] args) 
	{
		MasalaAgency agency1=new MasalaAgency("SelvamMasala","CoridenderPowder", 1800, "10KG");
		MasalaCompany obj=new MasalaCompany();
		obj.ListAllProduct();
		obj.AddnewProductName(agency1);
//		obj.ListAllProduct();
//		obj.DeleteProduct("aachimasala");
//		obj.ListAllProduct();
//		obj.DeleteProduct("aachimasala");
//		obj.ListAllProduct();
//		obj.UpdateProduct("SakthiMasala");
//		obj.ListAllProduct();
//		obj.SortProduct();
//		obj.ListAllProduct();
		obj.SearchProduct("SakthiMasala");
		obj.SortProduct();
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
		for (int index=0;index<agency.length;index++)
		{
			if
			(agency[index].getProductName().equalsIgnoreCase(name))
			{
				agency[index]=null;
				System.out.println(name+"has deleted Successfully");
				return;
			}
		}
		System.out.println(name+"has not foundAnywhere");
	}

	@Override
	public void SearchProduct(String name) {
		// TODO Auto-generated method stub
		System.out.println("Trying to fetch masala matching the Productname "+name);

		for(int index=0;index<agency.length;index++)
		{
			if(agency[index].getProductName().equalsIgnoreCase(name))
			{
				System.out.println(agency[index]);
			}
		}
		
	}

	@Override
	public void SearchProduct(int itemrate) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void SortProduct() {
		// TODO Auto-generated method stub
		MasalaAgency masala=null;
		System.out.println("Based on what you wish to sort");
		String what=scan.next();
		for(int index=0;index<agency.length;index++)
		{
			for(int com=index+1;com<agency.length;com++)
			{
				if(what.equalsIgnoreCase("name"))
				{
					if(agency[index].getProductName().compareTo(agency[com].getProductName())>0)
					{
						masala=agency[index];
						agency[index]=agency[com];
						agency[com]=masala;
					}
				}
				else if(what.equalsIgnoreCase("name"))
				{
					if(agency[index].getItemName().compareTo(agency[com].getItemName())>0)
					{
						masala=agency[index];
						agency[index]=agency[com];
						agency[com]=masala;
					}
				}
			}
		}
		
	}

	public void UpdateProduct(String name) {
		// TODO Auto-generated method stub
		for (int index=0;index<agency.length;index++)
		{
			if(agency[index].getProductName().equalsIgnoreCase(name))
			{
				System.out.println(agency[index]);
				System.out.println("tell us what to update");
				String update=scan.nextLine();
				switch(update)
				{
				case "ProductName":
					System.out.println("tell us a new Productname");
					String name1=scan.nextLine();
					agency[index].setProductName(name1);
					break;
				case "Quantity":
					System.out.println("tell us a new Quantity ");
					String name2=scan.nextLine();
					agency[index].setQuantity(name2);
					break;
					default:System.out.println("Nothing to update");
					
					
				
				}
				
			}
		}
		
	}
	

}
