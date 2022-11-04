package cl.generation.f20221027;

import java.util.Scanner;

public class BucleDoWhile2Parte {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opciones = 0 ; 
		int contadorErrores=0;
		// Menu de opciones 
		menu ();
		
		do {
			System.out.println("* Seleccione una opción *");
			opciones = sc.nextInt();
			
			// si la 
			if(opciones==0) {
				System.out.println("");
				break;
			}
			
			
		}
		while (opciones< 0 || opciones >4);

	
		
		
		// Calculadora con 4 operaciones basicas
        // Solicitar dos numeros float 

	}
	public static void menu () {
		System.out.println("*************************************");
		System.out.println("*******_______MENU________***********");
		System.out.println("*************************************");
		System.out.println("1.             Sumar                 ");
		System.out.println("1.             Restar                 ");
		System.out.println("1.             Multiplicar            ");
		System.out.println("1.             Dividir                ");
		
	}
	
}
