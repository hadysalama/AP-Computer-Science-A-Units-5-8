public class MatrixExample
{
	public static void main(String[] args)
	{
		int[][] m = new int[5][3];
		
		for(int row = 0; row < m.length; row++)
			for(int col = 0; col < m[0].length; col++)
				if (row == col)
					m[row][col] = 1;
				else
					m[row][col] = 7;
		

		for(int row = 0; row < m.length; row++)
		{
			for(int col = 0; col < m[0].length; col++)
				System.out.print(m[row][col] + " ");
			System.out.println();
		}				
						
	}
	
}