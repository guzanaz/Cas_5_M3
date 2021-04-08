package pkgTeatregrama;

//import java.util.Arrays;

/**
 * Cas_5 M03 Clase Teatre: clase del proyecto GestioTeatreUlldecona. Conforma el
 * paquete pkgTeatregrama. - sus recursos se ejecutan en el programa inicial
 * GestioTeatreUlldecona.java
 * 
 * @author Daniela Gallardo Reyes
 * @version 2.0 (Pruebas de funcionamiento)
 * @since 15-03-2021
 */

public class Teatre {
	// Estructura de la clase: Creamos los atributos para cada teatro
	private static Obra obra;// nom de la obra
	private double preu;// valor de la entrada
	private Seient[][] sessio;// butacas disponibles c/nro de fila y nro de asiento
	private int fila;// para probar
	private int num;// para probar

	// ------------------------------------------------------------------------//
	// -------------------------------- Métodos -------------------------------//
	// ------------------------------------------------------------------------//

	/**Getter de obra
	 * @return the obra
	 */
	public Obra getObra() {
		return obra;
	}

	/**getter de preu
	 * @return the preu
	 */
	public double getPreu() {
		return preu;
	}

	/**
	 * @return the sessio
	 */
	public Seient[][] getSessio() {
		return sessio;
	}

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
	 * @param obra the obra to set
	 */
	public void setObra(Obra obra) {
		Teatre.obra = obra;
	}

	/**
	 * @param preu the preu to set
	 */
	public void setPreu(double preu) {
		this.preu = preu;
	}

	/**
	 * @param sessio the sessio to set
	 */

	public void setSessio(Seient[][] sessio) {
		this.sessio = sessio;
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
	 * Métodos mirar si un seient està buit, assignar un seient, comprovar si una
	 * persona pot entrar (té diners? és major d’edat i l’obra és per a majors?, etc
	 */

	// ------------------------------------------------------------------------//
	// --------------------------- Constructor/es -----------------------------//
	// ------------------------------------------------------------------------//

	//constructor de obra
	public Teatre(String titol,int durada,String autor,boolean EsParaMajorsdEdat){
	 obra = new Obra(titol, durada, autor, EsParaMajorsdEdat);    
	}
	
	// constructor que acepta 3 argumentos (obra, preu, sessio)
	public Teatre(Obra obra, double preu, int fila, int num) {
		Teatre.obra = obra;
		this.preu = preu;

		// asignar una llargada al array de asientos para filas y nro de asientos
		this.sessio = new Seient[fila][num];

		// iniciar los valores de los índices
		this.fila = fila;
		this.num = num;

		// iniciar el conteo que recorra ambos índices
		for (int i = 0; i < fila; i++) {
			for (int j = 0; j < num; j++) {
				sessio[i][j] = new Seient(i + 1, j + 1, null);
			}
		}
	}

	/**
	 * método que retorna si un asiento está ocupado
	 * 
	 * @param sessio
	 * @return si está disponible o no
	 */
	public void reservaSeient(Seient seient) {
		if (sessio[seient.getFila() - 1][seient.getNum() - 1].getClient() == null) {
			sessio[seient.getFila() - 1][seient.getNum() - 1] = seient;
		} else {
			System.out.println("No s'ha pogut vendre perquè el seient ja està ocupat");
		}
	}

	// getter de asientos
	public Seient getSeient(int fila, int num) {
		return sessio[fila - 1][num - 1];
	}

	/**
	 * Método que imprime los asientos del teatro.
	 * 
	 * @param nada
	 * @return nada
	 */
	public void imprimirTodosAsientos() {
		for (int i = 0; i < fila; i++) {
			for (int j = 0; j < num; j++) {
				System.out.println(sessio[i][j].toString());
			}
		}
	}

	public String toString() {
		return "Teatre Ulldecona \n"+ 
				obra + 
				"\npreu=" + preu + 
				"\nfila=" + fila + 
				"\nnum=" + num;
	}

	/**
	 * main sólo para pruebas debe ser borrado en su versión final
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// 
		Obra obraNueva=new Obra("Los Pensamientos",120,"Tamara Acosta",true);
		
		// ejemplo de objeto de la clase Teatre
		Teatre teatre1 = new Teatre(obraNueva,20, 1, 2);
		System.out.println(teatre1.toString());

	}

}
