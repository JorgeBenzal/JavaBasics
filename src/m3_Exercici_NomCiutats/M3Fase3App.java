/*
 * file: M3Fase3App.java
 * Autor: Jordi Benzal Iñigo
 * Date: 
 * Description:Exercici: Cambieu les vocals “a” dels noms 
 * de les ciutats per el numero 4 i guardeu els noms 
 * modificats en un nou array(ArrayCiutatsModificades).
 * -Mostreu per consola l’array modificat i ordenat per 
 * ordre alfabetic.
 */
package m3_Exercici_NomCiutats;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class M3Fase3App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String city1, city2, city3, city4, city5, city6;

		try (Scanner introduir=new Scanner(System.in)){
		
			//Solicitamos al usuario los nombres de 6 ciudades
			
			System.out.println("Introduir ciutat nº:1");
			city1= introduir.nextLine();
			System.out.println("Introduir ciutat nº:2");
			city2= introduir.nextLine();
			System.out.println("Introduir ciutat nº:3");
			city3= introduir.nextLine();
			System.out.println("Introduir ciutat nº:4");
			city4= introduir.nextLine();
			System.out.println("Introduir ciutat nº:5");
			city5= introduir.nextLine();
			System.out.println("Introduir ciutat nº:6");
			city6= introduir.nextLine();
		} 
			//Mostramos por consola el valor de las 6 variables
			
			System.out.println(city1);
			System.out.println(city2);
			System.out.println(city3);
			System.out.println(city4);
			System.out.println(city5);
			System.out.println(city6);
			
			
			//Definimos y asignamos valores a la ArrayList
			
			ArrayList<String> arrayCiutats = new ArrayList<>();
			
			arrayCiutats.add(city1);
			arrayCiutats.add(city2);
			arrayCiutats.add(city3);
			arrayCiutats.add(city4);
			arrayCiutats.add(city5);
			arrayCiutats.add(city6);
			
			//Ordenamos el ArrayList y lo mostramos por consola
			Collections.sort(arrayCiutats);
			for(Object o:arrayCiutats) {
				System.out.println(o);
			}
			
			// Cambiamos les vocals"a" por el 4 y guardamos 
			// en una nueva array.
			
			ArrayList<String> ArrayCiutatsModificades = new ArrayList<>();
			
			for(Object o:arrayCiutats) {
				String valor=o.toString().replace('a', '4'); 
				ArrayCiutatsModificades.add(valor);
			}
			System.out.println(ArrayCiutatsModificades);

	}

}
