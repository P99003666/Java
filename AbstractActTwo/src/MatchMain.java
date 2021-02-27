import java.util.*;
public class MatchMain 
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
				
		System.out.println("Enter the Format for the match");
		System.out.println("1. ODI");
		System.out.println("2. T20");
		System.out.println("3. Test");
		int matchFormat=sc.nextInt();
		if(matchFormat == 1)
		{
			System.out.println("Enter the current score");
			int currentScore=sc.nextInt();
			System.out.println("Enter the current over");
			int currentOver=sc.nextInt();
			System.out.println("Enter the target score");
			int targetedScore =sc.nextInt();
			System.out.println("Requirements");
			ODIMatch om=new ODIMatch();
			om.calculateRunRate();
			om.calculateBalls();
			om.display(currentScore, currentOver, targetedScore);
		}
		else if(matchFormat == 2)
		{
			System.out.println("Enter the current score");
			int currentScore =sc.nextInt();
			System.out.println("Enter the current over");
			int currentOver =sc.nextInt();
			System.out.println("Enter the target score");
			int targetedScore=sc.nextInt();
			T20Match tm=new T20Match();
			tm.calculateRunRate();
			tm.calculateBalls();
			tm.display(currentScore, currentOver, targetedScore);
		}
		else if(matchFormat == 3)
		{
			System.out.println("Enter the current score");
			int currentScore=sc.nextInt();
			System.out.println("Enter the current over");
			int currentOver=sc.nextInt();
			System.out.println("Enter the target score");
			int targetedScore=sc.nextInt();
			TestMatch tem=new TestMatch();
			tem.calculateRunRate();
			tem.calculateBalls();
			tem.display(currentScore, currentOver, targetedScore);
		}
		else
		{
			System.out.println("Not a Valid Input");
		}

	}

}
