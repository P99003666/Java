import java.util.*;
public class DemoCollection {
	public static void main(String[] args) {
//		ArrayList al  = new ArrayList();
//		ArrayList<Integer> al = new ArrayList();
//		al.add(1);
//		al.add("Yash");
//		al.add(10.5);
//		System.out.println(al);
//		al.add(1);
//		al.add(new Person ("Yash", 25));
//		System.out.println(al.get(0));
//		System.out.println(al.remove(0));
//		System.out.println(al.remove(1));
//		System.out.println(al.get(0));
		
		
		LinkedList <String> ll = new LinkedList();
		ll.add("yahs");
		ll.add("Somya");
		ll.add("Shreyansh");
		System.out.println(ll);
		//Ascending order
		Collections.sort(ll);
		for(String s : ll)
		{
			System.out.println(s); //for descending we can reverse the arraylist
			
		}
		
	}
}
