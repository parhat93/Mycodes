package Static;

public class MallParking {

	public static void main(String[] args) {
		Parking.numberOfSpacesAvaliable = 5;
		Parking p1 = new Parking();
		p1.parkACar("Tesla S");
		p1.parkACar("Nissan S");
		p1.parkACar("BMW S");

		System.out.println(p1.numberOfSpacesAvaliable);
		Parking p2 = new Parking();
		p2.parkACar("MinnCooper S");
		// System.out.println(p2.numberOfSpacesAvaliable);
		// System.out.println(p1.numberOfSpacesAvaliable);
		System.out.println("==============================");
		System.out.println(Parking.numberOfSpacesAvaliable);

		System.out.println(p2.numberOfSpacesAvaliable);
		System.out.println(p1.numberOfSpacesAvaliable);

	}
}