import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListExample{
	
	public static void main (String args[])
	{
		// ArrayList implements the List interface
		ArrayList<String> list = new ArrayList<String>();
		
		String item;
		int pos;
		
 		Scanner console = new Scanner(System.in);
		
		int choice;
		do{		
		System.out.println("Enter choice:");
		System.out.println("1. Add item to list");
		System.out.println("2. Insert item in list");
		System.out.println("3. Delete item from speciific position");
		System.out.println("4. Modify item in list");
		System.out.println("5. Print list");
		System.out.println("6. Print list size");
		System.out.println("7. Exit");
		
		
		choice = console.nextInt();
		System.out.println();
		
		if (choice == 1)
		{
			System.out.print("Enter item: ");
			item = console.next();
			list.add(item);
			System.out.println();
		}
		if (choice == 2)
		{
			System.out.print("Enter item: ");
			item = console.next();
			System.out.print("Enter position: ");
			pos = console.nextInt();

			list.add(pos, item); 
			System.out.println();

		}
		if (choice == 3)
		{
			System.out.print("Enter position: ");
			pos = console.nextInt();

			list.remove(pos); 
			System.out.println();

		}
		if (choice == 4)
		{
			System.out.print("Enter item: ");
			item = console.next();
			System.out.print("Enter position: ");
			pos = console.nextInt();

			list.set(pos, item); 
			System.out.println();

		}
		if (choice == 5)
		{
			System.out.println("The list contains : " + list);
			System.out.println();
		}
		if (choice == 6)
		{
			System.out.println("The size of the list is : " + list.size());
			System.out.println();
		}
								
		}
		while (choice != 7);
		
		console.close();
}		
}
		