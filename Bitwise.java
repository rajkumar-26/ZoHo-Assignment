import java.util.*;
public class Bitwise {

	public static boolean isEven(int num) {
		  
		int temp=num&1;
		if(temp==0)
			return true;
		return false;
		
	}
	
	public static void main(String[] args) {
		
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();
        
        if(isEven(num))
        {
        	System.out.println("The number is even");
        }
        else
        {
        	System.out.println("The number in odd");
        }
	}

}
