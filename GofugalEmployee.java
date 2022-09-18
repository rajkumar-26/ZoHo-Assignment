
public  class GofugalEmployee implements EmployeeRulesGofugal {

	public static void main(String[] args) {
		
		GofugalEmployee emp2 = new GofugalEmployee();
		emp2.dress();
		emp2.giveSalary();
		System.out.println(GofugalEmployee.SALARY);
	}
	public void dress() {
		System.out.println("Uniform");
	}
	public void giveSalary() {
		System.out.println("9000");
	}
	public void maintainHours() {
		System.out.println("30hrs");
	}
	public void relocate() {
		System.out.println("Madurai");
	}
	public void report() {
		System.out.println("MD");
	}
}
