import java.util.*;
class Leap{

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int yearValue = sc.nextInt();
    boolean isLeapYear = false;

    if (yearValue % 4 == 0) {

      if yearValue % 100 == 0) {

        if (yearValue % 400 == 0)
	{
	  isLeapYear = true;
	}
        
        else 
	{
          isLeapYear = false;
	}
      }
      else
	{
	isLeapYear = true;
	}
    }
    
    else
     {
	isLeapYear = false;
	}
    if (isLeapYear)
	{
	System.out.println("Yes");
	}
      
    else
	{
 	System.out.println("No");
	}
     
  }
}