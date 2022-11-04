package cl.generation.f20221025;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class ArregloHasmap {
	public static void main(String[] args) {

		// Hashmap
		/*
		 * almacene elementos en pares " clave / valor ", y puede acceder a ellos
		 * mediante un índice de otro tipo (por ejemplo, a String).
		 */

		// KEY // VALUE
		// HashMap<String, String> nombre_array = new HashMap<String, String>();

		HashMap<String, String> mediosTransporte = new HashMap<String, String>();

		// como se agregan elementos

		mediosTransporte.put("aereo", "avion");
		mediosTransporte.put("acuatico", "barco");
		mediosTransporte.put("terrestre", "auto");
		mediosTransporte.put("terrestre", "auto bus");
		mediosTransporte.put("acuatico", "bote");

		System.out.println(mediosTransporte);

		// NO PERMITE KEYS DUPLICADAS Solo si valores duplicado
		// En caso de reemplazar la llave este solo guarda en ultimo ingresado

		System.out.println("***************************");

		// Para acceder a un valor en el HashMap, use el get()método

		System.out.println(mediosTransporte.get("aereo"));
		// no recibe posicion
		// no recibe valor

		System.out.println("***************************");

		// Para borrar un elemento
		// mediosTransporte.remove("avion");
		System.out.println(mediosTransporte.remove("acuatico"));
		// Norecibe posicion en el array
		// No recibe el valor directamente

		System.out.println("***************************");
		// Para saber el Largo
		// size metodo
		System.out.println(mediosTransporte.size());
		mediosTransporte.put("acuatico", "barco");
		mediosTransporte.put("vialTerrestre", "tren");

		System.out.println("***************************");
		System.out.println("**RECORRER AREGLOS CON FOR ITERATOR ***");

		for (String transporte : mediosTransporte.keySet()) {
			System.out.println(transporte);
		}

		// consultar como obtengo otro dato VAlores
		// respuesta for valores
		// Print keys and values
		for (String transporte : mediosTransporte.keySet()) {
			System.out.println("Clase (KEY): " + transporte + " Valor (value): " + mediosTransporte.get(transporte));
		}

		// con Ciclo While
		/*Usar un iterador para recorrer un HashMap.
		 * 
		 *  En este método, el iterador se 
		usa para iterar cada par mapeado en HashMap como se muestra en el siguiente programa Java.*/
		/*
		 * Iterator<String> it1 = mediosTransporte.iterator(); while (it1.hasNext()) {
		 * String transporte = it1.next(); } System.out.println(mediosTransporte);
		 */

		Iterator<Entry<String, String>> new_Iterator = mediosTransporte.entrySet().iterator();
		// While
		while (new_Iterator.hasNext()) {
			Map.Entry<String, String> new_Map = (Map.Entry<String, String>) new_Iterator.next();

			// Imprimiendo en consola

			System.out.println(new_Map.getKey() + "=" + new_Map.getValue());

		}

	}

}
