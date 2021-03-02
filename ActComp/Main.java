import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Number of records");
		int numberOfPlayers = Integer.parseInt(br.readLine());
		ArrayList<Player> al = new ArrayList<Player>();
		for (int i = 0; i < numberOfPlayers; i++) 
		{
			System.out.println("Enter player name \n");
			String playerName = br.readLine();
			System.out.println("Please select skill of the player \n");
			System.out.println("1. Batsman \n 2.Bowler \n 3.All Rounder");
			int skill = Integer.parseInt(br.readLine());
			String skillStr = "";
			if(skill == 1)
			{
				skillStr = "BatsMan";
			}
			else if(skill == 2)
			{
				skillStr = "Bowler";
			}
			else if(skill==3)
			{
				skillStr = "AllRounder";
				
				
			}
			else
			{
				System.out.println("Invalid Input");
			}
			al.add(new Player(playerName,skillStr));
		}
		
		Collections.sort(al, new PlayerCom());  
		for(Player s:al)
		{
			System.out.println(s);
		}
		
	}
	
}
