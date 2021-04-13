package pkgGestioTeatreUlldecona;

import pkgTeatregrama.*;

import java.util.Scanner;

/**
 * Cas_5 M03 Programa GestioTeatreUlldecona: Programa inicial del proyecto del
 * mismo nombre. Implementa una aplicación para la gestión del teatro (obras,
 * público, patio de butacas). Llama a las clases Client.java, Teatre.java,
 * Obra.java y Seient.java
 * 
 * @author Daniela Gallardo Reyes
 * @version 2.1 (entrega final PERO siempre pueden haber mejoras)
 * @since 15-03-2021
 */

public class GestioTeatreUlldecona {

	// método main
	public static void main(String[] args) {
		// 1. Declarar array con opcions del menú fuera de la función
		String[] opcions = new String[6];
		Scanner sc = new Scanner(System.in);
		opcions[0] = "[o](Crear) obra de teatre";
		opcions[1] = "[s](Crear) sala de teatre";
		opcions[2] = "[p](Crear) persona del público";
		opcions[3] = "[l]Llistar informació public";
		opcions[4] = "[v]Vore pati de butaques";
		opcions[5] = "[x]Sortir";

		// 2. variable para salir del programa
		boolean sortir = false;
		// 3. Crear objeto obra e inicializar su valor
		Obra obra = null;
		// 4.Crear objeto Teatre e inicializar su valor
		Teatre teatreUlldecona = null;

		// num de clients
		int num_clients = 5;
		// 5. Array de objetos client/public
		Client client[] = new Client[num_clients];
		// 5.1 Asignar un valor inicial al array de objetos client/public
		int contador;
		for (contador = 0; contador < client.length; contador++) {
			client[contador] = null;
		}

		// Seient tipo seient
		Seient seient = null;
		do {
			// var para guardarnos la opcion seleccionada
			char opcio;
			// llamamos al metodo para imprimir el menu
			opcio = menu(opcions);

			switch (opcio) {

			case 'o':
				System.out.println("-----------------------------");
				System.out.println("  [o](Crear)obra de teatre  ");
				System.out.println("-----------------------------");
				obra = crearObraTeatre();

				System.out.println("------------------------------");
				System.out.println("     OBRA CREADA AMB ÈXIT!    ");
				System.out.println("------------------------------");
				System.out.println(obra.toString());
				break;

			case 's':
				System.out.println("-------------------------");
				System.out.println("[s](Crear) sala de teatre");
				System.out.println("-------------------------");
				if (obra == null) {
					System.out.println("Has de crear una obra abans de crear una sala");
				} else {
					teatreUlldecona = crearSalaTeatre(obra);
					teatreUlldecona.voreSeientsOcupats();
				}

				break;
			case 'p':
				System.out.println("------------------------------");
				System.out.println("[p](Crear) persona del público");
				System.out.println("------------------------------");
				if (obra == null || teatreUlldecona == null) {
					System.out.println("Abans de crear el públic has de crear primero una obra i luego una sala");
					break;
				}
				;

				for (int i = 0; i < client.length; i++) {
					if (client[i] == null) {
						client[i] = crearClientPublic();
						System.out.println("---------------");
						System.out.println("CLIENT CREAT...");
						System.out.println("---------------");
						System.out.println(client[i].toString());

						// método para pagar entrada
						System.out.println("-----------------");
						System.out.println("PAGANT ENTRADA...");
						System.out.println("-----------------");
						client[i].pagarEntrada(client[i], teatreUlldecona);
						System.out.println(client[i].toString());
						if (client[i].getDiners() < teatreUlldecona.getPreu()) {
							System.out.println("VALOR DE L'ENTRADA :" + teatreUlldecona.getPreu() + "€");
							break;
						}
						// método para asignar un asiento
						seient = asignarAsiento(client[i], teatreUlldecona);
						teatreUlldecona.reservaSeient(seient);
						// Confirmación de reseva
						System.out.println("|| Seients disponibles [O] || Seients ocupats [X] ||");
						teatreUlldecona.voreSeientsOcupats();
						teatreUlldecona.llistarPublico();
//						teatreUlldecona.imprimirTodosAsientos();
						break;
					}
				}
				break;

			case 'v':
				System.out.println("------------------------");
				System.out.println("[v]Vore pati de butaques");
				System.out.println("------------------------");
				if (obra == null || teatreUlldecona == null) {
					System.out.println("Per veure el pati de butaques has de crear una sala de teatre");
					break;
				} else {
					teatreUlldecona.voreSeientsOcupats();
				}
				break;

			case 'l':
				teatreUlldecona.llistarPublico();
				break;

			case 'x':
				System.out.println("----------------------");
				System.out.println("      [x]Sortir!      ");
				System.out.println("----------------------");
				System.out.println("Fi del programa. Adeu!");
				System.out.println("----------------------");
				sortir = true;
				break;

			default:
				System.out.println("\n-----------------------------------------");
				System.out.println("| COMPTE! has d'ingressar una opció vàlida!|");
				System.out.println("-----------------------------------------\n");
				sortir = false;
			}
		} while (sortir == false);

		for (int i = 0; i < client.length; i++) {
			System.out.println(client[i]);
		}

	}// fin método main

