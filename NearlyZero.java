
import java.io.* ;

class NearlyZero
{

  public static void main ( String[] args )
  {
    int[] data = {3, 1, 5, 7, 4, 12, -3, 8, -2};
    
    // declare and initialize variables
    int difference = Math.abs(data[0] - 0);
    int position = 0;
    
    // find the element nearest to zero
    for(int i = 1; i < data.length; i++){
      int new_difference = Math.abs(data[i] - 0);
      if(new_difference < difference){
        position = i;
        difference = new_difference;
      }
    }
      
    int closest = data[position];
    System.out.println( closest );

  }
}  