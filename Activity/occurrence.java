import java.util.Scanner;
import java.util.*;
class Occurrence
{
    static int findElementCount(int size, int arr[], int searchElem) 
    { 
	int countOccurrence = 0;
	for(int i=0;i<size; i++)
	{
		if(searchElem == arr[i])
		{
			countOccurrence++;
			}
	}
	return countOccurrence;
    } 
  public static void main (String args[])
  {
	Scanner sc = new Scanner(System.in);
	int elem, size;
	System.out.println("Enter size");
	size = sc.nextInt();
		if(size < 0)
	{
	    System.out.println("Invalid Input")
	}
	else{
	int arrayElem[] = new int[size];
		System.out.println("Enter array");
	for(int i=0;i<size;i++)
	{	
		
		arrayElem[i] = sc.nextInt();
		if(arrayElem[i]<0)
		{
		    System.out.println("Invalid Input");
		}
		break;
					
	}
	
	System.out.println("Enter Element to be searched");
	elem = sc.nextInt();
		System.out.println("Occurred " + findElementCount(size, arrayElem, elem));
	}
}
}
