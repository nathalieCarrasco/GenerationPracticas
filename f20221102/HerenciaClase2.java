package cl.generation.f20221102;

import java.util.ArrayList;

public class HerenciaClase2 {
	public static void main(String[] args) {
		// Herencia en Java
		// Instanciando Objetos
		Entrenador entrenador = new Entrenador();
		entrenador.setNombre("Jimhy");
		entrenador.setApellido("Neutron");
		entrenador.setEdad(25);
		entrenador.setExperienciaanios(10);
		entrenador.setEquipo("los niños genio");

		System.out.println(entrenador.toString());
		
		Kinesiologo kine = new Kinesiologo();
		kine.setNombre("marta");
		kine.setApellido("torres");
		kine.setEdad(32);
		kine.setTitulo("kinesiologia");
		kine.setEspecialidad("Muscular");
		
		System.out.println(kine.toString());
		
		// Array List de basquetbolistas 
		ArrayList <Basquetbolista> listaJugadores = new ArrayList <Basquetbolista>();
		Basquetbolista jugador1 = new Basquetbolista();
		jugador1.setNombre("juan");
		jugador1.setApellido("lopez");
		jugador1.setAltura(1.35f);
		
		listaJugadores.add(jugador1);
		
		//recorrer lista
		
		for (Basquetbolista jugador : listaJugadores) {
			System.out.println(jugador.toString());
		}
		
		kine.metodoImprimir();
		entrenador.metodoImprimir();
		
		// Instancia clase nieta 
		
		Ayudante ayudante = new Ayudante ();
		ayudante.metodoImprimir();
	}
}
