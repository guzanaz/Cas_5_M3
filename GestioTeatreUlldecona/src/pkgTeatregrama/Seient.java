package pkgTeatregrama;

//import java.util.Scanner;
/**
 * Cas_5 M03 Clase Seient: clase del proyecto GestioTeatreUlldecona. Conforma
 * el paquete pkgTeatregrama. Contiene atributos y métodos para la gestión de
 * los asientos del teatro. Sus atributos y métodos se utilizan en el programa
 * inicial GestioTeatreUlldecona.java
 * 
 * @author Daniela Gallardo Reyes
 * @version 2.1 (entrega final PERO siempre pueden haber mejoras)
 * @since 15-03-2021
 */

public class Seient {
	/**
	 * Els atributs seran 
	 * la fila, 
	 * el numero 
	 * i public (la persona que l’ocupa o null).
	 */
	 private int fila;
	 private int num;
	 private Client client;
	 
	// ------------------------------------------------------------------------//
	// -------------------------------- Métodos -------------------------------//
	// ------------------------------------------------------------------------//
	/**
	 * @return the fila
	 */
	public int getFila() {
		return fila;
	}

	/**
	 * @return the num
	 */
	public int getNum() {
		return num;
	}


	/**
	 * @return the client
	 */
	public Client getClient() {
		return client;
	}


	/**
	 * @param fila the fila to set
	 */
	public void setFila(int fila) {
		this.fila = fila;
	}


	/**
	 * @param num the num to set
	 */
	public void setNum(int num) {
		this.num = num;
	}


	/**
	 * @param client the client to set
	 */
	public void setClient(Client client) {
		this.client = client;
	}
	

	public String toString() {
		String tempPublico;
		if (client!=null) {
			//llamar met clase client tostring
			tempPublico=client.toString();
		}else {
			tempPublico="ningú";
		}
		
		
		return "Seient fila:" + fila + ", num:" + num + tempPublico;
	}


	/**
	 * Método seientDisponible. 
	 * Confirma si un asiento está disponible o no.
	 * @param 
	 * @return true or false
	 */
	public boolean seientOcupat(){
	
		return client!=null;
	}
		
	// ------------------------------------------------------------------------//
	// --------------------------- Constructor/es -----------------------------//
	// ------------------------------------------------------------------------//
	//constructor que acepta 3 argumentos (fila, num, client)
	public Seient(int fila, int num, Client client){
		this.fila=fila;
		this.num=num;
		this.client=client;
	}



}
