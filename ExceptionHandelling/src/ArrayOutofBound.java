//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
import java.util.*;

public class ArrayOutofBound {
	public static void main(String[] args) {
		try
		{
			
//			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Number of overs \n");
			int overs = sc.nextInt();
			System.out.println("Enter runs \n");
			int [] arr = new int[overs];
			for (int i = 0; i < overs; i++) {
				System.out.println("Enter run " + i);
				arr[i] = sc.nextInt();
			}
			System.out.println("Enter the over number");
			int overNumber = sc.nextInt();
			System.out.println("Runs Scored in this over " + arr[overNumber-1]);
			
		}
		catch(Exception e)
		{
			System.out.println("Exception " + e);
		}
	}
}