	/**
	 * Función Menú. Muestra el menú de opciones por pantalla y pide ingresar una
	 * opción del menú por teclado
	 * 
	 * @param opcions
	 * @return variable tipo char (opción seleccionada)
	 */
	public static char menu(String[] opcions) {
		System.out.println("-----------------------------");
		System.out.println("|         MENÚ TEATRE       |");
		System.out.println("-----------------------------");
		for (int i = 0; i < opcions.length; i++) {
			System.out.println(opcions[i]);
		}
		// Preguntamos qué opción seleccionarán
		System.out.println("-----------------------------");
		System.out.println("|       QUÉ VOLS FER?       |");
		System.out.println("-----------------------------");
		System.out.println("    [ingressa una opció]   ");

		// entrada por teclado
		Scanner sc = new Scanner(System.in);
		// guardamos la entrada en opcio
		char opcio1 = sc.next().charAt(0);
		// retornamos opcio al main
		return opcio1;

	}

	/**
	 * Método crearObraTeatre. Crea un objeto de la clase Obra
	 * 
	 * @param String titol,int durada,String autor,boolean EsParaMajorsdEdat
	 * @return Objeto obra.
	 */
	public static Obra crearObraTeatre() {
		Scanner sc = new Scanner(System.in);
		Obra nuevaObra;
		String titol;
		int durada;
		String autor;
		boolean EsParaMajorsdEdat;

		System.out.println("Ingressa el nom de l'OBRA");
		titol = sc.nextLine();
		System.out.println("Ingressa la durada de " + titol + " en minuts");
		durada = sc.nextInt();
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Ingressa l'autor de l'OBRA " + titol);
		autor = sc2.nextLine();

		EsParaMajorsdEdat = sn();

		nuevaObra = new Obra(titol, durada, autor, EsParaMajorsdEdat);

		return nuevaObra;
	}

	/**
	 * Método sn(). Asigna valor a un booleano por teclado. Para saber si una obra
	 * es para majors de edat o no.
	 * 
	 * @param nada.
	 * @return true o false.
	 */
	private static boolean sn() {
		boolean resposta = false;
		char es_o_no;
		Scanner sc = new Scanner(System.in);
		System.out.println(" L'OBRA es para majors d'edats? ");
		System.out.println("----- Respon[s]í ó [n]o -----");
		es_o_no = sc.next().charAt(0);
		if (es_o_no == 's') {
			resposta = true;
		} else if (es_o_no == 'n') {
			resposta = false;
		} else if (es_o_no != 's' || es_o_no != 'n') {
			System.out.println("has d'introduir un caràcter vàlid");
			System.out.println("s ó n");
		}
		return resposta;
	}

	/**
	 * Método crearSalaTeatre(). Crea una sala de teatro.
	 * 
	 * @param objeto de la clase Obra.
	 * @return objeto de la clase Teatre.
	 */
	public static Teatre crearSalaTeatre(Obra obra) {
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		Teatre nuevaSala;
		double preu;
		int fila;
		int num;
		System.out.println("Ingressa el preu de l'entrada");
		preu = sc1.nextDouble();
		System.out.println("Quantes files de seients tindrà la sala?");
		fila = sc1.nextInt();
		System.out.println("Quants seients tindrà cada fila?");
		num = sc2.nextInt();
		nuevaSala = new Teatre(obra, preu, fila, num);
		return nuevaSala;
	}

	/**
	 * Método crearClientPublic(). Crea un objeto de tipo Client que sería el
	 * público del teatro.
	 * 
	 * @param nada
	 * @return objeto de la clase Client.
	 */
	public static Client crearClientPublic() {
		Scanner sc = new Scanner(System.in);
		Client nouClient;
		String nom;
		int edat;
		double diners;
		System.out.println("Ingressa el nom del client del public");
		nom = sc.nextLine();
		System.out.println("Ingressa la edat de " + nom);
		edat = sc.nextInt();
		System.out.println("Quants diners té " + nom + " ?");
		diners = sc.nextDouble();
		nouClient = new Client(nom, edat, diners);
		return nouClient;
	}

	/**
	 * Método asignar asiento. Complementario para el método reservar asiento.
	 * 
	 * @param objeto de la clase Client + objeto de la clase Teatre
	 * @return objeto de la clase Seient(asiento/butaca)
	 */
	public static Seient asignarAsiento(Client client, Teatre teatre) {
		System.out.println("--------------------");
		System.out.println("ASSIGNA UN SEIENT...");
		System.out.println("--------------------");
		System.out.println("|| Seients disponibles [O] || Seients ocupats [X] ||");
		teatre.voreSeientsOcupats();
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		System.out.println("En qué fila quieres tu asiento?");
		int fila = sc1.nextInt();
		System.out.println("De la fila " + fila + " qué asiento quieres?");
		int num = sc2.nextInt();
		Seient seient = new Seient(fila, num, client);
		System.out.println("-------------------");
		System.out.println("RESERVANT SEIENT...");
		System.out.println("-------------------");
		return seient;
	}

}// fin clase GestioTeatreUlldecona
