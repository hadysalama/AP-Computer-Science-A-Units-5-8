import java.io.* ;

public class ThreeSums
{

  public static void main ( String[] args ) 
  {
    int[] data = {3, 2, 5, 7, 9, 12, 97, 24, 54};

    // declare and initialize three sums
    int sum = 0;
    int evenSum = 0;
    int oddSum = 0;

    // compute the sums
    for ( int i=0; i < data.length; i++)
    {
        sum += data[i];
        if (data[i] % 2 == 0)
      {
        evenSum += data[i];
      }
      if (data[i] % 2 == 1)
      {
        oddSum += data[i];
      }
    }
  
    // write out the three sums
    int[] threeSums = {sum, evenSum, oddSum};
    for (int val: threeSums)
    {
    System.out.print(val + " ");
    }

  }
}      