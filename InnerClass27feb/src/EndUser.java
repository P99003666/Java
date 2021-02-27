
public class EndUser {
	public static void main(String[] args) {
		StreamPopCorn sp = new StreamPopCorn();
		System.out.println("Color "  );
		sp.color();
		System.out.println("Tatse " );
		sp.taste();
		StreamPopCorn sp2 = new StreamPopCorn()
		{
			public void taste()
			{
				System.out.println("Sweet");
			}
		};
		sp2.taste();
	}
}
