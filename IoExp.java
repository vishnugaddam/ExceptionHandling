package exceptionHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class IoExp {
	FileInputStream fis=null;
	
	public void m1() throws FileNotFoundException{		
			File file=new File("vishnu.txt");
			 fis=new FileInputStream(file);
			
		
			System.out.println("catch block");
			
		System.out.println("rest of the app");
		
	}
	
		/*finally {
			try {
				if(fis!=null){
					fis.close();					
				}
				
			} catch (IOException e2) {
				e2.printStackTrace();
			}
			
		}return fis;
		
	}*/

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		IoExp ie=new IoExp();
		ie.m1();
	}

}
