package exceptionHandling;

public class FinallyDemo4 {

	public static void main(String[] args) {
		//In below two cases finally block won't be executed
		// if the cursor entered in to the try block then only finally block will execute
/*
		System.out.println(10/0);
		try {
			System.out.println("try block");
		} finally {
			System.out.println("finally block");
		}
		System.out.println("rest of the code");
		*/
		try {
			System.out.println("vishnu");
			System.exit(0); //jvm will shutdown hence finally block and rest of the code won't be executed
		} finally {
			System.out.println("final block");
		}
		System.out.println("rest of the app");
	}

}
