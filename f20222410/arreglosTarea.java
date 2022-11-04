package cl.generation.f20222410;

import java.util.Arrays;

public class arreglosTarea {
	public static void main(String[] args) {
		
		int[] numeros= {1,4,5,6,-1,-51,2,16,-123,100};

		
		int numMax = numeros[0];


	for(int i = 0 ; i<numeros.length;i++ ){

	if(numMax<numeros[i] ){
	numMax=numeros[i];
	}
	}

	System.out.println(numMax);




	int[] numeros1= {1,4,5,6,-1,-51,2,16,-123,100};


	int numMin = numeros[0];


	for(int j = 0 ; j<numeros.length;j++ ){

	if(numMin>numeros[j] ){
	numMin=numeros[j];
	}

	}
	System.out.println(numMin);


	//__________________________________________________
	 int[] impares = new int [numeros.length];
	 int[] pares = new int [numeros.length];
	 //impares: 
	 for (int i = 0; i < numeros.length; i++){
	   	if(numeros[i] %2 == 0){ //obtenemos el par
	       pares[i] = numeros[i];
	     }else{
	       impares[i] = numeros[i];
	     	     }
	 }
	 System.out.println(Arrays.toString(impares));	
	 System.out.println(Arrays.toString(pares));
		
	}

}
