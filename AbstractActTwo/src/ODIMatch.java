public class ODIMatch extends Match
{
	 
	   public int calculateBalls(int currentOver)
	   {
		   int RemainingBalls;
		   RemainingBalls=(50-currentOver)*6;
		   return RemainingBalls;
	   }
	   public float calculateRunRate(int currentScore, int targetScore)
	   {
		   int remainingScore=targetScore-currentScore;
		   float runRate=(remainingScore/(calculateBalls()))/6;
		   return runRate;
		   
	   }
	   public void display(int currentScore, int targetScore,int overs)
	   {
		   
		   System.out.println("Need "+ (targetScore-currentScore) +"runs in " +((50-overs)*6) +" balls");
		   System.out.println("Required Runrate: " +((targetScore-currentScore)/(50-overs)));
	   }
	@Override
	public float calculateRunRate() {
		return 0;
	}
	@Override
	public int calculateBalls() {
		return 0;
	}
}
