package cl.generation.f20221102;

public class Administrativos extends Persona {
	private String cargo;

	public Administrativos() {
		super();
	}

	public Administrativos(String cargo) {
		super();
		this.cargo = cargo;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	@Override
	public String toString() {
		return "Administrativos [cargo=" + cargo + ", getNombre()=" + getNombre() + ", getApellido()=" + getApellido()
				+ ", getEdad()=" + getEdad() + "]";
	}
	
	
}
