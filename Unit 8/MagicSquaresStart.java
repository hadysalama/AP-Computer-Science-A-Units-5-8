// TextLab07st.java
// The "Odd Magic Square" Program
// This is the student, starting version of the TextLab07 assignment.


import java.util.Scanner;

public class MagicSquaresStart
{
	public static void main(String args[])
	{
		Scanner reader = new Scanner(System.in);

        System.out.print("Enter the odd# size of the Magic Square -->  ");
        int size = reader.nextInt();
        MagicSquare magic = new MagicSquare(size);

        magic.computeMagicSquare();
        magic.displayMagicSquare();
		magic.checkRows();           // for 100 & 110 Point Version Only
		System.out.println();
		magic.checkColumns();		 // for 100 & 110 Point Version Only
		System.out.println();
 		magic.checkDiagonals();	 	 // for 100 & 110 Point Version Only
		System.out.println();
		System.out.println();
        reader.close();
    
	}
}