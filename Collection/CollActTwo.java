import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class CollActTwo {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
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
		int swap = Integer.parseInt(br.readLine());	
		Collections.swap(al, swap, 2);
		System.out.println("klsdkl" + al);		
		
	}
}

