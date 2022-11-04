package cl.generation.f20221027;

import java.util.Scanner;

public class TareaObjetosClientes {
	public static void main(String[] args) {

		// Pedir datos
		
				Scanner sc = new Scanner(System.in); 
				System.out.println("Ingrese su nombre");
				String nombre = sc.next();
				
				
				System.out.println("Ingrese su apellido");
				String apellido = sc.next();
				
				 
				System.out.println("Ingrese su edad");
				Integer edad = sc.nextInt();
				
				
				System.out.println("Ingrese su correo");
				String correo = sc.next();
				
				
				System.out.println("Ingrese su telefono");
				Integer telefono = sc.nextInt();
				
				
				DatosClientes cliente = new DatosClientes();
				
			     cliente.setNombre= nombre;
			     
			     
				System.out.println(cliente.toString());

			}
	
	
	
	
	}

