import java.util.Arrays;
import java.util.*;
class TeamNotFound extends Exception{
	TeamNotFound(){
		System.out.println("TeamNot Found"); //user defined exception
	}
}

public class CustomTeamName {
	static void validate(String ruunerUp, String winner)throws TeamNotFound{
		String [] teams = new String[]{"Chennai Super Kings","Sun Risers Hyderabad","Delhi Capitals","Kolkata Knight Riders","Mumbai Indians","Royal Challengers Bangalore","Rajasthan Royals"};
		boolean teamOneFound = Arrays.stream(teams).anyMatch(ruunerUp ::equals);
 		boolean teamTwoFound = Arrays.stream(teams).anyMatch(winner ::equals);
		
	     if(teamOneFound && teamTwoFound)
	     {
	    	 System.out.println("RunnerUp \n" + ruunerUp);
			 System.out.println("Winner  \n" + winner);	
	    	
	     }
	      
	     else
	      {
	    	 throw new TeamNotFound();
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
