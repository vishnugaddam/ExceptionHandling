package exceptionHandling;

public class ThrowsDemo2 {

	void m1() throws InterruptedException {
	System.out.println("vishnu m1 method");
	Thread.sleep(2000);
	}

	void m2() throws InterruptedException {
		m1();
	}

	void m3() {
		try {
			m2();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	void m4() {
		m3();

	}

	public static void main(String[] args) {
		ThrowsDemo2 t = new ThrowsDemo2();
		t.m4();

	}

}
