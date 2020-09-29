/*
 * file: M3Fase1App.java
 * Autor: Jordi Benzal Iñigo
 * Date: 28/09/2020
 * Description:Exercici:L’exercici consisteix en mostrar 
 * per consola diferents noms de ciutats partintd’un array 
 * i modificar els noms canviant lletres.
 */

package m3_Exercici_NomCiutats;
import java.util.*;

public class M3Fase1App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declaro 6 variables.
		String city1, city2, city3, city4, city5, city6;
		
		//Genero un Scanner para poder regorger informacion del usario
		
		Scanner introduir=new Scanner(System.in);

		
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
			
		introduir.close();
		
		// Mostramos los valores de las variables por consola
			System.out.println(city1);
			System.out.println(city2);
			System.out.println(city3);
			System.out.println(city4);
			System.out.println(city5);
			System.out.println(city6);
					
	}

}
