package cl.generation.f20221102.poli;

public class Mascota {

	private String raza;
	private String nombre;
	private String Sexo;

	public Mascota() {
		super();
	}

	public Mascota(String raza, String nombre, String sexo) {
		super();
		this.raza = raza;
		this.nombre = nombre;
		Sexo = sexo;
	}
// Getters and Setters

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getSexo() {
		return Sexo;
	}

	public void setSexo(String sexo) {
		Sexo = sexo;
	}

	@Override
	public String toString() {
		return "Mascota [raza=" + raza + ", nombre=" + nombre + ", Sexo=" + Sexo + "]";
	}

	public void emitirSonido() {
		System.out.println("El Sonido Es....");
	}
	// Polimorfismo parametrico 
	// SOBRE CARGA DE METODO
	public void horasSiestas() {
		System.out.println("la mascota No duerme ");
	}
	public void horasSiestas( int horas) {
		System.out.println("la mascota duerme " + horas + " horas");
	}
	public void horasSiestas( float horas) {
		System.out.println("la mascota duerme " + horas + " horas");
	}
	
}
