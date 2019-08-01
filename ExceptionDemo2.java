package exceptionHandling;

public class ExceptionDemo2 {

	public static void main(String[] args) {
	System.out.println("vishnu");
	try {
		System.out.println(10/0);
	} catch (Exception e) {
		System.out.println(10/2);
	}
	System.out.println("rest of the code");
	}

}
