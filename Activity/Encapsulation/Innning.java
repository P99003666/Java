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
	public String getRuns(){
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
	public void dispalyInningDetails(){
		if(inningName == "first")
		{
			System.out.println("Name:" + "" + i.getTeamName() + "" + "Scored " + i.getRuns() + "Need" + (i.getRuns + 1) + "to win")
		}
		else
		{
			System.out.println("Name:" + "" + i.getTeamName() + "" + "Scored " + i.getRuns() + "Match Ended.")
		}	
		
	}
}