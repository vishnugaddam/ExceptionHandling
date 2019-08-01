package exceptionHandling;

public class ExceptionDemo5 {

	public static void main(String[] args) {
	try {
		System.out.println(10/0);
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println(10/0);
	}System.out.println("rest of the app");
	}

}
