import java.util.*;
public class AreaMain {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Circle");
		System.out.println("Square");
		System.out.println("Enter the shape (Either Circle or Square)");
		String shape = sc.nextLine();
		if(shape.equalsIgnoreCase("Square"))
		{
			Square s=new Square();
			System.out.println("Enter value for the side of square");
			int side=sc.nextInt();
			s.calculateArea(side);
		}
		else if(shape.equalsIgnoreCase("Circle"))
		{
			Circle c=new Circle();
			System.out.println("Enter the Radius of the circle");
			int radius=sc.nextInt();
			c.calculateArea(radius);
		}
		else
		{
			System.out.println("Not a Valid Input");
		}
	}

}
