//import java.cs1.Keyboard;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IntegerList2{

    private List<Integer> theList; //values in the list

    public IntegerList2()
    {
	theList = new ArrayList<Integer>();
    }
    
	public void fill()
	{   

		int num; 
    	for (int i = 0; i < 10; i++)
		{
			num = (int)(Math.random()*100);
			theList.add(num);
		}
	}	

	//-------------------------------------------------------
	//   Calculates and returns sum
	//-------------------------------------------------------
	public int sum()
	{
		int sumvals = 0;
		for (int i = 0; i < theList.size(); i++)
			sumvals += theList.get(i);
		return sumvals;				
	}
	
	//-------------------------------------------------------
	//   Calculates and returns maximum value
	//-------------------------------------------------------
	public int max()
	{
		int maxValue = 0; //Lower Bound
		for (int j = 0; j < theList.size(); j++)
		{
			if(maxValue < theList.get(j))
			{
				maxValue = theList.get(j);
			}
		}
		return maxValue;
	}
	
	//-------------------------------------------------------
	//   Calculates and returns minimum value
	//-------------------------------------------------------
	public int min()
	{
		int minValue = 100; //Upper Bound
		for (int k = 0; k < theList.size(); k++)
		{
			if(minValue > theList.get(k))
			{
				minValue = theList.get(k);
			}
		}
		return minValue;	
	}


    //-------------------------------------------------------
    //return the index of the first occurrence of target in the list.
    //return -1 if target does not appear in the list
    //-------------------------------------------------------
    public int search(int target)
    {
		for (int l = 0; l < theList.size(); l++)
		{
			if(target == theList.get(l))
			{
				return l;
			}
		}	
		return -1;

    }
    public String toString()
    {
    	return theList.toString();  //ArrayList has a toString method
    }
	public static void main (String args[])
	{
		IntegerList2 intlist = new IntegerList2();
		//fill with random values
		intlist.fill();
		Scanner reader = new Scanner(System.in);
		System.out.println(intlist);
		System.out.println("Sum: "+intlist.sum());
		System.out.println("Max: "+intlist.max());
		System.out.println("Min: "+intlist.min());
		System.out.println();
		System.out.println("What Integer do you want to search for?");
		int num = reader.nextInt();
		System.out.println("Your search results: " + intlist.search(num));
		reader.close();
	}	
}
