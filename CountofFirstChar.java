
public class CountofFirstChar {

	public static void main(String[] args) {
		
		String word="ailesaa";//count of first character string & practice count of any character
		char first=word.charAt(0);
		int count=1;
		for(int i=1;i<word.length();i++) {
			if(first==word.charAt(i)) {
				count++;
			}
		}
		System.out.println("Count of the first char is: "+count);

	}

}
