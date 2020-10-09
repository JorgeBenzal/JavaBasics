/*
 * file: M4Fase2App.java
 * Autor: Jordi Benzal Iñigo
 * Date: 05/10/2020
 * Description:Exercici: Amb un bucle for haurem d’omplir els dos arrays anteriorment creats. 
 * 	Afegirem el nom del plat i després el preu.Pots fer us de diccionaris de dades(Java HasMap)
 * 	Un cop plens els dos arrays hauremde mostrar-los i preguntar que es vol per menjar, guardarem 
 * 	la informació en una List fent servir un bucle while. Haurem de preguntar si es vol seguir 
 * 	demanant menjar. Podeu fer servir el sistema (1:Si / 0:No), per tant haureu de crear un altre 
 * 	variable int per guardar la informació.
 */
package m4_EntregaExerciciRestaurant;

import javax.swing.JOptionPane;

import java.util.List;
import java.util.*;


public class M4Fase2App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Declaramos las variables billetes y precio total

		int b5e, b10e, b20e, b50e, b100e, b200e, b500e;
		int preuTotal;

		// Declaramos dos arrays, para el menu y para el precio de cada plato

		String menu[] = new String[10];
		int preu[] = new int[10];

		// Definimos un Hashmap con la información para rellenar las arrays amb metode.
		// Con un bucle rellenamos el array menu anteriormente creado.

		for (int i = 0; i < menu.length; i++) {

			menu[i] = creaHashMenu().get(100 + i);
			preu[i] = creaHashPreu().get(100 + i);

		}
		mostraMenu(menu, preu);
		System.out.println(demanar(menu));

	}

	// METODO para crear HashMap del menu
	public static HashMap<Integer, String> creaHashMenu() {

		HashMap<Integer, String> nombrePlato = new HashMap<Integer, String>();

		nombrePlato.put(100, "Amanida");
		nombrePlato.put(101, "Sopa");
		nombrePlato.put(102, "Paella");
		nombrePlato.put(103, "Bistec");
		nombrePlato.put(104, "Macarrons");
		nombrePlato.put(105, "Pollastre");
		nombrePlato.put(106, "Yogurt");
		nombrePlato.put(107, "Aigua");
		nombrePlato.put(108, "Vi");
		nombrePlato.put(109, "Pa");

		return nombrePlato;
	}

	// METODO para crear HashMap del preu
	public static HashMap<Integer, Integer> creaHashPreu() {

		HashMap<Integer, Integer> preuPlato = new HashMap<Integer, Integer>();
		preuPlato.put(100, 8);
		preuPlato.put(101, 7);
		preuPlato.put(102, 16);
		preuPlato.put(103, 12);
		preuPlato.put(104, 9);
		preuPlato.put(105, 3);
		preuPlato.put(106, 3);
		preuPlato.put(107, 2);
		preuPlato.put(108, 3);
		preuPlato.put(109, 1);

		return preuPlato;
	}

	// METODO para mostrar el menu y el precio por consola
	public static void mostraMenu(String menu[], int preu[]) {

		for (int i = 0; i < menu.length; i++) {
			System.out.println(menu[i] + " : " + String.valueOf(preu[i]) + " eur.");
		}

	}

	// METODO para pedir la comida del menu.
	public static List<String> demanar(String menu[]) {

		List<String> comanda = new ArrayList<>();
		int primerOpcion = 0;
		int segonOpcion = 0;

		// Con el bucle while mantenemos al usuario haciendo el pedido mientras
		// primerOpcion=0.
		String volsDemanar = JOptionPane.showInputDialog(null,
				"Quieres pedir comida del menu, opciones:\n1.-Para confirmar\n2.-Para terminar");
		System.out.println(volsDemanar);
		while (primerOpcion == 0) {
			if (volsDemanar.contentEquals("1")) {
				System.out.println("Introduce el plato que prefieres del Listado anterior.");
				String nomProducte = JOptionPane.showInputDialog("Escriu el nom del plat com en el llistat");

				// Con for comparamos la entrada del usuario con el listado del menu,
				// si coincide el texto los pasamos a List comanda
				for (String Lista : menu) {
					if (Lista.equals(nomProducte)) {
						comanda.add(nomProducte);
					}
				}
				// Por cada entrada se pregunta si seguimos o salimos.
				primerOpcion = JOptionPane.showConfirmDialog(null, "Apuntado\nQuiere continuar?");
				if (primerOpcion == 0) {
					System.out.println("Seguimos");
				} else if (primerOpcion == 1) {
					segonOpcion = JOptionPane.showConfirmDialog(null, "Aceptar comanda\n" + comanda);
					if (segonOpcion == 0) {
						System.out.println("Gracias, pase por caja! y buen provecho");
					} else if (segonOpcion == 1) {
						System.out.println("De acuerdo, vuelva al principio");
						demanar(menu);
					} else {
						primerOpcion = 1;
					}
				} else {
					demanar(menu);
				}

				// Punto de salida si es pulsado el no, con cancelar volvemos a empezar en el
				// metodo.
			} else if (volsDemanar.contentEquals("2")) {
				System.out.println("Gracias por tu visita");
				volsDemanar = "";
				primerOpcion = 1;
			} else {
				System.out.println("Introduce un valor de 1 o 2. Gracias");
				demanar(menu);
			}
		}
		return comanda;

	}
	
}
