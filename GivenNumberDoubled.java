import java.util.Scanner;

public class GivenNumberDoubled {
	
	public static void main() {
		Scanner input=new Scanner(System.in);
		int num=input.nextInt();
		System.out.println("Enter the position");
		int pos=input.nextInt();
		int ans=num;
		for(int i=1;i<pos;i++) {
			ans+=num;
			num=ans;
		}
		System.out.println(ans);
	}
	
}
