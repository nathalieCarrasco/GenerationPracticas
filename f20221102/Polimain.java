package cl.generation.f20221102;

import cl.generation.f20221102.poli.Mascota;
import cl.generation.f20221102.poli.Perro;
import cl.generation.f20221102.poli.Gato;


// importar para usar clases de otras cajas 
public class Polimain {
	public static void main(String[] args) {

		// Instancia de las clases 
		Mascota mascota = new Mascota ();
		mascota.emitirSonido();
		
		Perro perrin = new Perro();
		perrin.emitirSonido();
		
		Gato gatiño = new Gato ();
		gatiño.emitirSonido();
	
	    //**************POLIMORFISMO *************
		/* debe existir herencia , jerarquia de clases 
		 * una super clase se comporta como una clase hija pero
		 * NO es la clase hija 
		 * 
		 * Se puede acceder a los metodos pero Si a los
		 * Atributos
		 * 
		 * */
	    Mascota regalon = new Perro();
	    regalon.emitirSonido();
	    regalon.setNombre("regalon");
	    Mascota michi = new Gato ();
	    michi.emitirSonido();
	    michi.setNombre("michin");
	    System.out.println(michi);
	    
	    /* polimorfismo parametricos , el metodo se escribe igual 
	     * pero recibe distintos parametros */
	    
	    michi.horasSiestas(2);
	    michi.horasSiestas(1.8f);
	    
	    
	  // Perro perrito = new Mascota();
	   //perrito.emitirSonido();
	   Perro dog = (Perro) regalon;
	   System.out.println(dog);
	   dog.emitirSonido();
	}

}
