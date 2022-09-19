import java.util.Scanner;

// MethodOverloding --> Compile-Time Polymorphism --> static binding


class Adder {
	static int add(int a, int b){
		return a+b;
	}  
	static double add(double a, double b){
		return a+b;
	}  
	
}


public class MethodOverloading {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int val1 = sc.nextInt();
		int val2 = sc.nextInt();
		double val3 = sc.nextDouble();
		double val4 = sc.nextDouble();
		System.out.println(Adder.add(val1,val2));  
		System.out.println(Adder.add(val3,val4));  

	}

}
