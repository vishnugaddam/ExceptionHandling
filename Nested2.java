package exceptionHandling;

public class Nested2 {

	public static void main(String[] args) {
	try {
		System.out.println(10/0);
		
	} catch (ArithmeticException e) {
		
		System.out.println("1st catch block");
		try {
			System.out.println("2nd try block");
		} catch (Exception e2) {
			System.out.println("2nd catch block");
			
		}
	}
	System.out.println("rest of the app");

	}

}
