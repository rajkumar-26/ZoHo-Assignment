import java.util.Scanner;

public class child extends parent {

	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		
		child childobj = new child();
		childobj.act();
		
		parent parentobj = new parent();
		parentobj.act();
		
		parent obj = new child();
		obj.act();

	}

	public void act() {
		
		System.out.println("son is acting");
	}

}
