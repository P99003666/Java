import java.util.*;
public class Inning
{
	private String teamName;
	private String inningName;
	private int runs;
	public String getTeamName(){
		return teamName;
	}
	public String getInningName(){
		return inningName;
	}
	public int getRuns(){
		return runs;
	}

	public void setTeamName(String teamName){
		this.teamName = teamName;
	}
	public void setInningName(String inningName){
		this.inningName = inningName;
	}
	public void setRuns(int runs){
		this.runs = runs;
	}
	 public void dispalyInningDetails(String inningName)
	{	
		if(inningName.equals("first") || inningName.equals("First" ))
		{
			System.out.println("Name:" + " " + getTeamName() + " " + "Scored " + getRuns() + "Need " + (getRuns() + 1) + " to win");
		}
		else 
		{
			System.out.println("Name:" + " " + getTeamName() + " " + "Scored " + getRuns() +" " + "Match Ended.");
		}	
		
	}
}