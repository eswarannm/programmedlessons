import java.io.* ;

class ColumnSums
{

  public static void main ( String[] args ) 
  {
    int[][] data = { {3, 2, 5},
                     {1, 4, 4, 8, 13},
                     {9, 1, 0, 2},
                     {0, 2, 6, 3, -1, -8} };
    
    int max = data[0].length;

    for (int row=0; row < data.length; row++) {
      if (data[row].length > max) {max = data[row].length;}
    }

    int[] ColSums = new int[max];

    for ( int row=0; row < data.length; row++)
    {
      for ( int col=0; col < data[row].length; col++) 
      {
        ColSums[col] += data[row][col];
      }
    }

    for (int row=0; row < ColSums.length; row++) {
      System.out.println("Sum for the column: " + ColSums[row]);
    }

  }
      
}