package exception;

import java.io.IOException;

public class MyClassTest {

	public static void main(String[] args) {
		MyClass mc = new MyClass();
		
		try {
			mc.danger();
		} catch (Exception e) {
			System.out.println("error.. " + e);
			
		}

	}

}
