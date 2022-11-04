package cl.generation.f20221027;
// INSTANCIA DE CLASE 
// Notas ---------------------------------------
/*
 * 1- la unica manera de pasar atributos a un objeto en forma
 * privada es a travez del setter 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * */
public class UsoObjeto {
	public static void main(String[] args) {
    
		Auto auto1 = new Auto() ;
		//auto1.color="blanco";
		
// Asignar valores a los atributos privados 
		auto1.setColor("blanco");
		auto1.setMarca("nissan");
		auto1.setCilindrada(1.6f);
		
		// Saber sobre el contenido de los atributos 
		System.out.println(auto1.toString());
		
		
		
		
		//Nueva instancia con parametros 
		Auto car = new Auto("nissan","negro","Qashqaui",1.6f,10.0f,240f);
        System.out.println(car.toString());
        car.avanzar();
	}
}
