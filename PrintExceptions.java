package exceptionHandling;

public class PrintExceptions {

	public static void main(String[] args) {
		try {
			System.out.println(10/0);
		} catch (ArithmeticException ae) {
			
			System.out.println(ae.toString());
			System.out.println(ae.getMessage());
			ae.printStackTrace();
			
			
		}

	}

}
