package pkgGestioTeatreUlldecona;

import pkgTeatregrama.*;

import java.util.*;

/**
 * Cas_5 M03 Programa GestioTeatreUlldecona: Programa inicial del proyecto del
 * mismo nombre. Implementa una aplicación para la gestión del teatro (obras,
 * público, patio de butacas). Llama a las clases Client.java, Teatre.java,
 * Obra.java y Seient.java
 * 
 * @author Daniela Gallardo Reyes
 * @version 2.0
 * @since 15-03-2021
 */

public class GestioTeatreUlldecona {
	

	// método main
	public static void main(String[] args) {

		// 1. Declarar array con opcions del menú fuera de la función
		String[] opcions = new String[5];
		Scanner sc = new Scanner(System.in);
		opcions[0] = "[o](Crear) obra de teatre";
		opcions[1] = "[s](Crear) sala de teatre";
		opcions[2] = "[p](Crear) persona del público";
		opcions[3] = "[v]vore pati de butaques";
		opcions[4] = "[x]sortir";

		// 2. variable para salir del programa
		boolean sortir = false;

		do {
			//var para guardarnos la opcion seleccionada
			char opcio;
			//llamamos al metodo para imprimir el menu
			opcio=menu(opcions);
			Obra obra=null;
			Teatre teatreUlldecona=null;
			switch (opcio) {

			case 'o':
				System.out.println("-----------------------------");
				System.out.println("  [o](Crear)obra de teatre  ");
				System.out.println("-----------------------------");
				obra=crearObraTeatre();
				
				System.out.println("-----------------------------");
				System.out.println("    OBRA CREADA CON ÉXITO!   ");
				System.out.println("-----------------------------");				
				System.out.println(obra.toString());
				break;

			case 's':
				System.out.println("-------------------------");
				System.out.println("[s](Crear) sala de teatre");
				System.out.println("-------------------------");
				teatreUlldecona=crearSalaTeatre(obra);
				
				teatreUlldecona.voreSeientsOcupats();
				
				break;
			case 'p':
				System.out.println("[p](Crear) persona del público");
				
				

				break;

			case 'v':
				System.out.println("[v]Vore pati de butaques");
				
				teatreUlldecona.voreSeientsOcupats();

				break;
			
			case 'x':
				System.out.println("[x]sortir");
				System.out.println("Fin del programa. ¡Adiós!");
				sortir = true;
				break;	
				
			default:
				System.out.println("\n-----------------------------------------");
				System.out.println("| OJO! debes ingresar una opción válida!|");
				System.out.println("-----------------------------------------\n");
				sortir=false;
			}

		} while (sortir == false);

	}// fin método main

	/**
	 * Función Menú. Imprime el menú de opciones por pantalla y pide ingresar una por teclado
	 * @param opcions
	 * @return opción seleccionada tipo char
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
		//retornamos opcio al main				
		return opcio1;
		
	}
	
	/**
	 * Método crearObraTeatre.
	 * Crea un objeto de la clase Obra
	 * @param String titol,int durada,String autor,boolean EsParaMajorsdEdat
	 * @return Objeto obra.
	 */
	public static Obra crearObraTeatre(){
		Scanner sc=new Scanner(System.in);
		Obra nuevaObra;
		String titol;
		int durada;
		String autor;
		boolean EsParaMajorsdEdat;
		
		System.out.println("Ingresa el nombre de la OBRA");
		titol=sc.nextLine();
		System.out.println("Ingresa la durada de "+titol+ " en minutes");
		durada=sc.nextInt();
		Scanner sc2=new Scanner(System.in);
		System.out.println("Ingresa el autor de l'OBRA "+titol);
		autor=sc2.nextLine();
		
		EsParaMajorsdEdat=sn();

		nuevaObra=new Obra(titol, durada, autor, EsParaMajorsdEdat);

	return nuevaObra;	
	}
	/**
	 * Método sn().
	 * Asigna valor a un booleano por teclado.
	 * Para saber si una obra es para majors de edat o no.
	 * @param nada.
	 * @return true o false.
	 */
	private static boolean sn() {
		boolean resposta = false;
		char es_o_no;
		Scanner sc= new Scanner(System.in);
		System.out.println(" L'OBRA es para majors d'edats? ");
		System.out.println("----- Respon[s]í ó [n]o -----");
		es_o_no=sc.next().charAt(0);
		if(es_o_no=='s') {
			resposta=true;
		}else if(es_o_no=='n') {
			resposta=false;
		}else if(es_o_no!='s'||es_o_no!='n') {
			System.out.println("debes ingresar un carácter válido");
		}
		return resposta;
	}
	
	/**
	 * Método crearSalaTeatre().
	 * Crea una sala de teatro.
	 * @param objeto de la clase Obra. 
	 * @return objeto de la clase Teatre.
	 */
	public static Teatre crearSalaTeatre(Obra obra) {
		Scanner sc1=new Scanner(System.in);
		Scanner sc2=new Scanner(System.in);
		Teatre nuevaSala;
		double preu; 
		int fila; 
		int num;
		System.out.println("Ingresa el valor de la entrada");
		preu=sc1.nextDouble();
		System.out.println("Cuántas filas de asientos tendrá la sala?");
		fila=sc1.nextInt();
		System.out.println("Cuántas cuantos seients tendrá cada fila?");
		num=sc2.nextInt();
		
		nuevaSala=new Teatre(obra,preu,fila,num);
		return nuevaSala;
	}

}// fin clase GestioTeatreUlldecona
