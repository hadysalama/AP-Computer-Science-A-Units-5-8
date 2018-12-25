/*Sum Program
 *Hady Salama
 *12/4/2017
 */
 
 import java.util.Scanner;
 public class L5SumProgram
 {	
 	public static void main(String args[])
 	{
 		System.out.println("Enter how many numbers you want as an integer: ");
 		Scanner reader = new Scanner(System.in);
 		int num = reader.nextInt();
 		int entryNum;
 		int sum = 0;
 	    for(int i = 1; i <= num; i++)
 		{
 		  System.out.println("Enter the next integer: ");
 		  entryNum = reader.nextInt();
 		  sum = (entryNum + sum); 
 		}
 		System.out.println("The sum of your integers are " + sum);
 	}
 }