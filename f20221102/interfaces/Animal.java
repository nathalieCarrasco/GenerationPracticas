package cl.generation.f20221102.interfaces;

public  abstract class Animal {
	// atributos clase animal 
	
	private float peso ;
	private float altura ;
	
	public Animal() {
		super();
	}

	public Animal(float peso, float altura) {
		super();
		this.peso = peso;
		this.altura = altura;
	}
	
	// Getters y Setters 

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}
	
      public abstract void metodoEnAnimal();

	/*
    public void metodoEnAnimal() {
    	System.out.println("estoy en el metodo de animal");
    }*/
}
