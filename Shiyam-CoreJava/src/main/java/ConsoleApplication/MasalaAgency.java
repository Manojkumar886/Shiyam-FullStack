package ConsoleApplication;

public class MasalaAgency 
{
	private String ProductName;
	private String ItemName;
	private int ItemRate;
	private String Quantity;
	
	public MasalaAgency() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MasalaAgency(String productName, String itemName, int itemRate, String quantity) {
		super();
		ProductName = productName;
		ItemName = itemName;
		ItemRate = itemRate;
		Quantity = quantity;
	}
	@Override
	public String toString() {
		return "MasalaAgency [ProductName=" + ProductName + ", ItemName=" + ItemName + ", ItemRate=" + ItemRate
				+ ", Quantity=" + Quantity + "]";
	}
	public String getProductName() {
		return ProductName;
	}
	public void setProductName(String productName) {
		ProductName = productName;
	}
	public String getItemName() {
		return ItemName;
	}
	public void setItemName(String itemName) {
		ItemName = itemName;
	}
	public int getItemRate() {
		return ItemRate;
	}
	public void setItemRate(int itemRate) {
		ItemRate = itemRate;
	}
	public String getQuantity() {
		return Quantity;
	}
	public void setQuantity(String quantity) {
		Quantity = quantity;
	}

}
