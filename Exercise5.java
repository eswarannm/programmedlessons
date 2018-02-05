class Exercise5
{
  public static void main ( String[] args )
  {
    int[] val = {0, 1, 2, 3}; 
    int[] valA = {0, 1, 2, 3};
    int temp = 0;
 
    System.out.println( "Original Array: " 
        + val[0] + " " + val[1] + " " + val[2] + " " + val[3] );


    val[0] = valA[3];
    val[1] = valA[2];
    val[2] = valA[1];
    val[3] = valA[0];

    System.out.println( "Reversed Array: " 
        + val[0] + " " + val[1] + " " + val[2] + " " + val[3] );
   }
}