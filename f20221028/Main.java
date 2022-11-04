package cl.generation.f20221028;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
//Instanciar a estudiantes 
		Scanner sc = new Scanner(System.in);
		Estudiantes arr[]= new Estudiantes [5];
		
		// variables 
		String nombre="";
	    String apellido="";
		Integer edad=0;
		String rut="";

		String curso="";
		String correo="";
		
		for (int i = 0; i<arr.length;i++) {
			System.out.println("ingrese su nombre ");
			nombre=sc.next();
			System.out.println("ingrese su apellido ");
			apellido=sc.next();
			System.out.println("ingrese su edad ");
			edad=sc.nextInt();
			System.out.println("ingrese su rut ");
			rut=sc.next();
			System.out.println("ingrese su curso");
			curso=sc.next();
			System.out.println("ingrese su correo ");
			correo=sc.next();
		// ingresar al arreglo 
			arr[i]=new Estudiantes(nombre,apellido,edad,rut,curso,correo);
		}
		for (int i = 0; i<arr.length;i++) {
			System.out.println(arr[i].getNombre()+" "+arr[i].getApellido()+
					" "+arr[i].getRut()+" "+arr[i].getEdad()+" "+arr[i].getCurso()+" "+
					arr[i].getCorreo());
		}
	}
}
