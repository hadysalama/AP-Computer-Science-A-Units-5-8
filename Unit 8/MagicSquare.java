public class MagicSquare
{
	private int size;
	private int magic[][];

	public MagicSquare(int s)
	{
		size = s;
		magic = new int[size][size];
	}

	public void computeMagicSquare()
	{
		int row = 0;
		int col = size/2;
        magic[row][col] = 1;
        
		for (int i = 2; i <= (size * size); i++)
		{
			if ((row-1 == -1) && (col+1 == size))
			{
				row++;
				magic[row][col] = i;
			}
			else if (row-1 == -1)
			{
				row = size-1;
				col++;
				magic[row][col] = i;
			}
			else if (col+1 == size)
			{
				row--;
				col = 0;
				magic[row][col] = i;
			}
			else if (magic[row-1][col+1] > 0)
			{
				row++;
				magic[row][col] = i;
			}
			else
			{
				row--;
				col++;
				magic[row][col] = i;
			}
		}
	}

	public void displayMagicSquare()
	{
		System.out.println();
		System.out.println(size + " by " + size + " Magic Square");
		System.out.println("==================");
		System.out.println();

		for (int row = 0; row < magic.length; row++)
		{
			for (int col = 0; col < magic[0].length; col++)
			{
				System.out.print(magic[row][col] + " ");
			}
			System.out.println();
		}
    }

    public void checkColumns()
	{
		System.out.println();
		System.out.println("Checking Columns");
		System.out.println("================");
		System.out.println();

		int temp = 0;
		for (int row = 0; row < magic[0].length; row++)
		{
			for (int col = 0; col < magic.length; col++)
			{
				temp = temp + magic[row][col];
			}
			System.out.print(temp + " ");
			temp = 0;
		}


	}

	public void checkRows()
	{
		System.out.println();
		System.out.println("Checking Rows");
		System.out.println("=============");
		System.out.println();

		int temp = 0;
		for (int row = 0; row < magic.length; row++)
		{
			for (int col = 0; col < magic[0].length; col++)
			{
				temp = temp + magic[row][col];
			}
			System.out.println(temp);
			temp = 0;
		}

	}

	public void checkDiagonals()
	{
		System.out.println();
		System.out.println("Checking Diagonals");
		System.out.println("==================");
		System.out.println();

        int temp = 0;
		for (int j = 0; j < magic.length; j++)
		{
			temp = temp + magic[j][j];
		}
		
		System.out.print(temp + " ");
		temp = 0;
		
		for (int k = size-1; k >= 0; k--)
		{
			temp = temp + magic[k][k];
		}
		
		System.out.print(temp);
	}


}