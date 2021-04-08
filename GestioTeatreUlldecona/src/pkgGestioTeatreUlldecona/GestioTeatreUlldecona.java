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
		String[] opcions = new String[4];
		Scanner sc = new Scanner(System.in);
		opcions[0] = "[o]Crear Obra de teatre";
		opcions[1] = "[s]Crear Sala de teatre";
		opcions[2] = "[p]Crear Persona del público";
		opcions[3] = "[x]sortir";

		// 2. variable para salir del programa
		boolean sortir = false;

		do {
			//var para guardarnos la opcion seleccionada
			char opcio;
			//llamamos al metodo para imprimir el menu
			opcio=menu(opcions);
			
			switch (opcio) {

			case 'o':
				System.out.println("[O]Crear Obra de teatre");
				
				
				
				break;

			case 's':
				System.out.println("[S]Crear Sala de teatre");

				break;

			case 'p':
				System.out.println("[P]Crear Persona del público");
				
				

				break;

			case 'x':
				System.out.println("[X]sortir");
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
	 * Función Menú. Imprime el menú de opciones por pantalla y pide seleccionar una por teclado
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

}// fin clase GestioTeatreUlldecona
