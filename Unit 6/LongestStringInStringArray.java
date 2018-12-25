public class LongestStringInStringArray 
{

  public static String getLongestString(String[] array) 
  {
     int maxLength = 0;
     String longestString = null;
     
     //create a loop to loop through the array 
     //compare the length of each string in the array to find the longest string
    
    for(int i = 0; i < array.length - 1; i++)
    { 
    	if(array[i].length() < array[i+1].length())
    	{
    		longestString = array[i+1];
    	}
    }
	 return longestString;
	
  }

  public static void main(String[] args) 
  {
      String[] toppings = {"Cheese", "Pepperoni", "Black Olives"};
      String longestString = getLongestString(toppings);
      System.out.println("The longest string is " + longestString + " and its length is " + longestString.length());
  }

}
