
public class CarTester {

	public static void main(String[] args) {
		Car car1 = new Car(19.5);
		
		System.out.println("Current Gas:" + car1.getGasInTank());
		car1.addGas(10);
		System.out.println("Current Gas:" + car1.getGasInTank());

		car1.Drive(40);
		System.out.println("Current Gas:" + car1.getGasInTank());
	}
	
}
