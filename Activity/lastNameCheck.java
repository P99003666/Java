import java.util.*;
class LastNameCheck
{
    public static void main(String[] args)
    {
    Scanner sc = new Scanner(System.in);
	String s1 = sc.nextLine();
	String s2 = sc.nextLine();
    String s1LastName = s1.substring( s1.indexOf(' ') + 1);
    String s2LastName = s2.substring( s2.indexOf(' ') + 1);
    // System.out.println("I ma from s1" + s1LastName + " I am from s2 " + s2LastName);
    if(s1LastName.equals(s2LastName))
    {
        System.out.println("Yes");
    }
    else
    {
        System.out.println("No");
    }
    }
}
