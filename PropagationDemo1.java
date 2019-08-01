package exceptionHandling;

public class PropagationDemo1 {

	void m3()  {
		System.out.println(10 / 0);
	}

	void m2()  {
		m3();
	}

	void m1() {
		m2();
		/*try {
			m2();
		} catch (ArithmeticException e) {
			System.out.println("exception propagation");

		}*/
	}

	public static void main(String[] args) throws Exception {
		new PropagationDemo1().m1();

	}

}
