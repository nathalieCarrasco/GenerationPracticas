package cl.generation.f20221027;

import java.util.Scanner;

public class perimetroTriangulo {
	public static void main(String[] args) {
		Float perimetroTotalTri = calculoPTriangulo();
		System.out.println("El Resultado del Perimetro de tu triangulo es : "+ perimetroTotalTri);
		
		double perimetroCirculo = circuloPerimetro();
		System.out.println("El Resultado del Perimetro de tu Circulo es : "+ perimetroCirculo);
	}

	public static Float calculoPTriangulo() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese medida de un lado del triangulo ");
		Float a = scanner.nextFloat();

		System.out.println("Ingrese medida del segundo lado  ");
		Float b = scanner.nextFloat();

		System.out.println("Ingrese medida del tercer lado  ");
		Float c = scanner.nextFloat();

		Float perimetroTotal = a +b+c ;


		return perimetroTotal;
	}
	
	public static double circuloPerimetro() {
		Scanner scanner = new Scanner(System.in);
    	System.out.println("Ingrese el radio");
		float radio = scanner.nextFloat();

		double resultadoPerimetroCirculo = 2*radio*Math.PI;

		return (double) resultadoPerimetroCirculo;

	}

}
