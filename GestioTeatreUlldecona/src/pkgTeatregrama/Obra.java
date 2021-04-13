package pkgTeatregrama;
//import java.util.Scanner;
/**
 * Cas_5 M03 Clase Obra: clase del proyecto GestioTeatreUlldecona. Conforma
 * el paquete pkgTeatregrama. Contiene atributos y métodos para la gestión de
 * las obras del teatro. Sus atributos y métodos se utilizan en el programa
 * inicial GestioTeatreUlldecona.java
 * 
 * @author Daniela Gallardo Reyes
 * @version 2.1 (entrega final PERO siempre pueden haber mejoras)
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
	private int durada;
	private String autor;
	private boolean EsParaMajorsdEdat;
	
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
	 * @return the EsParaMajorsdEdat
	 */
	public boolean EsParaMajorsdEdat() {
		return EsParaMajorsdEdat;
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
	public void setDurada(int durada) {
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
	public void setEsParaMajorsdEdat(boolean EsParaMajorsdEdat) {
		this.EsParaMajorsdEdat = EsParaMajorsdEdat;
	}
	

	public String toString() {
		return "Obra titol:" + titol + 
				"\ndurada:" + durada+" min." + 
				"\nautor:" + autor + 
				"\nEs para majors d'Edat=:" + EsParaMajorsdEdat;
	}
	
	// ------------------------------------------------------------------------//
	// --------------------------- Constructor/es -----------------------------//
	// ------------------------------------------------------------------------//	
	/**
	 * i un constructor semblants al cas anterior. 
	 * També heu de crear algunes instàncies  i comprovar tots els mètodes
	 */
	
	//constructor que acepta 4 argumentos (titol, durada, autor, EsParaMajorsdEdat)
		public Obra(String titol, int durada, String autor, boolean EsParaMajorsdEdat){
			this.titol=titol;
			this.durada=durada;
			this.autor=autor;
			this.EsParaMajorsdEdat=EsParaMajorsdEdat;
		}
	
	//constructor de obra  para usarlo en teatre.java
		public Obra(Obra obra) {
			this.titol=obra.titol;
			this.durada=obra.durada;
			this.autor=obra.autor;
			this.EsParaMajorsdEdat=obra.EsParaMajorsdEdat;
		}

	public Obra getObra(Obra Obra) {
		return Obra;
	}



}//fin clase
