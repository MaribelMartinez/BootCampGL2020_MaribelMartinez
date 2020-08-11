package patronesgl;

public class Main {

	public static void main(String[] args) {
		
		ElectricalOven electricalOven = new ElectricalOven(new LedAppliance());
		System.out.println(electricalOven.getPower());
		

		electricalOven.turnOn();
		System.out.println(electricalOven.getPower());
		
		electricalOven.turnLed();
		System.out.println(electricalOven.getPower());
		

		
	}
}

