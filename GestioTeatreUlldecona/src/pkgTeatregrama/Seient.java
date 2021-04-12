package pkgTeatregrama;
//import pkgTeatregrama.Client;

/**
 * Cas_5 M03 Clase Seient: clase del proyecto GestioTeatreUlldecona. Conforma
 * el paquete pkgTeatregrama. Contiene atributos y métodos para la gestión de
 * los asientos del teatro. Sus atributos y métodos se utilizan en el programa
 * inicial GestioTeatreUlldecona.java
 * 
 * @author Daniela Gallardo Reyes
 * @version 2.0 (pruebas de funcionamiento)
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
		
		
		return "Seient fila:" + fila + ", num:" + num + ", client:" + tempPublico;
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

	/**
	 * main sólo para pruebas debe ser borrado en su versión final
	 * @param args
	 */
	public static void main(String[] args) {
		
		Client client1=new Client("Daniela",30,300);
		// creamos instancias de prueba
		Seient seient1=new Seient(1,1,client1);
		
		Seient seient2=new Seient(2,12,null);
		

		
		//imprimimos para comprobar met. get
//		System.out.println("seient1 fila= "+ seient1.getFila());
//		System.out.println("seient1 nro= "+ seient1.getNum());
		System.out.println(seient2.toString());
		System.out.println(seient1.toString());		
	}

}
