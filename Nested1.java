package exceptionHandling;

public class Nested1 {

	public static void main(String[] args) {
		
		 try {
			 System.out.println("1st try block");
			 try {
				String str=null;
				System.out.println(str.length());
			} catch (NullPointerException e) {
				
				System.out.println("2nd catch block");
			}
			
		} catch (ArithmeticException e) {
			
			System.out.println("1st catch block");
		}
		 System.out.println("vishnu");
	}

}
