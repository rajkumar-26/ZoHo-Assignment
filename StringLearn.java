import java.util.Scanner;

public class StringLearn {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        String str[][]=new String[r][c];
        for(int i=0;i<r;i++) {
        	for(int j=0;j<c;j++) {
        		str[i][j]=sc.next();
        	}
        }
        for(int i=0;i<r;i++) {
        	for(int j=0;j<c;j++) {
        		System.out.print(str[i][j]+" ");
        	}
        	System.out.println();
        }
        
	}

}
