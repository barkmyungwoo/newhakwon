package ncs.test10;

public class Employee {
	private String name;
	private int number;
	private String department; // �μ�
	private int salary; // ����
	
	public Employee() {
	}

	public Employee(String name, int number, String department, int salary) {
		this.name = name;
		this.number = number;
		this.department = department;
		this.salary = salary;
	}
	
	public  double tax(){
		//������ ����ؼ� �����Ѵ�.
		return -1;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(double d) {
		this.salary = (int)d;
	}

	public String toString() {
		return name + "\t\t" + department +"\t\t"+ salary;
	}

}
