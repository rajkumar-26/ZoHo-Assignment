import java.util.Scanner;

public class StringBasics {

	public static void main(String[] args) {
		String s=new String("RAJKUMAR"); //StringClass-->Heap Memory
		//String s="RAJKUMAR"; //literal-->SCP
		System.out.println(s.length());//return integer
		System.out.println(s.isBlank());//whitespace/blank return T/F
		System.out.println(s.isEmpty());//Empty String return T/F
		
		//equals method
		//scenario1
		System.out.println();
		String s1=new String("Java");
		String s2="Java";
		if(s1==s2)System.out.println("==");//Memorylocation
		else System.out.println("Not ==");
		if(s1.equals(s2))System.out.println("equals");
		else System.out.println("not equals");
		
		//scenario2
		System.out.println();
		String s3=new String("Java");
		String s4=s3;
		if(s3==s4)System.out.println("==");
		else System.out.println("Not ==");
		if(s3.equals(s4))System.out.println("equals");
		else System.out.println("not equals");
		
		//scenario3
		System.out.println();
		String s5=new String("Java");
		String s6=s5;
		s6="Java";
		if(s5==s6)System.out.println("==");
		else System.out.println("Not ==");
		if(s5.equals(s6))System.out.println("equals");
		else System.out.println("not equals");
		
		//null pointer Exception & immutable property
		
		Scanner sc=new Scanner(System.in);
		//int a=sc.nextInt();
		//sc.next();
		String str=sc.nextLine();
		System.out.println(str);
	}

}
