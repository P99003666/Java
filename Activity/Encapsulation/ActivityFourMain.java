import java.util.*;
class ActivityFourMain{
	public static void main(String[] args)
	{
		ActivityFour i = new ActivityFour();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Company Name");
		String cmpName = sc.nextLine();
		System.out.println("Enter Employee Names");
		String emp = sc.nextLine();
		System.out.println("Enter Team Lead");
		String tmLd= sc.nextLine();
		i.setCompanyName(cmpName);
		i.setEmployee(emp);
		i.setTeamLead(tmLd);
	System.out.println(i.getCompanyName + " " + i.getEmployee + " " + i.getTeamLead );
	}	

}