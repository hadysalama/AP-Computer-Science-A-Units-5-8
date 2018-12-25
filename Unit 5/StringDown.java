/*String Down
 *Hady Salama
 *12/8/2017
 */
 
 public class StringDown
 {	
 	public static void main(String args[])
 	{
 		System.out.println("Please enter a word below: ");
 		Scanner reader = new Scanner(System.in);
 		String word = reader.nextLine();
 		int index = word.length();
 		for (int x = 0; x < index; x++)
 		{
 			System.out.println(word.substring(x,x+1));
 		}   
    }
}	