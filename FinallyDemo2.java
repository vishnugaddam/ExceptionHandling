package exceptionHandling;

public class FinallyDemo2 {

	
	int m1(){
		try {
			return 10;
		} catch (Exception e) {
			return 20;
		}
		finally {
			return 30;
		}
		
	}
	public static void main(String[] args) {
		//final vs return type
		int a=new FinallyDemo2().m1();
		System.out.println("return value: "+a);
	}

}
