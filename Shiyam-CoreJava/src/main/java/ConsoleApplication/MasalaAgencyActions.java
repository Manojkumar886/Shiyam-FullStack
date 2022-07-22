package ConsoleApplication;

public interface MasalaAgencyActions 
{
	//Abstract method
	public String AddnewProductName(MasalaAgency masala);
	public void ListAllProduct();
	public void DeleteProduct(String name);
	public void SearchProduct(String name);
	public void SearchProduct(int itemrate);
	public void SortProduct();
	public void UpdateProduct();

}
