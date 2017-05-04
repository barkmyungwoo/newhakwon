package ncs.test10;

public class Company {

	public static void main(String[] args) {
		Employee[] employees = new Employee[2];
		
		employees[0] = new Secretary("Hilery", 1, "secretary", 800);
		employees[1] = new Sales("Clinten", 2, "sales\t", 1200);

		System.out.println("name\t\tdepartment\t\tsalary");
		System.out.println("------------------------------------");
		for(int i = 0; i<employees.length; i++){
			System.out.println(employees[i].toString());
		}
		

		((Secretary)employees[0]).incentive(100);
		((Sales)employees[1]).incentive(100);
		
		System.out.println();
		System.out.println("인센티브 100 지급.");
		System.out.println("name\t\tdepartment\t\tsalary\t\ttax");
		System.out.println("------------------------------------");
		for(int i = 0; i<employees.length; i++){
			System.out.print(employees[i].toString());
			System.out.print("\t\t"+employees[i].tax());
			System.out.println();
		}

	}

}
