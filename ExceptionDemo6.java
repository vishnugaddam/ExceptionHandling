package exceptionHandling;

public class ExceptionDemo6 {

	public static void main(String[] args) {
		try {
			System.out.println(10/0);
		} catch (NullPointerException e) {
			System.out.println("vishnu");
		}catch (ArithmeticException e) {
			System.out.println("vardhan");
		}

	}

}
