package patronesgl;

public class ElectricalApplicance {
	
	private Integer power = 500;
	private Integer consumo = 50;

	public Integer getConsumo() {
		return consumo;
	}

	public void setConsumo(Integer consumo) {
		this.consumo = consumo;
	}

	public Integer getPower() {
		return power;
	}

	public void setPower(Integer power) {
		this.power = power;
	}

	void turnOn() {
		power = power - this.consumo;
	}

}
