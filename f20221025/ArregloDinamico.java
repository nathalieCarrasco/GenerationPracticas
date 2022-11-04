package cl.generation.f20221025;

import java.util.ArrayList;
import java.util.Arrays;

public class ArregloDinamico {
	public static void main(String[] args) {
		// ArrayList
		// ArrayList<tipoDAto>nombre_array= new ArrayList<TIPODATO>();
		// 1.- Definicion
		ArrayList<String> grupo2 = new ArrayList<String>();
		// 2.- Agregar valores al arreglo
		grupo2.add("Ariel");
		grupo2.add("Valentina");
		grupo2.add("Francisco");
		grupo2.add("Diego");
		grupo2.add("Nathalie");

		System.out.println(grupo2);
		// 3.- Tamaño del ArrayList
		System.out.println(grupo2.size()); // size para arreglos dinamicos / lengtth arreglos estaticos

		// 4.- para obtener elemento dentro del arreglo

		System.out.println(grupo2.get(4));
		// System.out.println(grupo2.get(7));// Fuera de Indice

		// 5.- Eliminar elemento dentro del array
		grupo2.remove(4); // me saco
		System.out.println(grupo2);// se desplazan hacia la posicion 0
		System.out.println(grupo2.size());// se redujo en 1 tambien su tamaño
		grupo2.add("Nathalie");

		// 6.- Recorrer el Array TIPOS DE FOR

		for (int i = 0; i < grupo2.size(); i++) {
			System.out.println("integrante : " + grupo2.get(i));
		}
		System.out.println("*************************************");
		// FOR ITERADOR O DE OBJETO
		for (String integrante : grupo2) {
			System.out.println(integrante);
		}
		System.out.println("*************************************");
		
		// lo mismo con numeros 
		
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		numeros.add(2);
		numeros.add(8);
		numeros.add(89);
		numeros.add(246);
		numeros.add(772);
		
		for (Integer numero : numeros ) {
			System.out.println(numero);
		}
		
	}
}
