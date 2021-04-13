package pkgTeatregrama;

//import java.util.Scanner;
/**
 * Cas_5 M03 Clase Client: clase del proyecto GestioTeatreUlldecona. Conforma el
 * paquete pkgTeatregrama. Contiene atributos y métodos para la gestión de el
 * client del teatro. Sus atributos y métodos se utilizan en el programa inicial
 * GestioTeatreUlldecona.java
 * 
 * @author Daniela Gallardo Reyes @version2.1 (entrega final PERO siempre pueden
 *         haber mejoras)
 * @since 15-03-2021
 */

//Creamos una clase public para los clientes
public class Client {
	// Estructura de la clase: Creamos los atributos para cada cliente
	private String nom;// nombre del cliente
	private int edat;// edad del cliente
	private double diners;// dinero del cliente

	// ------------------------------------------------------------------------//
	// -------------------------------- Métodos -------------------------------//
	// ------------------------------------------------------------------------//

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @return the edat
	 */
	public int getEdat() {
		return edat;
	}

	/**
	 * @return the diners
	 */
	public double getDiners() {
		return diners;
	}

	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @param edat the edat to set
	 */
	public void setEdat(int edat) {
		this.edat = edat;
	}

	/**
	 * @param diners the diners to set
	 */
	public void setDiners(double diners) {
		this.diners = diners;
	}

	/**
	 * Método teDiners. Mira si el cliente tiene suficiente dinero para pagar la
	 * entrada al teatro. Utiliza el paso de valores por valor.
	 * 
	 * @param double valorEntrada (para comparar con el total de diners que tiene el
	 *               cliente)
	 * @return true or false
	 */
	public boolean teDiners(Teatre teatre) {
		return (diners >= teatre.getPreu());
	}

	/**
	 * Método pagarEntrada. Resta el dinero de la entrada al dinero del cliente.
	 * Utiliza el paso de valores por valor y actualiza el atributo diners.
	 * 
	 * @param double valorEntrada
	 * @return double diners actualizado (cambio después de pagar entrada).
	 */
	public double pagarEntrada(Client client, Teatre teatre) {
		if (client.teDiners(teatre) == true && (client.getDiners() > teatre.getPreu())) {
			diners = diners - teatre.getPreu();
		} else {
			System.out.println(client.getNom() + " no té prou diners per pagar l'entrada");
		}
		return diners;// actualizamos el valor de diners o no
	}

	/**
	 * Método majorEdat. Mira si el cliente es mayor de edad.
	 * 
	 * @param nada.
	 * @return true or false.
	 */
	public boolean majorEdat() {
		return edat >= 18;
	}
	
	/**
	 * Método toString. Devuelve los atributos del cliente en forma de frase.
	 * 
	 * @param atributos Client.
	 * @return Cadena de caracteres con los datos del cliente.
	 */

	public String toString() {
		return " Client nom: " + nom + " Edat: " + edat + " Diners: " + diners + "€";
	}

	// ------------------------------------------------------------------------//
	// --------------------------- Constructor/es -----------------------------//
	// ------------------------------------------------------------------------//

	// constructor que me permite hacer un objeto vacío
	public Client() {
	}

	// constructor que acepta 3 argumentos (nom, edat i diners)
	public Client(String nom, int edat, double diners) {
		this.nom = nom;
		this.edat = edat;
		this.diners = diners;
	}

	// constructor que acepta 2 argumentos (edat i diners), el nom lo pondremos como
	// «anonim».
	public Client(int edat, double diners) {
		this.nom = " ";
		this.edat = edat;
		this.diners = diners;
	}

	// constructor que acepta 1 argumento (diners), el nombre lo pondremos como
	// «anonim» y edat 99
	public Client(double diners) {
		this.nom = " ";
		this.edat = 99;
		this.diners = diners;
	}

	int n = 1; // número de objetos tipo client
	// array para almacenar los objetos de tipo client
	Client[] client = new Client[n];



}// fin public class Client
