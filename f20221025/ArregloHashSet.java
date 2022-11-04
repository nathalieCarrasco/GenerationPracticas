package cl.generation.f20221025;

import java.util.HashSet;

public class ArregloHashSet {
	public static void main(String[] args) {
    //Set o HashSet
		// HashSet<TIPODATO> nombre_array = new HashSet<TIPODATO>();
		HashSet<String> animales = new HashSet<String>();
		
		//agregar datos--*** NO PERMITE DATOS DUPLICADOS *---
		           //*--- AGREGA ORDEN ALEATORIO ----*
		animales.add("cocodrilo");
		animales.add("jirafa");
		animales.add("cocodrilo");
		animales.add("cebra");
		animales.add("elefante");
		
		System.out.println(animales);
		
		// 3.- Verificar contenido del arreglo 
		boolean verificadoraNombre = animales.contains("cebra");
		System.out.println("Existe el animal cerbra ?" + verificadoraNombre);
		
		
		//4.- eliminar un elemento contenido 
		animales.remove("elefante");
		System.out.println(animales );
		
		// 5.- Tamaño del Arreglo 
		System.out.println(animales.size());
		
		//6.- Recorrer el arreglo 
		//** For De Objetos ***
		for ( String animal : animales){
			System.out.println(animal);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
