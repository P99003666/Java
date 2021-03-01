import java.util.*;

public class CollActFour {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numberOfMatch = sc.nextInt();
		ArrayList<Integer> al = new ArrayList<Integer>();
		for(int i=0;i<numberOfMatch; i++)
		{
			int j = sc.nextInt();
			al.add(j);	
		}
		int countFifty = 0, countHun = 0;

		 for (Integer i : al) 
		 {
	          if(i>50 && i<100)
	          {
	        	  countFifty++;
	          } 
        if( i >=100)
	          {
	        	countHun++;  
          }
		
		 }
		 System.out.println(countFifty);
		 System.out.println(countHun);

	}
}
