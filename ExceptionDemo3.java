package exceptionHandling;

public class ExceptionDemo3 {

	public static void main(String[] args) {
	try {
		System.out.println(10/0);
	} catch (NullPointerException e) {
		System.out.println("catch block");
	}System.out.println("rest of the code");

	}

}
