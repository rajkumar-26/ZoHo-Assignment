
public class WrapperClass {

	public static void main(String[] args) {
		
		int a=1;
		Integer b = Integer.valueOf(a);    //boxing,wrapping
		int c = b.intValue();              //unboxing
		Integer d=2;                       //auto boxing
		int e = d;                         //auto unboxing
		
		String str = "287";
		int f = Integer.parseInt(str);
		System.out.println(f);
	}

}
