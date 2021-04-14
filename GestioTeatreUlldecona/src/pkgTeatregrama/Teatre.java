package pkgTeatregrama;

//import java.util.Scanner;
/**
 * Cas_5 M03 Clase Teatre: clase del proyecto GestioTeatreUlldecona. Conforma el
 * paquete pkgTeatregrama. - sus recursos se ejecutan en el programa inicial
 * GestioTeatreUlldecona.java
 * 
 * @author Daniela Gallardo Reyes
 * @version 2.1 (entrega final PERO siempre pueden haber mejoras)
 * @since 15-03-2021
 */

public class Teatre {
	// Estructura de la clase: Creamos los atributos para cada teatro
	private static Obra obra;// nom de la obra
	private double preu;// valor de la entrada
	private Seient[][] sessio;// butacas disponibles c/nro de fila y nro de asiento
	private int fila;// para asignar el índice de filas al array sessio
	private int num;// para asignar el índice de num de butaca
	

	// ------------------------------------------------------------------------//
	// ---------------------------- Métodos get&set ---------------------------//
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


	// ------------------------------------------------------------------------//
	// --------------------------- Constructor/es -----------------------------//
	// ------------------------------------------------------------------------//

	//constructor de obra
	public Teatre(String titol,int durada,String autor,boolean EsParaMajorsdEdat){
	 obra = new Obra(titol, durada, autor, EsParaMajorsdEdat);    
	}
	
	// constructor que acepta 4 argumentos (obra, preu, fila, num)
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
	 * Método reservaSeient(). 
	 * Para asignar una butaca a un client.
	 * Si no está disponible avisa.
	 * @param sessio
	 * @return nada
	 */
	public void reservaSeient(Seient seient) {
		
		if (sessio[seient.getFila() - 1][seient.getNum() - 1].getClient() == null) {
			sessio[seient.getFila() - 1][seient.getNum() - 1] = seient;
			System.out.println(seient.toString());
		} else if(sessio[seient.getFila() - 1][seient.getNum() - 1].getClient() != null) {
			System.out.println("----------------------------------------------------");
			System.out.println("No s'ha pogut vendre perquè el seient ja està ocupat");
			System.out.println("----------------------------------------------------");
			System.out.println("       No pateixis que et tornarem els diners!      ");
			System.out.println("----------------------------------------------------");
		}
	}
	/**
	 * Método voreSeientsOcupats(). 
	 * Muestra por pantalla visualmente cómo queda 
	 * el patio de butacas(seients)en forma de tabla.
	 * Siendo Ocupado "X" y Disponible "O"
	 * @param nada
	 * @return nada
	 */
	public void voreSeientsOcupats() {
		System.out.println(" -------------------------------------------------");
		System.out.println("|                                                 |");
		System.out.println("|                     escenari                    |");
		System.out.println("|                                                 |");
		System.out.println(" -------------------------------------------------");
		for (int i = 0; i < fila; i++) {
			for (int j = 0; j < num; j++) {
				if(sessio[i][j].getClient()==null){
					//si el asiento está disponible
					System.out.print("| F"+(i+1)+".S"+(j+1)+" O ");
					   if (j+1 == num) {
						     System.out.println("|\b");   
					   }
				}else {
					//si el asiento está ocupado
					System.out.print("| F"+(i+1)+".S"+(j+1)+" X ");
					   if (j+1 == num) {
						     System.out.println("|\b");
					   }
				}
			}
		}
	}

	/**
	 * Método que imprime los asientos del teatro.
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

	/**
	 * Método que lista al público.
	 * @param nada
	 * @return nada
	 */
	public void llistarPublico() {
		System.out.println("\b---------------------------------------------------------------------------------");
		System.out.println("                             [l]llistar public                                    ");
		System.out.println("---------------------------------------------------------------------------------\b");
		for (int i = 0; i < fila; i++) {
			for (int j = 0; j < num; j++) {
				if(sessio[i][j].getClient()!=null){
					//imprime los datos
					System.out.println(sessio[i][j].toString());
					System.out.println("\b---------------------------------------------------------------------------------");
				}
			}
		}
	}
	public String toString() {
		return "Teatre Ulldecona \n"+ 
				obra + 
				"\npreu=" + preu + 
				"\nFilas=" + fila + 
				"\nNum Seients=" + num;
	}
	
	
	
	// método main
		public static void main(String[] args){//Prueba crear objeto seient1 		
//		Seient seient1=new Seient(2,2,client1);
//		System.out.println(seient1.toString());

		// prueba ejemplo objeto obra
		
		//Prueba crear objeto obraNueva
		Obra obraNueva = new Obra("Los Pensamientos", 120, "Tamara Acosta", true);
		System.out.println(obraNueva.toString());

//		// ejemplo de objeto de la clase Teatre
//		Teatre teatreUlldecona = new Teatre(obraNueva, 20, 5,5);
		
		//Prueba crear objeto teatreUlldecona
		Teatre teatreUlldecona = new Teatre(obraNueva, 20, 7,5);
		System.out.println(teatreUlldecona.toString());
		//Prueba método asientos disponibles SIN asientos asignado
		teatreUlldecona.imprimirTodosAsientos();


		//Probar método asientos disponibles sin asientos asignados
		
		//Prueba método asientos disponibles sin asientos asignados
//		teatreUlldecona.imprimirTodosAsientos();
		//Reservar asiento

		//Prueba Reservar asiento
//		teatreUlldecona.reservaSeient(seient1);
//		//Probar método asientos disponibles CON asiento asignado
//
//		//Prueba método asientos disponibles CON asiento asignado
//		teatreUlldecona.imprimirTodosAsientos();
//
//		
//		//prueba método para ver los asientos ocupados X=ocupado O=disponible
//		teatreUlldecona.voreSeientsOcupats();
	}
	

}
