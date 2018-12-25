import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.lang.Double;
import java.lang.Integer;


public class Inventory 
{
	private List<InventoryItem> items;
	
	public Inventory()
	{
		items = new ArrayList<InventoryItem>();
	}
	
	public InventoryItem findItem(List<InventoryItem> items, String itemName)
	{
		// find InventoryItem with name itemName - returns InventoryItem
		//                    or null if not found

		for(int j = 0; j < items.size(); j++)
		{
			if(items.get(j).getDescription().equals(itemName))
			{
				return items.get(j);
			}
		}
		return null;
		
	}
	
	public void inventoryMenu()
	{		
		String itemName;
		double itemPrice;
		int itemQuantity;
		int position;
		
		Scanner reader = new Scanner(System.in);
		
		int choice;
		do{

		System.out.println();		
		System.out.println("Enter choice:");
		System.out.println("1. Add item to inventory");
		System.out.println("2. Process a shipment");
		System.out.println("3. Sell items");
		System.out.println("4. Print inventory");
		System.out.println("5. Exit");
		System.out.println();
		
		choice = Integer.parseInt(reader.nextLine());
		System.out.println();
		
		if (choice == 1)
		{
			System.out.println("Enter item description: ");
			itemName = reader.nextLine();

			System.out.println("Enter item price: ");
			itemPrice = Double.parseDouble(reader.nextLine());
		
			System.out.println("Enter item quantity: ");
			itemQuantity = Integer.parseInt(reader.nextLine());

			InventoryItem oneItem = new InventoryItem(itemName, itemPrice, itemQuantity);
			items.add(oneItem);

		}
		if (choice == 2)
		{
			System.out.print("Enter item description: ");
			itemName = reader.nextLine();
			InventoryItem item = findItem(items, itemName);
			position = items.indexOf(item);
			if(position < 0)
			{
			   System.out.println("Item not found. Please try again.");
			   System.out.println();
			}
			else
			{
				System.out.print("How many more were received? ");
				int more = Integer.parseInt(reader.nextLine());
				items.get(position).setQuantity((items.get(position).getQuantity() + more));
			}
		
			//2nd Way
			/*InventoryItem newItem = new InventoryItem(items.get(position).getDescription(), items.get(position).getPrice(), (items.get(position).getQuantity() + more));
			items.set(position, newItem);*/
			

		}
								
		if (choice == 3)
		{
			System.out.print("Enter item description: ");
			itemName = reader.nextLine();
			InventoryItem item = findItem(items, itemName);
			position = items.indexOf(item);
			if(position < 0)
			{
			   System.out.println("Item not found. Please try again.");
			   System.out.println();
			}
			else
			{
			System.out.print("How many were sold? ");
			int sold = Integer.parseInt(reader.nextLine());
			items.get(position).setQuantity((items.get(position).getQuantity() - sold));
			}

			//2nd Way
			/*InventoryItem newItemSold = new InventoryItem(items.get(position).getDescription(), items.get(position).getPrice(), (items.get(position).getQuantity() - sold));
			items.set(position, newItemSold);*/ 
		}
		if (choice == 4)
		{
			for(int i = 0; i < items.size();i++)
			{
				System.out.println();
				System.out.println("Item " + (i+1) +":");
				System.out.println("Description: " + items.get(i).getDescription());
				System.out.println("Price: " + items.get(i).getPrice());
				System.out.println("Quantity: " + items.get(i).getQuantity());
				System.out.println();
			}
		}
								
		}
		while (choice != 5);

		reader.close();
	}
	
	public static void main(String[] args)
	{
		Inventory theInventory = new Inventory();
		theInventory.inventoryMenu();
		
	}	
		

}
