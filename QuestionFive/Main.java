import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// List <Player> l1 = new List<Player>();
		ArrayList<Player> a = new ArrayList<Player>();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of players: ");
		int number = Integer.parseInt(br.readLine());
//		
//		 System.out.println("Enter the number of players: ");
//		String s = sc.next();
//		String[] arr = s.split("s\\,");
		Player[] playerArr = new Player[number];
		for(int i =0;i<number;i++)
		{
			System.out.println("Enter player details " + (i+1));
			String s = br.readLine();
			playerArr[i] = Player.createPlayer(s);
		}

		Player p = new Player();
		p.setName(arr[0]);
		String s1 = arr[1];

		LocalDate d1 = LocalDate.parse(s1);

		p.setDateOfBirth(d1);
		p.setSkill(arr[2]);
		p.setNumberOfMatches(Integer.parseInt(arr[3]));
		p.setRuns(Integer.parseInt(arr[4]));
		p.setWickets(Integer.parseInt(arr[5]));
		p.setNationality(arr[6]);
		p.setPowerRating(Double.parseDouble(arr[7]));

		a.add(new Player(p.getName(), p.getDateOfBirth(), p.getSkill(), p.getNumberOfMatches(), p.getRuns(),
				p.getWickets(), p.getNationality(), p.getPowerRating()));

		p.calculateNationalityCount(a);

		// System.out.println(tm);

	}
}