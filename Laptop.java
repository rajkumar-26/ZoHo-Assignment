
public class Laptop extends Desktop {

	public Laptop(String brand) {
		super(brand);
		System.out.println(brand);
	}

	public Laptop() // no argument constructor
	{
        System.out.println("charge");
	}

	public static void main(String[] args) {
		Laptop hp = new Laptop();
		Laptop lap2 = new Laptop("dell");

	}

}
