
public abstract class Match {
private int currentScore;
private float currentOver;
private int target;
public int getCurrentscore() {
	return currentScore;
}
public void setCurrentscore(int currentscore) {
	this.currentScore = currentscore;
}
public float getCurrentover() {
	return currentOver;
}
public void setCurrentover(float currentover) {
	this.currentOver = currentover;
}
public int getTarget() {
	return target;
}
public void setTarget(int target) {
	this.target = target;
}
   public abstract float calculateRunRate();
   public abstract int calculateBalls();
   public abstract void display (int currentScore, int targetScore,int overs);
}
