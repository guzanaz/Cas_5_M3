package pkgTeatregrama;
//import pkgTeatregrama.Client;

/**
 * Cas_5 M03 Clase Seient: clase del proyecto GestioTeatreUlldecona. Conforma
 * el paquete pkgTeatregrama. Contiene atributos y métodos para la gestión de
 * los asientos del teatro. Sus atributos y métodos se utilizan en el programa
 * inicial GestioTeatreUlldecona.java
 * 
 * @author Daniela Gallardo Reyes
 * @version 1.0 (Esqueleto de la clase)
 * @since 15-03-2021
 */

public class Seient {
	
	/**
	 * Els atributs seran 
	 * la fila, 
	 * el numero 
	 * i public (la persona que l’ocupa o null).
	 */
	 private String fila;
	 private int num;
	 private String publico;
	 
	// ------------------------------------------------------------------------//
	// -------------------------------- Métodos -------------------------------//
	// ------------------------------------------------------------------------//
	/**
	 * @return the fila
	 */
	public String getFila() {
		return fila;
	}


	/**
	 * @return the num
	 */
	public int getNum() {
		return num;
	}


	/**
	 * @return the publico
	 */
	public String getPublico() {
		return publico;
	}


	/**
	 * @param fila the fila to set
	 */
	public void setFila(String fila) {
		this.fila = fila;
	}


	/**
	 * @param num the num to set
	 */
	public void setNum(int num) {
		this.num = num;
	}


	/**
	 * @param publico the publico to set
	 */
	public void setPublico(String publico) {
		this.publico = publico;
	}
	

	public String toString() {
		return "Seient fila=" + fila + ", num=" + num + ", publico=" + publico;
	}


	/**
	 * Método seientDisponible. 
	 * Confirma si un asiento está disponible o no.
	 * @param 
	 * @return true or false
	 */
	public boolean seientDisponible(){
		boolean resultado=true;//por decir algo
		
		return resultado;
	}
	
	
	// ------------------------------------------------------------------------//
	// --------------------------- Constructor/es -----------------------------//
	// ------------------------------------------------------------------------//
	//constructor que acepta 3 argumentos (fila, num, publico)
	public Seient(String fila, int num, String publico){
		this.fila=fila;
		this.num=num;
		this.publico=publico;
	}

	/**
	 * main sólo para pruebas debe ser borrado en su versión final
	 * @param args
	 */
	public static void main(String[] args) {
		// creamos instancias de prueba
		Seient seient1=new Seient("A",1,"Juanita");
		Seient seient2=new Seient(" ",0," ");
		
		//pruebas método set
		seient2.setFila("Z");
		seient2.setNum(12);
		seient2.setPublico("Josefa");
		
		//imprimimos para comprobar met. toString
		System.out.println(seient1.toString());
		System.out.println(seient2.toString());
		
		//imprimimos para comprobar met. get
		System.out.println("seient1 fila= "+ seient1.getFila());
		System.out.println("seient1 nro= "+ seient1.getNum());
		System.out.println("seient1 publico="+ seient1.getPublico());
		System.out.println(seient2.toString());		
	}

}
