/*Name Reversal
 *Hady Salama
 *12/5/2017
 */
 
 import java.util.Scanner;
 public class NameReversal
 {	
 	public static void main(String args[])
 	{
 		System.out.println("Please enter your name below: ");
 		Scanner reader = new Scanner(System.in);
 		String name = reader.nextLine();
 		int index = name.length();
 		for (int x = index-1; x >= 0; x--)
 		{
 			System.out.print(name.substring(x,x+1));
 		}   
    }
}	