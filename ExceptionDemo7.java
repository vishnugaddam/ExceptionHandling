package exceptionHandling;

public class ExceptionDemo7 {

	public static void main(String[] args) {
		String str="vishnu";
		
		try {
			System.out.println(10/0);
			System.out.println(str.charAt(10));
		} catch (Exception e) {
			System.out.println("exception block");
		}
		System.out.println("rest of the code");

	}

}
