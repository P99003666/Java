//
//public class Arithmetic {
//	public static void main(String[] args) {
////		int a = 0;
////		int b =10;
////		int c = b/a;
////		System.out.println(c);  //Arithmatic Excepion
//		
//		try {
//			System.out.println("This will give an exception");
//			int a = 10/0;
//			System.out.println(a);
//			
//		}
//		catch(Exception e){
//			System.out.println("Exxeption " + e);
//		}
//		finally {
//			System.out.println("I am in finally block");
//		}
//		try {
//			System.out.println("This is nullPomiter exception");
//			String s = null;
//			System.out.println(s.length());
//		}
//		catch(Exception e) {
//			System.out.println("Exxeption " + e);
//		}
//		finally {
//			System.out.println("I am in finally block null pointer");
//		}
//		try
//		{
//			int [] arr = new int[2];
//			System.out.println(arr[4]);
//		}
//		catch(Exception e)
//		{
//			System.out.println("Exxeption " + e);
//		}
//		finally {
//			System.out.println("Finnaly array out of bound exception ");
//		}
//	}
//}


class InvalidAgeException extends Exception{
	InvalidAgeException(){
				System.out.println("You are under age"); //user defined exception
	}
}
class Arithmetic {
		public static void main(String[] args) throws InvalidAgeException{
			int age = 25;
			 if(age<18)
			 {
				 throw new InvalidAgeException();
			 }
			 else
			 {
				 System.out.println("Worked");
			 }
		}
}