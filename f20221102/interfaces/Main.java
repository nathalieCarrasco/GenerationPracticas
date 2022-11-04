package cl.generation.f20221102.interfaces;

public class Main {
	public static void main(String[] args) {
         // Interfaces y clases abstractas 
		/* - no se pueden instanciar ************
		 * - cuando heredamos de una clase abstracta te 
		 * obliga a traer el metodo
		 * 
		 *una clase abstracta solo se ocupa para heredar los 
		 *metodos 
		 * */
		 
		//Animal animal = new Animal();
		
        // Caballo caballito = new Caballo ();
		
		Humano humano = new Humano();
		humano.metodoEnAnimal();
		
		Leon leoncito = new Leon();
		leoncito.setAltura(1.34f);
		leoncito.setPeso(170);
		
		System.out.println(leoncito.getAltura());
		System.out.println(leoncito.getPeso());
		leoncito.comer();
		System.out.println(leoncito.toString());
		
         
	}
}
