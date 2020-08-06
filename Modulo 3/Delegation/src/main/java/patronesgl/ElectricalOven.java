package patronesgl;

public class ElectricalOven extends ElectricalApplicance {

	Integer consumo = 75;
	LedApplance ledApplance;
	
	public ElectricalOven() {
		ledApplance = new LedApplance();
	}

	@Override
	void turnOn() {
		super.setConsumo(75);
		super.turnOn();
	}
	
	void turnLed() {
		super.setConsumo(100);
		super.turnOn();
	}

}
