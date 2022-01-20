package prob3;

public class Sparrow extends Bird {

	@Override
	protected void fly() {
		System.out.println("오리(" + name +")" +"는 날아다닙니다.");
		
	}

	@Override
	protected void sing() {
		System.out.println("오리(" + name +")" +"가 소리내어 웁니다.");
		
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "참새의 이름은 " + name + "입니다.";
	}
}
