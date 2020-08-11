package patronesgl;

public class ElectricalOven extends ElectricalAppliance {

	private LedAppliance ledAppliance;
	
	public ElectricalOven(LedAppliance ledApplicance) {
		this.ledAppliance = ledApplicance;
	}

	@Override
	void turnOn() {
		this.setPower(this.getPower() - 75);
	}
	
	void turnLed() {
		this.setPower(ledAppliance.turnOn(this.power));
	}

}
