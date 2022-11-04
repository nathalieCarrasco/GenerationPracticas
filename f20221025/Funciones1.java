package cl.generation.f20221025;

import java.util.Arrays;

public class Funciones1 {
	public static void main(String[] args) {
		// FUNCIONES O MeTODO
		// -----** hay que llamarlas al igual que en JS ****--------
		// Se llama en el main
		nombreMetodo();
		nombreMetodo2("susanita");
		nombreMetodo2("raton");
		//nombreMetodo2(2); lanza error no admite otro dato 
		
		metodo1(20);
		metodo2(32 , 9.99f);
		String [] vocales = {"a","b","c","d","e"} ;
		metodo3Array(vocales);
		
		// metodos con llamados 
		//retorno1();
		System.out.println(retorno1());
		
		// Asigando a una variable 
		Integer valorRetornado = retorno1();
		System.out.println(valorRetornado/7);

	}
	// DEfinicion estructura de un metodo
	// Void----> el metodo no retorna ningun valor

	public static void nombreMetodo() {
		System.out.println("estoy dentro del metodo inicial ...");
	}

	public static void nombreMetodo2(String nombre) {
		System.out.println("hola soy "+ nombre);
	}
	public static void metodo1(Integer numero1) {
		System.out.println("soy el numero  "+ numero1);
	}
	public static void metodo2(Integer numero1, float numero2) {
		System.out.println("soy el numero  "+ numero1);
		System.out.println("soy el numero  "+ numero2);
	}
	
	public static void metodo3Array(String[] arreglito) {
		System.out.println("Soy el arreglo "+Arrays.toString(arreglito));

	}
	
	//Funciones Con retorno 
	// dos funciones
	// 1.- public static void 
	
	public static  Integer retorno1(){
		Integer totalAlumnos=35;
		return totalAlumnos;
	}

}
