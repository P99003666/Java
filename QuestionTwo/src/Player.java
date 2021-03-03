import java.time.LocalDate;

public class Player {
	private String name;
	private String skill;
	private LocalDate dateOfBirth;
	private int noOfMatch;
	private int runs;
	private int wickets;
	private String nationality;
	private double powerRating;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	public int getNoOfMatch() {
		return noOfMatch;
	}
	public void setNoOfMatch(int noOfMatch) {
		this.noOfMatch = noOfMatch;
	}
	public int getRuns() {
		return runs;
	}
	public void setRuns(int runs) {
		this.runs = runs;
	}
	public int getWickets() {
		return wickets;
	}
	public void setWickets(int wickets) {
		this.wickets = wickets;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public double getPowerRating() {
		return powerRating;
	}
	public void setPowerRating(double powerRating) {
		this.powerRating = powerRating;
	}
	public Player(String name, LocalDate dateOfBirth, String skill, int noOfMatch, int runs, int wickets,
			String nationality, double powerRating) {
		super();
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.skill = skill;
		this.noOfMatch = noOfMatch;
		this.runs = runs;
		this.wickets = wickets;
		this.nationality = nationality;
		this.powerRating = powerRating;
	}	
//	public static Player createPlayer(String name)
//	{
//		String[] st = name.split(",");
//		Player P = new Player();
//		return P;
//		
//	}
	
}
