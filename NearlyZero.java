import java.io.* ;

class NearlyZero
{

  public static void main ( String[] args )
  {
    int[] data = {3, 1, 5, 7, 4, 12, -3, 8, -2};
    int min;
    min = data[0];


    
    // declare and initialize variables
    
    // find the element nearest to zero
    for (int val=1;val>0;val++){
      if (val < 0){
        java.lang.Math.abs(val);

        if (val<min){
          min = val;
        }
      }
    }
      
    // write out the element nearest to zero
    System.out.println( min );

  }
}  