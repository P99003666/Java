import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArithmaticExcep {
	public static void main(String[] args) throws NumberFormatException, IOException {
		try
		{
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter total runs scored \n");
			int totalRunsScored = Integer.parseInt(br.readLine());
			System.out.println("Enter total over faced \n");
			int totalOversFaced = Integer.parseInt(br.readLine());
			double result = (totalRunsScored/totalOversFaced);
			System.out.println("Current Rate "+ result);
			
		}
		catch(Exception e)
		{
			System.out.println("Exception " + e);
		}
	}
	
}
