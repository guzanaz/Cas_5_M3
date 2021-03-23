package pkgTeatregrama;

/**
 * Cas_5 M03 Clase Teatre: clase del proyecto GestioTeatreUlldecona. 
 * Conforma el paquete pkgTeatregrama. 
 * -
 * sus recursos se ejecutan en el programa inicial GestioTeatreUlldecona.java
 * 
 * @author Daniela Gallardo Reyes
 * @version 1.0 (Esqueleto de la clase)
 * @since 15-03-2021
 */

public class Teatre {
	// Estructura de la clase: Creamos los atributos para cada teatro
	private String obra;//nom de la obra
	private double preu;//valor de la entrada
	private Seient[][] sessio;//array bidimensional de la clase Seient 
	
	// ------------------------------------------------------------------------//
	// -------------------------------- Métodos -------------------------------//
	// ------------------------------------------------------------------------//
	
	/**
	 * @return the obra
	 */
	public String getObra() {
		return obra;
	}


	/**
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
	 * @param obra the obra to set
	 */
	public void setObra(String obra) {
		this.obra = obra;
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
	/**Métodos
	 * mirar si un seient està buit, 
	 * assignar un seient, 
	 * comprovar si una persona pot entrar 
	 * (té diners? és major d’edat i l’obra és per a majors?, etc
	 */
	
	//no entiendo si debo hacer los metodos mencionado otra vez o no
	//porque en principio, los que se piden, están en las otras clases

	/**
	 * main sólo para pruebas debe ser borrado en su versión final
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
