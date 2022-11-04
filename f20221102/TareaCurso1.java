package cl.generation.f20221102;

import java.util.ArrayList;

public class TareaCurso1 {
	public static void main(String[] args) {

		ArrayList <Alumnos> listaAlumnos = new ArrayList <Alumnos>();
	     Alumnos alum1 = new Alumnos ();
	     alum1.setNombre("daniel");
	     alum1.setApellido("gonzales");
	     alum1.setEdad(12);
	     alum1.setCurso("8vo basico");
	     
	     Alumnos alum2 = new Alumnos();
	     alum2.setNombre("rosa");
	     alum2.setApellido("rojas");
	     alum2.setEdad(5);
	     alum2.setCurso("Kinder");
	     
	     Alumnos alum3= new Alumnos();
	     alum3.setNombre("juanito");
	     alum3.setApellido("perez");
	     alum3.setEdad(10);
	     alum3.setCurso("4to basico");
	     
	     listaAlumnos.add(alum1);
	     listaAlumnos.add(alum2);
	     listaAlumnos.add(alum3);
	     
	     for (Alumnos alumnos : listaAlumnos) {
	    	 System.out.println(alumnos.toString());
	     }
	     
	     //array administrativos 

			ArrayList <Administrativos> listaAdmi = new ArrayList <Administrativos>();
			Administrativos adm1= new Administrativos();
			adm1.setNombre("monica");
			adm1.setApellido("perez");
			adm1.setEdad(54);
			adm1.setCargo("secretaria");
			
			Administrativos adm2= new Administrativos();
			adm2.setNombre("roberto");
			adm2.setApellido("carcamo");
			adm2.setEdad(52);
			adm2.setCargo("sostenedor ");
			
			Administrativos adm3 = new Administrativos();
			adm3.setNombre("Camilo");
			adm3.setApellido("Rosales");
			adm3.setCargo("Sub director");
			
			listaAdmi.add(adm1);
			listaAdmi.add(adm2);
			listaAdmi.add(adm3);
	     
			for (Administrativos admi : listaAdmi) {
		    	 System.out.println(admi.toString());
		     }
			
			
			// array profes
			ArrayList<Profesores> profes = new ArrayList <Profesores>();
			
			Profesores profe = new Profesores();
			profe.setNombre("Sonia");
			profe.setAsignatura("matemáticas");
			profe.setEdad(23);
			profe.setCursoAcargo("octavo");
			profe.setApellido("Alcalino");
			
			Profesores profe2 = new Profesores();
			
			profe2.setNombre("Cata");
			profe2.setAsignatura("Inglés");
			profe2.setEdad(23);
			profe2.setCursoAcargo("Primero");
			profe2.setApellido("Oso");
			
			Profesores profe3 = new Profesores();
			
			profe3.setNombre("Mateo");
			profe3.setAsignatura("Lenguaje");
			profe3.setEdad(23);
			profe3.setCursoAcargo("tercero");
			profe3.setApellido("Alvarez");
			
			profes.add(profe3);
			profes.add(profe2);
			profes.add(profe);
			
			for (Profesores profe1 : profes) {
				    System.out.println(profe1.toString());
				    }
	}
}
