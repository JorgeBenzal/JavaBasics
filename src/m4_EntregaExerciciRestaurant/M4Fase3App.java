/*
 * file: M4Fase3App.java
 * Autor: Jordi Benzal Iñigo
 * Date: 09/10/2020
 * Description:Exercici:
 */
package m4_EntregaExerciciRestaurant;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.JOptionPane;

public class M4Fase3App {

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
		try {
		mostraMenu(menu, preu);
		System.out.println(demanar(menu, preu));
		//preu[20] = 10;
		}catch ( Exception e) {
			
			controlFallos(e);
		}

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

//METODO para mostrar el menu y el precio por consola
	public static void mostraMenu(String menu[], int preu[]) {

		for (int i = 0; i < menu.length; i++) {
			System.out.println(menu[i] + " : " + String.valueOf(preu[i]) + " eur.");
		}
		

	}

//METODO para pedir la comida del menu.
	public static List<String> demanar(String menu[], int preu[]) {

		List<String> comanda = new ArrayList<>();
		int primerOpcion = 0;
		int segonOpcion = 0;
		int preuTotal = 0;
		boolean exist = false;

		// Con el bucle while mantenemos al usuario haciendo el pedido mientras
		// primerOpcion=0.

		String volsDemanar = JOptionPane
				.showInputDialog("Quieres pedir comida del menu, opciones:\n1.-Para confirmar\n2.-Para terminar");
		while (primerOpcion == 0) {
			if (volsDemanar.contentEquals("1")) {
				System.out.println("Introduce el plato que prefieres del Listado anterior.");
				mostraMenu(menu, preu);
				String nomProducte = JOptionPane.showInputDialog("Escriu el nom del plat com en el llistat");

				// Con for comparamos la entrada del usuario con el listado del menu,
				// si coincide el texto los pasamos a List comanda
				// Con exist determinamos si el plato esta en la lista para emitir un pane.
				exist = false;
				for (String Lista : menu) {
					if (Lista.equals(nomProducte)) {
						comanda.add(nomProducte);
						exist = true;
					}
				}
				// Si el plato no existe en el menu lo emite por consola y un pane.
				if (exist == false) {
					System.out.println("El plato no esta en el menu!");
					JOptionPane.showMessageDialog(null, "Introduir un plat del llistat, gracies.");
				}

				// Por cada vez que el cliente escoge un plato se pregunta si seguimos o
				// salimos.
				primerOpcion = JOptionPane.showConfirmDialog(null, "Apuntado\nQuiere continuar?");
				if (primerOpcion == 0) {
					// JOptionPane.showMessageDialog(null, "Introduzca el siguiente plato");
					System.out.println("Seguimos");
					volsDemanar = "1";
				} else if (primerOpcion == 1) {
					segonOpcion = JOptionPane.showConfirmDialog(null, "Aceptar comanda\n" + comanda);
					// Opcion de ir a calcular el menu
					// Aqui si la opcion es 0 saltamos al metodo quinPreu.
					if (segonOpcion == 0) {
						System.out.println("Gracias, pase por caja! y buen provecho");
						preuTotal = quinPreu(comanda, menu, preu);
						
					} else if (segonOpcion == 1) {
						System.out.println("De acuerdo, vuelva al principio");
						JOptionPane.showMessageDialog(null, "De acuerdo, vuelva al principio");
						comanda.clear(); // Vaciamos la comanda para empezar de nuevo.
						primerOpcion = 0;
					} else {
						primerOpcion = 1;
					}
				} else {
					primerOpcion = 1;
				}

				// Punto de salida si es pulsado el no o cancelar volvemos a empezar en el
				// metodo volsDemanar .
			} else if (volsDemanar.contains("2")) {
				System.out.println("Gracias por tu visita");
				// JOptionPane.showMessageDialog(null,"Gracias por tu visita.");
				System.out.println(volsDemanar);
				primerOpcion = 1;

			} else {
				System.out.println("Introduce un valor de 1 o 2. Gracias");
				JOptionPane.showMessageDialog(null, "Introduce un valor de 1 o 2. Gracias");
				volsDemanar = "1";
			}
		}
		return comanda;

	}

//METODO para calcular el precio de la comanda
	public static  int quinPreu(List<String> plato, String menu[], int preu[]) {
		int compte[] = new int[10];
		int preuTotal = 0;

		for (int i = 0; i < menu.length; i++) {
			
			//Almacenamos en o si el valor de la lista aceptada se encuentra en el menu
			//para asi obtener en la variable i la pos del array de preu y sumamos valores.
			Boolean o = plato.contains(menu[i]);
			if (o == true) {
				compte[i] = preu[i];
				preuTotal += preu[i];
				System.out.println(menu[i] + " = " + preu[i] + " euros");
			}
		}
		System.out.println("El preu total: " + preuTotal + " euros");	
		JOptionPane.showMessageDialog(null, "El precio del menu es:\n" + preuTotal + " euros.");
		System.out.println("El precio del menu es: " + preuTotal);
	
	return preuTotal;
	
	}
//METODO Exception 
	public static void controlFallos(Throwable e) {
		
		System.out.println("Control de Errores:");
		
		e.printStackTrace();
		
	}
}
