package exceptionHandling;

public class FinallyDemo1 {

	public static void main(String[] args) {
		/*case 1:related catch block
		case 2: related catch block not found
		case 3: it is possible to provide try with finally block*/
		try {
			System.out.println(10/0);
		}
		/* catch (ArithmeticException e) {
			System.out.println("catch block");
		}*/
		finally {
			System.out.println("final block");
		}

	}

}
