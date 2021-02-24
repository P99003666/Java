import java.util.*;
class Arithmatic{
  static void performArithmeticOperation(int input1, int input2, int operator) {
	int result = 0;
	if(input1 < -1 || input2 < -1 || input1>32767 || input2>32767 )
	{
		System.out.println("-1");
	}
	else if(operator == 1)
	{
	System.out.println(input1+input2);	
	}
	else if(operator == 2)
	{
		
		System.out.println(input1-input2);	
	}
	else if(operator == 3)
	{
	System.out.println(input1*input2);	
	
	}
	else if(operator == 4)
	{
		System.out.println(input1/input2);	
	}
	else
	{
	  System.out.println("Invalid Operator");
	}
	
}   

  public static void main(String[] args) {
	int inp1, inp2, inp3;
	Scanner sc = new Scanner(System.in);
	 System.out.println("Enter Value of a");
	 inp1 = sc.nextInt();
	System.out.println("Enter Value of b");
	 inp2 = sc.nextInt();
	System.out.println("Enter Value of Operator");
	 inp3 = sc.nextInt();
	performArithmeticOperation(inp1,inp2, inp3);
   	
  }
}