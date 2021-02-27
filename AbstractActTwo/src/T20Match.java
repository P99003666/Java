public class T20Match extends Match
{
	  public int calculateBalls(int currentOver)
	   {
		   int RemainingBalls;
		   RemainingBalls=(20-currentOver)*6;
		   return RemainingBalls;
	   }
	   public float calculateRunRate(int currentScore, int targetScore)
	   {
		   int remainingScore=targetScore-currentScore;
		   float runrate=(remainingScore/(calculateBalls()))/6;
		   return runrate;
		   
	   }
	   public void display(int currentScore, int targetScore,int overs)
	   {
		   
		   System.out.println("Need "+ (targetScore-currentScore) +"runs in " +((20-overs)*6) +"balls");
		   System.out.println("Required Runrate: " +((targetScore-currentScore)/(20-overs)));
	   }
	@Override
	public float calculateRunRate() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int calculateBalls() {
		// TODO Auto-generated method stub
		return 0;
	}

}