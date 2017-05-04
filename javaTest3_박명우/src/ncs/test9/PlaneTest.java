package ncs.test9;

public class PlaneTest {

	public static void main(String[] args) {

		Airplane air = new Airplane("L747", 1000);
		Cargoplane car = new Cargoplane("C40", 1000);

		System.out.println("Plane\t\tfuelSize ");
		System.out.println("----------------------------");

		System.out.println(air.toString());
		System.out.println(car.toString());

		System.out.println();
		air.flight(100);
		car.flight(100);
		System.out.println("100 운항");
		System.out.println("Plane\t\tfuelSize ");
		System.out.println("----------------------------");

		System.out.println(air.toString());
		System.out.println(car.toString());

		System.out.println();
		air.refuel(200);
		car.refuel(200);
		System.out.println("200 주유");
		System.out.println("Plane\t\tfuelSize ");
		System.out.println("----------------------------");

		System.out.println(air.toString());
		System.out.println(car.toString());
	}

}
