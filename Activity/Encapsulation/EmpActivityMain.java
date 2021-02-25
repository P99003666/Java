import java.util.*;
class EmpActivityMain{
	public static void main(String[] args)
	{
		EmpActivity e = new EmpActivity();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name");
		String name = sc.next();
		System.out.println("Enter Address");
		String address= sc.next();
		System.out.println("Enter Mobile Number");
		String mNo = sc.next();
		e.setNumber(mNo);
		e.setName(name);
		e.setAddress(address);
		System.out.println(e.getNumber() + " " + e.getName() + " "+ e.getAddress());
	}	
}