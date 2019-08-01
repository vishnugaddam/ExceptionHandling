package exceptionHandling;

public class FinallyDemo3 {
	
	void m1(){
		
		try {
			System.out.println(10/0);
			
		} catch (Exception e) {
			System.out.println(10/0);
			System.out.println("vishnu");
		}
		//System.out.println("vishnu");
		finally {
			try {
				System.out.println("vishnu".charAt(10));
			} catch (Exception e2) {
				System.out.println("finall block");
			}			
			System.out.println("ravi");
		}
		System.out.println("xtglobal");
	}

	public static void main(String[] args) {
		new FinallyDemo3().m1();
	}

}
