import java.util.Scanner;

public class jagged {

	public static void main(String[] args) {
		
		   
			Scanner input=new Scanner(System.in);
			input.nextInt();
	        int arr[][] = new int[input.nextInt()][];
	 
	  
	        for (int j = 0; j < arr.length; j++)  
            {
	            int c=input.nextInt();
                arr[j] = new int[c];
            }
	        for (int i = 0; i < arr.length; i++)   
	        {
	            for (int j = 0; j < arr[i].length; j++)   
	            {
	                arr[i][j] = input.nextInt();
	            }
	        }
	        input.close();
	 
	        System.out.println("Elements of 2D Jagged Array");
	        for (int i = 0; i < arr.length; i++) 
	        {
	            for (int j = 0; j < arr[i].length; j++) 
	            {
	                System.out.print(arr[i][j] + " ");
	            }
	            System.out.println();
	        }
	    }

	}


