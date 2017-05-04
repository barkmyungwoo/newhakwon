package ncs.test9;

abstract public class Plane {
	private String planeName;
	private int fuelSize;

	public Plane() {
	}

	public Plane(String planeName, int fuelSize) {
		super();
		this.planeName = planeName;
		this.fuelSize = fuelSize;
	} 
	

	public String getPlaneName() {
		return planeName;
	}
	public void setPlaneName(String planeName) {
		this.planeName = planeName;
	}

	public int getFuelSize() {
		return fuelSize;
	}

	public void setFuelSize(int fuelSize) {
		this.fuelSize = fuelSize;
	}

	abstract public void flight(int distance);

	public void refuel(int fuel){
		fuelSize += fuel;
	}	
	
	public String toString() {
		return planeName + "\t\t" + fuelSize;
	}

}
