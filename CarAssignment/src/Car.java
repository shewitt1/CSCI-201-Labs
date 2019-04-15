
public class Car {
	
	public int fuelTank;
	public double efficiency;
	
	
	public Car(double mpg) {
		fuelTank = 0;
		efficiency = mpg;
	}
	
	public void Drive(double distance) {
				fuelTank -= (distance/efficiency);

	}
	
	public void addGas(double amount) {
		fuelTank += amount;
	}
	
	public double getGasInTank() {
		return fuelTank;
	}
	
}
