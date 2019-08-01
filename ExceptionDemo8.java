package exceptionHandling;

public class ExceptionDemo8 {

	public static void main(String[] args) {
		//Child to parent relation catch blocks
		try {
			System.out.println(10/0);
			
		}catch (ArithmeticException e) {
			System.out.println("child catch block");
		}
		catch (Exception e) {
			System.out.println("parent catch block");
		}

	}

}
