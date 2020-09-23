/*
 * FASE 1 −Crea tres variables string e inicialitzales amb les dades pertinents 
 * (nom, cognom1, cognom2).−Crea tres variables int e inicialitzales amb les dades pertinents 
 * (dia, mes, any).−Mostra per pantalla les variables string concatenant-les en aquest ordre (cognom1 + cognom2, + nom).
 * −Mostra per pantalla les variables int concatenant-les amb “/” entre cadauna d’elles.
 */

public class Fase2App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Variables
		String nom = "Jordi";
		String cognom1 = "Benzal";
		String cognom2 = "Iñigo";
		int dia = 2;
		int mes = 8;
		int any = 1977;
		int ANYTRASPAS = 1948;
		int quansAnysTraspas;
		
		// Calculem amb aquesta operació quants anys de traspàs
		// hi han fins la data de naixement. Mostrem per consola.	
		
		quansAnysTraspas = (any - ANYTRASPAS)/4;
		
		System.out.println("El total d'anys de traspàs fins a la teva data de neixement son: " + quansAnysTraspas);
		
	}

}
