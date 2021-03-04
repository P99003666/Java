import java.util.Scanner;

public class MarkMeanMain {

	public static void main(String[] args) throws InterruptedException {

		Scanner sc= new Scanner(System.in);
	       

		System.out.println("Enter the Match ");
        String match1=sc.next();
        System.out.println("Enter the Scores");
        String score1=sc.next();
        
        Thread t1=new CalculateScores(match1,score1);
        
        System.out.println("Enter the Match ");
        String match2=sc.next();
        System.out.println("Enter the Scores");
        String score2=sc.next();
        
        Thread t2=new CalculateScores(match2,score2);
        
        System.out.println("Enter the Match ");
        String match3=sc.next();
        System.out.println("Enter the Scores");
        String score3=sc.next();
        
        Thread t3=new CalculateScores(match3,score3);
        
        t1.start();
        t1.join();
        t2.start();
        t2.join();
        t3.start();
        t3.join();

	}

}
