package pkgTeatregrama;

/**
 * Cas_5 M03 Clase Client: clase del proyecto GestioTeatreUlldecona. Conforma
 * el paquete pkgTeatregrama. Contiene atributos y métodos para la gestión de
 * los clientes del teatro. Sus atributos y métodos se utilizan en el programa
 * inicial GestioTeatreUlldecona.java
 * 
 * @author Daniela Gallardo Reyes
 * @version 1.0 (Esqueleto de la clase)
 * @since 15-03-2021
 */

//Creamos una clase public para los clientes
public class Client {
	// Estructura de la clase: Creamos los atributos para cada cliente
	private String nom;// nombre del cliente
	private int edat;// edad del cliente
	private  double diners;// cantidad de dinero del cliente
	private double valorEntrada=20;//valor entrada

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
	public double getDiners(){
		return diners;
	}
	
	public double getValorEntrada() {
		return valorEntrada;
	}

	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom){
		this.nom = nom;
	}

	/**
	 * @param edat the edat to set
	 */
	public void setEdat(int edat){
		this.edat = edat;
	}

	/**
	 * @param diners the diners to set
	 */
	public void setDiners(double diners){
		this.diners = diners;
	}
	

	public void setValorEntrada(double valorEntrada) {
		this.valorEntrada = valorEntrada;
	}
	
	/**
	 * Método teDiners. Mira si el cliente tiene suficiente dinero para pagar la
	 * entrada al teatro. Utiliza el paso de valores por valor.
	 * @param double valorEntrada (para comparar con el total de diners que tiene el cliente)
	 * @return true or false
	 */
	public boolean teDiners(double valorEntrada){
		boolean resultado;
		if(diners>=valorEntrada){
			resultado=true;
		}else {
			resultado=false;
		}
		return resultado;
	}

	/**
	 * Método pagarEntrada. Resta el dinero de la entrada al dinero del cliente.
	 * Utiliza el paso de valores por valor y actualiza el atributo diners.
	 * @param double valorEntrada
	 * @return double diners actualizado (cambio después de pagar entrada).
	 */
	public double pagarEntrada(double valorEntrada) {
		double cambio;
		cambio=diners-valorEntrada;
		diners=cambio;
		return diners;//actualizamos el valor de diners o no
	}

	/**
	 * Método majorEdat. Mira si el cliente es mayor de edad o no.
	 * @param nada.
	 * @return true or false.
	 */
	public boolean majorEdat(){
		boolean resultado;
		if (edat>=18) {
			resultado=true;
		} else {
			resultado=false;
		}	
		return resultado;
	}

	/**
	 * Método toString. 
	 * Devuelve los atributos del cliente en forma de frase.
	 * @param atributos Client.
	 * @return Cadena de caracteres con los datos del cliente.
	 */
	
	public String toString() {
		return "Client nom: " + nom + " Edat: " + edat + " Diners: " + diners+"€";
	}

	// ------------------------------------------------------------------------//
	// --------------------------- Constructor/es -----------------------------//
	// ------------------------------------------------------------------------//
	
	//constructor que acepta 3 argumentos (nom, edat i diners)
	public Client (String nom, int edat, double diners) {
		this.nom=nom;
		this.edat=edat;
		this.diners=diners;
	}
	
	//constructor que acepta 2 argumentos (edat i diners), el nom lo pondremos como «anonim».
	public Client(int edat, double diners) {
		
	}
	
	
	// constructor que acepta 1 argumento (diners), el nombre lo pondremos como  «anonim» y edat 99
	public Client(double diners){
		
	}

	/**
	 * main sólo para pruebas debe ser borrado en su versión final
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// Prueba crear objetos cliente
		Client client1 = new Client("Daniela",30,500.00);
		Client client2 = new Client("Gabriela",27,1000.00);
		
		client1.pagarEntrada(client1.getValorEntrada());
		client2.pagarEntrada(client2.getValorEntrada());
		System.out.println("después de pagar la entrada "+client1.getNom()+" tiene "+client1.getDiners()+"€");
		System.out.println(client2.toString());
	}// fin main



}// fin public class Client
