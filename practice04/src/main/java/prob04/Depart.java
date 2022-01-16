package prob04;

public class Depart extends Employee {
	private String department;

	public Depart() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Depart(String name, int salary, String department) {
		super(name, salary);
		this.department = department;
	}

	@Override
	public void getInformation() {
		// TODO Auto-generated method stub

		System.out.println("이름 : " + getName() + " 연봉 : " + getSalary() + " 부서 : " + department);

	}

}
