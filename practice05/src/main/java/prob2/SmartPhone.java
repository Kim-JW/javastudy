package prob2;

public class SmartPhone extends MusicPhone {
	@Override
	public void execute(String function) {
		
		if(function.equals("앱")) {
			System.out.println("앱실행");
			
		} else {
			super.execute(function);
			
		}
		
	}
	
	
}
