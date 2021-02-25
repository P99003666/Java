import java.util.*;
class InningsMain{
	public static void main(String[] args)
	{
		Inning i = new Inning();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Team Name");
		String teamName = sc.nextLine();
		System.out.println("Enter Session");
		String innName = sc.nextLine();
		System.out.println("Enter Runs");
		int runs= sc.nextInt();
		i.setTeamName(teamName);
		i.setInningName(innName);
		i.setRuns(runs);
		i.dispalyInningDetails(innName);
	}	

}