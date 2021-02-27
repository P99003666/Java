import java.util.Arrays;
import java.util.Scanner;

class TeamNotFound extends Exception{
	TeamNotFound(){
		System.out.println("TeamNot Found"); //user defined exception
	}
}

public class CustomTeamName {
	static void validate(String ruunerUp, String winner)throws AgeException{
		String [] teams = new String[]{"Chennai Super Kings","Sun Risers Hyderabad","Delhi Capitals","Kolkata Knight Riders","Mumbai Indians","Royal Challengers Bangalore","Rajasthan Royals"};
		int[] values = null;
		boolean teamOneFound = Arrays.stream(values).anyMatch(ruunerUp ::equals);
 		boolean teamTwoFound = Arrays.stream(values).anyMatch(winner ::equals);
		
	     if(teamOneFound && teamTwoFound)
	     {
	    	 System.out.println("Player's name \n" + ruunerUp);
			 System.out.println("Player's age \n" + winner);	
	    	
	     }
	      
	     else
	      {
	    	 throw new AgeException();
	      }
	   }
	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Runner name \n");
		String runnerUp = sc.nextLine();
		System.out.println("Enter Winner age \n");
		String winner = sc.nextLine();
		
		try
		{
			validate(runnerUp, winner);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
