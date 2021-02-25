import java.util.*;
class ChangeCharacters
{
    public static void main(String[] args)
    {
    Scanner sc = new Scanner(System.in);
	String s1 = sc.nextLine();
	String s2 = sc.nextLine();
    char firstLetter = s1.charAt(0);
    char lastLetter = s1.charAt(s1.length() - 1);
     String remainOne = s1.substring(1, s1.length()-1);
    if(Character.isLowerCase(firstLetter) || Character.isLowerCase(lastLetter))
    {
       firstLetter = Character.toUpperCase(firstLetter);
       lastLetter = Character.toLowerCase(lastLetter);
       String a = Character.toString(firstLetter);
       String b = Character.toString(lastLetter);
      s1 = a.concat(remainOne);
      s1 = s1.concat(b);
    }
     s2 = s2.toUpperCase();
    s1 = s1.concat(" ").concat(s2);
    System.out.println("Name: " + s1);
  
    }
}
