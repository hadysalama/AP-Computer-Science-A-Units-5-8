/*Fill the Numbers
 *Hady Salama
 *12/4/2017
 */
 
 import java.util.Scanner;
 public class L5FillTheNumbers
 {	
 	public static void main(String args[])
 	{
 		System.out.println("Enter the starting integer: ");
 		Scanner reader = new Scanner(System.in);
 		int start = reader.nextInt();
 		System.out.println("Enter the ending integer: ");
 		int end = reader.nextInt();
 		while (start <= end)
 		{
 		   System.out.println(start);
 		   start++;
 		}
 	}
 }