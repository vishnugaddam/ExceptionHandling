package exceptionHandling;

public class ThrowDemo1 {
	
	static void m1(int age) throws Exception{
		try{
		if(age>18){
			System.out.println("you are eligible ");
		}
			else{
				System.out.println("san"); 
			
				throw new ArithmeticException();
			}
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws Exception {
		m1(17);
		System.out.println("rest of the code");
	}

}
