import java.util.ArrayList;
import java.util.List;

public class Team {
	private String name;
	private List <Player> playerList= new ArrayList<Player>();
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Player> getPl() {
		return playerList;
	}
	public void setPl(List<Player> pl) {
		this.playerList = pl;
	}
	public Team(String name, List<Player> playerList) {
		super();
		this.name = name;
		this.playerList = playerList;
	}
	
			
			
	
}
