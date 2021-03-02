import java.util.Comparator;

public class TeamComp implements Comparator <Team>
	{

		@Override
		public int compare(Team o1, Team o2) {
			if(o1.numberOfMatches==o2.numberOfMatches)  
				return 0;  
			
				else if(o1.numberOfMatches > o2.numberOfMatches)  
				return 1;  
				
				else  
				return -1; 
		}
}