import java.util.Scanner;
import java.util.*;
class HighestScore
{
  static int arry[] = new int[20];
    static void cricket(int size, int arr[], int score)
    {
    for (int i = 1; i<= size; i = i+2)
      {
	if (arr[i] > score)
	  {
	  arry[i] = arr[i - 1];
      }
  }
   for (int k = 1; k<= size; k = k+2)
      {
	  System.out.println(arry[k]);
  }
  
  
    }
  public static void main (String args[])
  {
    int elems, compScore;
    int[] intArray = new int[20];
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Number of elements");
    elems = sc.nextInt();
	if(elems%2!=0)
	{
	System.out.println("An even number is required");
	}
else
{
    for(int i =0 ; i<elems ; i++)
    {
        System.out.println("Enter Elem " + i);
        intArray[i] = sc.nextInt();
    }
    compScore = sc.nextInt();
    cricket(elems, intArray, compScore);

    }
  }
}