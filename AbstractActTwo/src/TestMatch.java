public class TestMatch extends Match {

	public int calculateBalls(int C_over) {
		int RemainingBalls;
		RemainingBalls = 100;
		return RemainingBalls;
	}

	public float calculateRunRate(int currentScore, int targetScore) {
//		int remainingScore = targetScore - currentScore;
		float runrate = 0;
		return runrate;

	}

	public void display(int currentScore, int targetScore, int overs) {

		System.out.println("Need " + (targetScore - currentScore) + "runs in " + ((20 - overs) * 6) + "balls");
		System.out.println("Required Runrate: " + ((targetScore - currentScore) / (20 - overs)));
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