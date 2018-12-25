/*Word Repeater
 *Hady Salama
 *12/4/2017
 */
 
 import java.util.Scanner;
 public class L5RepeatWord
 {	
 	public static void main(String args[])
 	{
 		System.out.println("Please input a word: ");
 		Scanner reader = new Scanner(System.in);
 		String word = reader.nextLine();
 	    for(int i = 1; i <= word.length(); i++)
 		{
 			System.out.println(word);
 		}
 	}
 }