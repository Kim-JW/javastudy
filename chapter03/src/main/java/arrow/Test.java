package arrow;

public class Test {
	public static void test(ITest i) {
		i.test(10);
	}

	public static void main(String[] args) {
		// ex01
		test(new ITestImpl());

		// ex02 Anonymous Class
		test(new ITest() {

			@Override
			public void test(Integer val) {
				System.out.println("test");

			}
		});

		// ex03 : Lambda Method
		test((Integer val) -> {
			System.out.println("test" + val);
			
		});
		
		
		
		
		// test(val -> val*10);
	
	}
}
