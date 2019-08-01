package exceptionHandling;

public class ClassNF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Class.forName("com.exceptionHandling.invisibleclass");
			ClassLoader.getSystemClassLoader().loadClass("com.exceptionHandling.invisibleclass");
			//ClassLoader.getPlatformClassLoader().loadClass("com.exceptionHandling.invisibleclass");
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
