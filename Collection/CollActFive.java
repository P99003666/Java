import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class CollActFive {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Players \n");
		System.out.println("Enter P1 \n");
		String teamOne = br.readLine();
		System.out.println("Enter Player 2 \n");
		String teamTwo =br.readLine();
		System.out.println("Enter Player 3 \n");
		String teamThree = br.readLine();
		System.out.println("Enter Player 4 \n");
		String teamFour = br.readLine();
		System.out.println("Enter Player 5 \n");
		String teamFive = br.readLine();
		HashSet<String> hs = new HashSet<String>();
		hs.add(teamOne);
		hs.add(teamTwo);
		hs.add(teamThree);
		hs.add(teamFour);
		hs.add(teamFive);
		System.out.println(hs);
		

		
		
	}
}
