package pkgTeatregrama;

/**
 * Cas_5 M03 Clase Obra: clase del proyecto GestioTeatreUlldecona. Conforma
 * el paquete pkgTeatregrama. Contiene atributos y métodos para la gestión de
 * las obras del teatro. Sus atributos y métodos se utilizan en el programa
 * inicial GestioTeatreUlldecona.java
 * 
 * @author Daniela Gallardo Reyes
 * @version 1.0 (Esqueleto de la clase)
 * @since 15-03-2021
 */

public class Obra {
	/**
	 *  Els atributs seran el titol, 
	 *  la durada, 
	 *  l’autor 
	 *  i si és per a majors d’edat. 
	 */
	private String titol;
	private double durada;
	private String autor;
	private boolean majorEdat;
	
	/**
	 * Recordeu crear mètodes (getters i setters i toString).
	 */
	
	/**
	 * @return the titol
	 */
	public String getTitol() {
		return titol;
	}

	/**
	 * @return the durada
	 */
	public double getDurada() {
		return durada;
	}

	/**
	 * @return the autor
	 */
	public String getAutor() {
		return autor;
	}

	/**
	 * @return the majorEdat
	 */
	public boolean isMajorEdat() {
		return majorEdat;
	}

	/**
	 * @param titol the titol to set
	 */
	public void setTitol(String titol) {
		this.titol = titol;
	}

	/**
	 * @param durada the durada to set
	 */
	public void setDurada(double durada) {
		this.durada = durada;
	}

	/**
	 * @param autor the autor to set
	 */
	public void setAutor(String autor) {
		this.autor = autor;
	}

	/**
	 * @param majorEdat the majorEdat to set
	 */
	public void setMajorEdat(boolean majorEdat) {
		this.majorEdat = majorEdat;
	}
	

	public String toString() {
		return "Obra [titol=" + titol + ", durada=" + durada + ", autor=" + autor + ", majorEdat=" + majorEdat + "]";
	}
	
	
	/**
	 * i un constructor semblants al cas anterior. 
	 * També heu de crear algunes instàncies  i comprovar tots els mètodes
	 */
	
	//constructor que acepta 3 argumentos (nom, edat i diners)
		public Client (String titol, double durada, String autor, boolean majorEdat) {
			this.titol=titol;
			this.
		}
	
	
	
	/**
	 * main sólo para pruebas debe ser borrado en su versión final
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}


	

}
