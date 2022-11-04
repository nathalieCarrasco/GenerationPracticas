package cl.generation.f20221028;

import java.util.ArrayList;
import java.util.Scanner;

public class MainProfe {
	public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         // Arreglo de estudiantes 
		ArrayList<Estudiantes> estudiantes = new ArrayList<Estudiantes>();
		Integer continuar = 2;
		do {
			Estudiantes estudiante=new Estudiantes();
			System.out.println("Ingrese el nombre del estudiante ");
			String nombre= sc.nextLine();
			System.out.println("Ingrese el apellido del estudiante ");
			String apellido= sc.nextLine();
			estudiante.setNombre(nombre);
			estudiante.setApellido(apellido);
			// agrega al estudiante 
			estudiantes.add(estudiante);
			
			System.out.println("¿Desea agregar a otro estudiante? ");
			System.out.println("(1)SI      (2)NO");
			continuar = sc.nextInt();
			sc.nextLine(); // corrige el error de un numero despues del next line
		} while (continuar==1);
		
		
		for (Estudiantes estudiante : estudiantes) {
			System.out.println("---------------------------------------");
			System.out.println("nombre :" +estudiante.getNombre());
			System.out.println("apellido :" +estudiante.getApellido());
			System.out.println();
		}
		
		
		// obtenenemos estudiante por posicion 
		System.out.println(estudiantes.get(0));
		
		//accedemos a un atributo del objeto 
		
		System.out.println(estudiantes.get(0).getNombre());
	}

}
