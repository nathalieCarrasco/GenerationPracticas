package cl.generation.f20221103;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {

		// Objetos de colaboracion
		Usuario usuario = new Usuario();
		/*Usuario usuario = new Usuario();
		ArrayList<String> telefono = new ArrayList<String>();
		telefono.add("567890");
		telefono.add("234234");
		usuario.setTelefono(telefono);
		System.out.println(usuario.toString());
      */
        
		System.out.println(usuario.getTelefonos());
		usuario.getTelefonos().add("3243434234");
		usuario.getTelefonos().add("2872828282");
		
		System.out.println(usuario.getTelefonos());
		
		Direccion direccion = new Direccion ();
		direccion.setCiudad("santiago");
		direccion.setNumero("1261");
		direccion.setRegion("metropolitana");
	    // le pasamos al usuario la direccion 
		usuario.setDireccion(direccion);
		
		System.out.println(usuario.getDireccion().toString());
		
		

	}
}
