package exceptionHandling;

public class ExceptionDemo9 {

	public static void main(String[] args) {
		String str="vishnu";
		try {
			System.out.println(10/0);
			System.out.println(str.charAt(10));

		} catch (ArithmeticException | StringIndexOutOfBoundsException e) {
			System.out.println("10/0 exception");

		} /*catch (NullPointerException | StringIndexOutOfBoundsException e) {
			System.out.println("String exception");

		}*/

	}

}
