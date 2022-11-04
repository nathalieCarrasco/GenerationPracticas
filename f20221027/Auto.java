package cl.generation.f20221027;

public class Auto {

// atributos 
	private String marca;
	private String color;
	private String modelo;
	private float cilindrada;
	private float rendimiento;
	private float velocidad;

	// instanciar constructor vacio 
	public Auto() {
		super();
	}

	public Auto(String marca, String color, String modelo, float cilindrada, float rendimiento, float velocidad) {
		super();
		this.marca = marca;
		this.color = color;
		this.modelo = modelo;
		this.cilindrada = cilindrada;
		this.rendimiento = rendimiento;
		this.velocidad = velocidad;
	}

// Getters y Setters 

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public float getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(float cilindrada) {
		this.cilindrada = cilindrada;
	}

	public float getRendimiento() {
		return rendimiento;
	}

	public void setRendimiento(float rendimiento) {
		this.rendimiento = rendimiento;
	}

	public float getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(float velocidad) {
		this.velocidad = velocidad;
	}

	// METODOS OBJETOS
	public void avanzar() {
		System.out.println("estoy en el metodo avanzar del objeto "+ modelo);
	}

	@Override
	public String toString() {
		return "Auto [marca=" + marca + ", color=" + color + ", modelo=" + modelo + ", cilindrada=" + cilindrada
				+ ", rendimiento=" + rendimiento + ", velocidad=" + velocidad + "]";
	}
}
