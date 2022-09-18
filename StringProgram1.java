
public class StringProgram1 {

    String  name;
    int id;
	public StringProgram1(String name, int i) {
		this.name = name;
		this.id = i;
	}
	
	public String toString() {
		return ""+this.id;
	}

	public static void main(String[] args) {
		StringProgram1 str =new StringProgram1("raghul",245);
		str.countOfwords();
		str.countSentance();
		str.stringMethods();

	}
	
    private void stringMethods() {
		String s = " rajkumar "; 
		System.out.println(s);
		System.out.println(s.length());
		System.out.println(s.contains("m"));
		System.out.println(s.endsWith("kumar"));
		System.out.println(s.startsWith("raj"));
		System.out.println(s.trim());
		System.out.println(s);
		
	}

	private void countSentance() {
    	String s = "This is my first java book. My mail id is gloriousraj001@gmail.com.";
		int count = 0,i=0;
		
		while(i < s.length()) {
			if(s.charAt(i)=='.')
				if(s.charAt(i)==' ')
				count++;
		}
		System.out.println(count);
		
	}

	private void countOfwords() {
		String s = "raj kumar";
		int count = 1,i=0;
		
		while(i < s.length()) {
			if(s.charAt(i)==' ') {
				count++;
			}
		}
		System.out.println(count);
	}

}
