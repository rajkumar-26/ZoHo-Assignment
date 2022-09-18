
public class ZohoEmployee implements EmployeeRules,FamilyRules {
	

	public static void main(String[] args) {
		ZohoEmployee emp = new ZohoEmployee();
		emp.maintainHours();
		emp.relocate();
		emp.report();
		emp.dress();
		
		System.out.println(ZohoEmployee.salary); // Employeerules.salary
		System.out.println(ZohoEmployee.leave);  //Employeerules.leave
		
		FamilyRules father = new ZohoEmployee(); //dynamic binding
		emp.eatTogether();
		emp.enjoy();
		father.helpMember();
		//father.relocate();
		
	}
	
	
	public void maintainHours() {
		System.out.println("40hrs");
	}
	public void relocate() {
		System.out.println("chennai");
	}


	public void report() {
		System.out.println("manager");
	}

	public void dress() {
		System.out.println("your wish");
	}
	
	public void helpMember() {
		System.out.println("Yeah");
	}
    public void eatTogether() {
    	System.out.println("Yeah");
    }
    public void enjoy() {
    	System.out.println("Yeah");
    }
	

}
