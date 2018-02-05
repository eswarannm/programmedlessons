import java.io.* ;

class ThreeSums
{

  public static void main ( String[] args ) 
  {
    int[] data = {3, 2, 5, 7, 9, 12, 97, 24, 54};
    
    // declare and initialize three sums
    int[] even = {2,12,24,54};
    int[] odd = {3,5,7,9,97};
    int total = 0;
    int totalEven = 0;
    int totalOdd = 0;
    
    
    // compute the sums
    for ( int index=0; index < data.length; index++)
    {
      total = total + data[index];
    }

    for ( int index=0; index < even.length; index++)
    {
      totalEven = totalEven + even[index];
    }

    for ( int index=0; index < odd.length; index++)
    {
      totalOdd = totalOdd + odd[index];
    }
      
    // write out the three sums
    System.out.println("Total of odd = " +  totalOdd );
    System.out.println("Total of even = " + totalEven);
    System.out.println("Total of all = " + total);

  }
}