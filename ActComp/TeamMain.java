import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class TeamMain {
	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		ArrayList<Team> al=new ArrayList<Team>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter no of teams");
	int n=sc.nextInt();
	for(int i=0;i<n;i++)
	{
		System.out.println("Enter Team "+(i+1)+ " details");
		System.out.println("Enter Name");
		String name=br.readLine();
		System.out.println("Enter Team no of matches");
		int no=Integer.parseInt(br.readLine());
			
		al.add(new Team(name, no));
	}
	
	Collections.sort(al,new TeamComp());  
	for(Team s:al)
	{
		System.out.println(s);
	}
	}
}





