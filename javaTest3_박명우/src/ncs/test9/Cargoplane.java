package ncs.test9;

public class Cargoplane extends Plane{

	public Cargoplane() {
		super();
	}

	public Cargoplane(String planeName, int fuelSize) {
		super(planeName, fuelSize);
	}

	@Override
	public void refuel(int fuel) {
		super.refuel(fuel);
		
	}

	@Override
	public void flight(int distance) {
		super.setFuelSize(super.getFuelSize()-(distance/10*50));
	}

}
