public class InventoryItem extends Inventory
{
	private String description; 
	private double price;
	private int quantity;

	public InventoryItem(String descr, double cost, int quant)
	{
		this.description = descr;
		this.price = cost;
		this.quantity = quant; 
	}
	
	public void setDescription(String descr) 
	{
		this.description = descr;
	}

	public void setPrice(double num) 
	{
		this.price = num;
	}

	public void setQuantity(int amt) 
	{
		this.quantity = amt;
	}
		
	public String getDescription()
	{
		return this.description;
	}

	public double getPrice()
	{
		return this.price;
	}

	public int getQuantity()
	{
		return this.quantity;
	}
}