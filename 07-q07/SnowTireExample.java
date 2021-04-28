package q07;

public class SnowTireExample {

	public static void main(String[] args) {

		SnowTire snow = new SnowTire();
		Tire tire = snow;
		
		snow.run();
		tire.run();
	}

}
