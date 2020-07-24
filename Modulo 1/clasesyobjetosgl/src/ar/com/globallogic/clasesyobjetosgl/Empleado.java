package ar.com.globallogic.clasesyobjetosgl;

public class Empleado extends Persona{
	
	private String ID;
	private Double sueldoBase;
	private Integer horasExtra;
	private Double retenciones;
	private static double importeHoraExtra;
	
	public Empleado() {
		super();
	}
	
	public Empleado(Integer DNI) {
		super(DNI);
	}
	
	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}


	public Double getSueldoBase() {
		return sueldoBase;
	}

	public void setSueldoBase(Double sueldoBase) {
		this.sueldoBase = sueldoBase;
	}

	public Double getRetenciones() {
		return retenciones;
	}

	public void setRetenciones(Double retenciones) {
		this.retenciones = retenciones;
	}

	public static double getHoraExtra() {
		return importeHoraExtra;
	}

	public static void setHoraExtra(double horaExtra) {
		Empleado.importeHoraExtra = horaExtra;
	}

	private Double calculoHoraExtra() {
		return importeHoraExtra * this.horasExtra;
	}
	
	public Integer getHorasExtra() {
		return horasExtra;
	}

	public void setHorasExtra(Integer horasExtra) {
		this.horasExtra = horasExtra;
	}

	public static double getImporteHoraExtra() {
		return importeHoraExtra;
	}

	public static void setImporteHoraExtra(double importeHoraExtra) {
		Empleado.importeHoraExtra = importeHoraExtra;
	}

	public Double sueldoBruto() {
		return this.sueldoBase + this.calculoHoraExtra();
	}
	
	public Double calculoRetenciones() {
		if(super.casado) {
			this.retenciones = this.retenciones -2;
		}
		
		if(super.numeroHijos > 0) {
			this.retenciones = this.retenciones - this.numeroHijos;
		}
		
		return sueldoBruto() * retenciones;
	}
		
	public char estaCasado() {
		if(super.casado) {
			return 'S';
		}else {
			return 'N';
		}
	}
	public String toString() {
		return  this.ID +" " + super.nombre + " "+super.apellido + 
				"\nSueldo base: " + this.sueldoBase +
				"\nHoras extras: "+ this.horasExtra +
				"\ntipo IRPF: " + this.retenciones +
				"\nCasado: "+ this.estaCasado() +
				"\nNumero de hijos: " +super.numeroHijos;
				
	}
}
