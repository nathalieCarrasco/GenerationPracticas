package cl.generation.f20221102.interfaces;


// Extens herencia Implements Implementar los metodos 
public class Humano  extends Omnivoros implements Generico{
       private boolean razonamiento;

	public Humano() {
		super();
	}

	public Humano(boolean razonamiento) {
		super();
		this.razonamiento = razonamiento;
	}
      
	//getters and setters 
	public boolean isRazonamiento() {
		return razonamiento;
	}

	public void setRazonamiento(boolean razonamiento) {
		this.razonamiento = razonamiento;
	}

	@Override
	public void respirar() {
		
		
	}

	@Override
	public void comer() {
		
		
	}
	
	
       
}
