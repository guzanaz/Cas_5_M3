package pkgTeatregrama;

/**
 * Cas_5 M03 Clase Clients: clase del proyecto GestioTeatreUlldecona. Conforma
 * el paquete pkgTeatregrama. Contiene atributos y métodos para la gestión de
 * los clientes del teatro. Sus atributos y métodos se utilizan en el programa
 * inicial GestioTeatreUlldecona.java
 * 
 * @author Daniela Gallardo Reyes
 * @version 1.0 (Esqueleto de la clase)
 * @since 15-03-2021
 */

//Creamos una clase public para los clientes
public class Clients {
	// Creamos los atributos para los clientes
	String nom;// nombre del cliente
	int edat;// edad del cliente
	int diners;// cantidad de dinero del cliente

	// ------------------------------------------------------------------------//
	// -------------------------------- Métodos -------------------------------//
	// ------------------------------------------------------------------------//
	/**
	 * Método TeDiners. Mira si el cliente tiene suficiente dinero para pagar la
	 * entrada al teatro. Utiliza el paso de valores por referencia diners=liquidez.
	 * 
	 * @param variable tipo int liquidez (cantidad total de dinero del cliente)
	 * @return variable tipo boolean que confirma si el cliente tiene o no tiene
	 *         suficiente dinero.
	 */
	public boolean teDiners(int liquidez) {
		boolean resultado;

		return resultado;
	}

	/**
	 * Método pagarEntrada. Resta el dinero de la entrada al dinero del cliente.
	 * Utiliza el paso de valores por referencia diners=liquidez.
	 * 
	 * @param variable tipo int liquidez (cantidad total de dinero del cliente)
	 * @return variable tipo int del dinero que le queda al clinte después de pagar
	 *         la entrada.
	 */
	public int pagarEntrada(int liquidez) {
		int cambio;

		return cambio;
	}

	/**
	 * Método majorEdat. Mira si el cliente es mayor de edad o no. Utiliza el paso
	 * de valor por referencia edat=mayor.
	 * 
	 * @param variable tipo int mayor (edad del cliente).
	 * @return variable tipo boolean que confirma si el cliente es mayor de edad o
	 *         no.
	 */
	public boolean mayorEdat(int mayor) {
		boolean resultado;

		return resultado;
	}

	/**
	 * Método toString. 
	 * Devuelve los datos del cliente en forma de frase.
	 * 
	 * @param variables(info del cliente).
	 * @return Cadena de caracteres con los datos del cliente.
	 */
	
	public String toString() {
		return "Client nom: " + nom + " Edat: " + edat + " Diners: " + diners;
	}

	// ------------------------------------------------------------------------//
	// ---------------------------- Constructores -----------------------------//
	// ------------------------------------------------------------------------//
	
	

	/**
	 * main sólo para pruebas debe ser borrado en su versión final
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}// fin main

}// fin public class Clients
