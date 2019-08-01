package exceptionHandling;

public class ThrowDemo2 {
	static void m1(int age) {
		try{
		if(age>18){
			System.out.println("you are eligible ");
		}
			else{
				
				throw new Exception("");
			}
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		m1(17);
		System.out.println("rest of the code");
	

	}

}
