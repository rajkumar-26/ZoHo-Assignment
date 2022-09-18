
public class SBICustomer {

	public static void main(String[] args) {
       StateBank sbi = new StateBank();
       int minimum = sbi.getMinBalance();
       System.out.println(minimum);
       
	   System.out.println(sbi.getEMI());
	   System.out.println(sbi.getEMI());
	   sbi.setEMI(200); 
	   System.out.println(sbi.getEMI());
	}

}
   