import java.util.Scanner;

class PhoneEntry
{
  private String firstname;    // name of a person
  private String lastname;
  private String phone;   // their phone number

  public PhoneEntry( String fn, String ln, String p )
  {
    firstname = fn; lastname = ln; phone = p;
  }
  
  public String getFirstName()  {return firstname;}
  public String getLastName()  {return lastname;}
  public String getPhone() {return phone;}
}

class PhoneBook
{ 
  private PhoneEntry[] phoneBook; 

  public PhoneBook()    // constructor
  {
    phoneBook = new PhoneEntry[ 6 ] ;

    phoneBook[0] = new PhoneEntry( "James", "Barclay", "(418) 665-1223" );
    phoneBook[1] = new PhoneEntry( "Grace", "Dunbar", "(860) 399-3044" );
    phoneBook[2] = new PhoneEntry( "Paul", "Kratides", "(815) 439-9271" );
    phoneBook[3] = new PhoneEntry( "Violet", "Smith", "(312) 223-1937" );
    phoneBook[4] = new PhoneEntry( "John", "Wood", "(913) 883-2874" );
    phoneBook[5] = new PhoneEntry( "Kylie", "Smith", "(729) 763-9997" );

  }

  public PhoneEntry search( String targetName )  
  {
    for ( int j=0; j < phoneBook.length; j++ )
    {
      if ( phoneBook[ j] != null && phoneBook[ j ].getLastName().equals( targetName ) )
        return phoneBook[ j ]; 
    }

    return null;
  }
}

public class PhoneBookTester
{
  public static void main ( String[] args )
  {
    PhoneBook pb = new PhoneBook();  
  
    // search for "Violet Smith"
    Scanner user_input = new Scanner(System.in);
    String last_name;
    System.out.println("Last Name?");
    last_name = user_input.next();

    String first_name;
    System.out.println("First Name?");
    first_name = user_input.next();

    PhoneEntry entry = pb.search(last_name); 

    if ( entry != null )
      for ( int j=0; j < 6; j++ ){
          if (PhoneEntry entry = pb.search(last_name)){ 
              System.out.println( entry.getLastName() + ": " + entry.getPhone() );
          }
      }
    else
      System.out.println("Name not found" );

  }
}