package ncs.test10;

public class Secretary extends Employee implements Bonus{
	public Secretary() {
	}

	public Secretary(String name, int number, String department, int salary) {
		super(name, number, department, salary);
	}

	@Override
	public void incentive(int pay) {
		super.setSalary(super.getSalary()+(pay*0.8));
	}

	@Override
	public double tax() {
		
		return super.getSalary()/10;
	}


}
