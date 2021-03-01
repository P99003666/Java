import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class CollActThree {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Top Scorer in season one \n");
		System.out.println("Enter Team \n");
		String teamOne = br.readLine();
		System.out.println("Enter Player Age \n");
		String teamTwo =br.readLine();
		System.out.println("Enter PlayerCountry \n");
		String teamThree = br.readLine();
		System.out.println("Enter PlayerCountry \n");
		String teamFour = br.readLine();
		System.out.println("Enter PlayerCountry \n");
		String teamFive = br.readLine();
		ArrayList al = new ArrayList();
		al.add(teamOne);
		al.add(teamTwo);
		al.add(teamThree);
		al.add(teamFour);
		al.add(teamFive);
		System.out.println(al);		
		System.out.println("Top Scorer in season Two \n");
		System.out.println("Enter Team \n");
		String team1One = br.readLine();
		System.out.println("Enter Player Age \n");
		String team1Two =br.readLine();
		System.out.println("Enter PlayerCountry \n");
		String team1Three = br.readLine();
		System.out.println("Enter PlayerCountry \n");
		String team1Four = br.readLine();
		System.out.println("Enter PlayerCountry \n");
		String team1Five = br.readLine();
		ArrayList all = new ArrayList();
		all.add(team1One);
		all.add(team1Two);
		all.add(team1Three);
		all.add(team1Four);
		all.add(team1Five);
		System.out.println(al);		
		  al.retainAll(all); 
		  
	        // print list 1 
	        System.out.println("Common elements: "	                           + al); 
		
	}
}

