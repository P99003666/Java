import java.util.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class PlayMain {

	public static void main(String[] args) 
	{
		ClassPlayer c = new ClassPlayer();
		PlayerBO bb = new PlayerBO();
		List<ClassPlayer> playerList = new ArrayList<ClassPlayer>();
		System.out.println("Enter the number of Players: ");
		Scanner sc = new Scanner(System.in);
		
		int s = sc.nextInt();
		sc.nextLine();

		for(int i=0;i<s-1;i++)
		{
			String a = sc.nextLine();
		}
		for(int i=0;i<s;i++)
		{
			String a = sc.nextLine();
			//playerList.add(a);
			String [] arr = a.split("\\,");
			c.setName(arr[0]);
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d-MM-yyyy");
			LocalDate date = LocalDate.parse(arr[1], formatter);
			
	       // LocalDate dateToString = LocalDate.parse(arr[1]);
			
			c.setDate1(date);
			
			c.setSkill(arr[2]);
			
			c.setNumber(Integer.parseInt(arr[3]));
			
			c.setRuns(Integer.parseInt(arr[4]));
			
			c.setWickets(Integer.parseInt(arr[5]));
			
			c.setNationality(arr[6]);
			
			double d=Double.parseDouble(arr[7]);  
			
			c.setPower(d);
		
			
			System.out.println("Enter a search type : ");
			
			System.out.println("1. By Nationality ");
			System.out.println("2. By Date of Birth ");
			System.out.println("3. By Power Rating");
			
			ClassPlayer obj = new ClassPlayer(arr[0],date,arr[2],Integer.parseInt(arr[3]),Integer.parseInt(arr[4]),Integer.parseInt(arr[5]),arr[6],Double.parseDouble(arr[7]));
			playerList.add(new ClassPlayer(c.getName(),c.getDate1(),c.getSkill(),c.getNumber(),c.getRuns(),c.getWickets(),c.getNationality(),c.getPower()));
			int ab = sc.nextInt();
			if(ab==1)
			{
				System.out.println("Enter the Nationality: ");
				
				String nation = sc.next();
				
				c.getNationality();
				
				bb.findPlayer(playerList,nation);
				
				System.out.format("%-15s %-15s %-15s %-20s %-15s %-15s %-15s %s\n","Name","Date of Birth","Skill","Number of Wickets","Runs","Wickets","Nationality","Power Rating");
				System.out.format("%-15s %-15s %-15s %-20s %-15s %-15s %-15s %s\n",obj.getName(),obj.getDate1(),obj.getSkill(),obj.getNumber(),obj.getRuns(),obj.getWickets(),obj.getNationality(),obj.getPower());
				
			}
		}
	}
}
