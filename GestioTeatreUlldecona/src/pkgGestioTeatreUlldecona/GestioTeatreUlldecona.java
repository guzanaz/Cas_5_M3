package pkgGestioTeatreUlldecona;
import pkgTeatregrama.Client;
/**
 * Cas_5 M03 Programa GestioTeatreUlldecona: Programa inicial del proyecto del
 * mismo nombre. Implementa una aplicación para la gestión del teatro (obras,
 * público, patio de butacas). Llama a las clases Client.java, Teatre.java,
 * Obra.java y Seient.java
 * 
 * @author Daniela Gallardo Reyes
 * @version 1.0
 * @since 15-03-2021
 */

public class GestioTeatreUlldecona {
	//método main
	public static void main(String[] args) {
		// Prueba crear objetos cliente
		Client client1 = new Client("Daniela",30,500);
		Client client2 = new Client("Gabriela",28,1000);
		
		System.out.println(client1.getNom());
		System.out.println(client2.toString());
	}//fin método main


}//fin clase GestioTeatreUlldecona
