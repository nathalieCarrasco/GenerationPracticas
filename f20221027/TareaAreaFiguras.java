package cl.generation.f20221027;

import java.util.Scanner;

public class TareaAreaFiguras {
	public static void main(String[] args) {

		int eleccionFigura = menu();
		menu2(eleccionFigura);

		// TODO Auto-generated method stub

	}

	public static Integer menu() {
		System.out.println("********************");
		System.out.println("*       MENU       *");
		System.out.println("********************");
		System.out.println("*1.-   Triángulo  *");
		System.out.println("*2.-   Circunferencia *");
		System.out.println("*3.-	 Rectángulo  *");
		System.out.println("*0.-   SALIR       *");
		System.out.println("********************");

		int contadorErrores = 3;
		int opciones = 0;
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("* Seleccione una opción *");
			opciones = sc.nextInt();

			// si la opcion es cero, salir del do-while
			if (opciones == 0) {
				System.out.println("Usted a salido del programa");
				break;
			}

			if (opciones < 0 || opciones > 3) {// condicion de error
				contadorErrores--;
				System.out.println("Te quedan " + contadorErrores + " intentos");
			}
			if (contadorErrores == 0) {
				System.out.println("Agoto la cantidad de intentos, chaolin!!");
				break;
			}

		} while (opciones < 0 || opciones > 3);
		if (opciones == 0 || contadorErrores == 0) {
			System.out.println("Adios!!");
		} else {

		}
		return opciones;
	}// Inicio menu 2

	public static Integer menu2(int opcionfigura) {

		System.out.println("--------------------------------------------");
		System.out.println("*  ¿ Que operacion deseas realizar con esta figura ?   *");
		System.out.println("--------------------------------------------");
		System.out.println("*1.-   Area  *");
		System.out.println("*2.-   Perimetro *");
		System.out.println("----------------------------------------------");

		int contadorErrores2 = 2;
		int opciones2 = 0;
		int resultado = 0;
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("* Seleccione una opcion  *");
			opciones2 = sc.nextInt();

			// si la opcion es cero, salir del do-while
			if (opciones2 == 0) {
				System.out.println("Usted a salido del programa ingrese 1 o 2 ");
				break;
			}

			if (opciones2 < 0 || opciones2 > 2) {// condicion de error
				contadorErrores2--;
				System.out.println("Te quedan " + contadorErrores2 + " intentos");
			}
			if (contadorErrores2 == 0) {
				System.out.println("Agoto la cantidad de intentos, chaolin!!");
				break;
			}

		} while (opciones2 < 0 || opciones2 > 2);

		if (opciones2 == 0 || contadorErrores2 == 0) {
			System.out.println("Adios!!");
		} else if (opcionfigura == 1 && opciones2 == 1) {
			// triangulo area
			System.out.println("te encuentras en el triangulo area ");

		} else if (opcionfigura == 1 && opciones2 == 2) {
			System.out.println("Ingrese medida de un lado del triangulo ");
			Float a = sc.nextFloat();

			System.out.println("Ingrese medida del segundo lado  ");
			Float b = sc.nextFloat();

			System.out.println("Ingrese medida del tercer lado  ");
			Float c = sc.nextFloat();

			Float perimetroTotal = a + b + c;
			System.out.println("el perimetro total del triangulo que has ingresado es : " + perimetroTotal);
			System.out.println("te encuentras en el caso triangulo perimetro ");
		}
		// para circunferencia perimetro
		else if (opcionfigura == 2 && opciones2 == 1) {
			System.out.println("te encuentras en el caso circulo perimetro ");
			// area circunferencia

		} else if (opcionfigura == 2 && opciones2 == 2) {
			System.out.println("Ingrese el radio");
			float radio = sc.nextFloat();
			double resultadoPerimetroCirculo = 2 * radio * Math.PI;

			System.out.println(
					"El resultado del perimetro de la circunferencia entregada es :  " + resultadoPerimetroCirculo);
			
		}

		// para rectangulo
		// para rectangulo perimetro
		else if (opcionfigura == 3 && opciones2 == 1) {

			System.out.println("te encuentras en el caso rectangulo area");
		} else if (opcionfigura == 2 && opciones2 == 2) {
			System.out.println("te encuentras en el caso rectangulo perimetro ");
		}

		else {
			System.out.println("no encontramos tu opcion");
		}

		return opciones2;
	}

}
