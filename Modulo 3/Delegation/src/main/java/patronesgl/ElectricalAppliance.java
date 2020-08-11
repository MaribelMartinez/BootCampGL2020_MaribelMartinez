package patronesgl;

public class ElectricalAppliance {
	
	protected Integer power;

	public ElectricalAppliance() {
		this.power = 500;
	}

	public Integer getPower() {
		return power;
	}

	public void setPower(Integer power) {
		this.power = power;
	}

	void turnOn() {
		power = power - 50;
	}

}
