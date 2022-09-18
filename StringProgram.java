
public class StringProgram {
 
	String name;
	int id;
	public StringProgram(String name, int i) {
		this.name=name;
		this.id=i;
	}
    
	public String toString(){
		return ""+this.id;
	}
	public static void main(String[] args) {
	   StringProgram s = new StringProgram("raghul",245);
	   String str = new String("raj");
//	   System.out.println(s);
//	   System.out.println(str);
	   int i=0;
	   while(i<str.length()) {
		   System.out.println(str.charAt(i));
		   i++;
	   }
	   
	   while(i<str.length()) {
		   char ch = str.charAt(i);
		   if(ch=='a') {
			   System.out.println(ch);
		   }
	   }
	}

}
