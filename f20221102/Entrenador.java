package cl.generation.f20221102;

public class Entrenador extends EquipoBasquetball {

	private int Experienciaanios;
	private String equipo;

	public Entrenador() {
		super();
	}

	public Entrenador(int experienciaanios, String equipo) {
		super();
		Experienciaanios = experienciaanios;
		this.equipo = equipo;
	}

	public int getExperienciaanios() {
		return Experienciaanios;
	}

	public void setExperienciaanios(int experienciaanios) {
		Experienciaanios = experienciaanios;
	}

	public String getEquipo() {
		return equipo;
	}

	public void setEquipo(String equipo) {
		this.equipo = equipo;
	}

	@Override
	public String toString() {
		return "Entrenador [Experienciaanios=" + Experienciaanios + ", equipo=" + equipo + ", getNombre()="
				+ getNombre() + ", getApellido()=" + getApellido() + ", getEdad()=" + getEdad() + "]";
	}


	@Override
	public void metodoImprimir() {
		System.out.println("estoy en el metodo hijo entrenador");
	}
	



}
