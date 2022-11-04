package cl.generation.f20221102.poli;

public class Gato  extends Mascota{
	
	private String sonido;

	public Gato() {
		super();
	}

	public Gato(String sonido) {
		super();
		this.sonido = sonido;
	}

	//Getters and Setters 
	public String getSonido() {
		return sonido;
	}

	public void setSonido(String sonido) {
		this.sonido = sonido;
	}
	
	

	@Override
	public void emitirSonido() {
		System.out.println("El Sonido Es  (Maullido).... Miaaauuu");
	}
}
