import java.util.*;
class ArrayDemo
{
	public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter value of n");
	 int n = sc.nextInt();
	int []a = new int[n];
	for(int i=0;i<n;i++)
	{
	System.out.println("Enter array value " + i);
		a[i] = sc.nextInt();
	}
	for(int j=0;j<n;j++)
	{
		System.out.println(a[j]);
	}
}
}