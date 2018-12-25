import java.util.ArrayList;
import java.util.Scanner;

public class ReverseOrderList
{
    public static void main ( String[] args ) 
    {
    ArrayList<Double> tenRN = new ArrayList<Double>();
    Scanner reader = new Scanner(System.in);

    System.out.println("Please add in your numbers to the list.");
    double temp = 0;
    for(int i = 0; i < 10; i++ )
    {
        temp = reader.nextDouble();
        tenRN.add(temp);
    }
    
    reader.close();

    System.out.println();
    System.out.println("Your list: ");
    System.out.print("[ ");
    for(int j = tenRN.size()-1; j >= 0; j--)
    {
        System.out.print(tenRN.get(j) + " ");
    }
    System.out.println("]");

 
    }
}
