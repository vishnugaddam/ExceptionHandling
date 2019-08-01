package exceptionHandling;

public class Error1 {
void m1(){
	m2();
	System.out.println("m1 method");
}
void m2(){
	m1();
	System.out.println("m2 method");
}
	public static void main(String[] args) {
		//stackoverflow
		
		new Error1().m1();
		
	}

}
