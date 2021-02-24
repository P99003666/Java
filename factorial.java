import java.util.Scanner;
import java.util.*;
class Arithmetic
{
    static int factorial(int n) 
    { 
        int f = 1; 
        for (int i = 1; i <= n; i++) { 
            f *= i; 
        } 
        return f; 
    } 
  public static void main (String args[])
  {
    int n, temp, digit, count = 0, fact = 1;
    int nextIndex = 0;
    int[] intArray = new int[3];
    Scanner sc = new Scanner (System.in);

      System.out.print ("Enter any number: ");
      n = sc.nextInt ();
      temp = n;

    while (n > 0)
      {

	n = n / 10;

	count++;
      }
    while (temp > 0)
      {
	digit = temp % 10;

	System.out.println (digit);
	intArray[nextIndex] = digit;
	++nextIndex;
	temp = temp / 10;
	count--;
      }
    for (int k = 0; k < intArray.length; k++)
      {
	System.out.println (intArray[k]);
      }
    for (int i = intArray.length - 1; i >= 0; i--)
    {
        
      System.out.println(intArray[i] + "  ");
      System.out.println(factorial(intArray[i]));
}
}
}
