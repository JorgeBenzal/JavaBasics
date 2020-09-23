/*
 * FASE 1 −Crea tres variables string e inicialitzales amb les dades pertinents 
 * (nom, cognom1, cognom2).−Crea tres variables int e inicialitzales amb les dades pertinents(dia, mes, any).
 * −Mostra per pantalla les variables string concatenant-les en aquest ordre
 *  (cognom1 + cognom2, + nom).−Mostra per pantalla les variables int concatenant-les amb “/” entre cadauna d’elles.
 */
public class Fase1App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Variables
		String nom = "Jordi";
		String cognom1 = "Benzal";
		String cognom2 = "Iñigo";
		int dia = 2;
		int mes = 8;
		int any = 1977;
		
		//Generem sortida per consola de les dades.
		System.out.println(cognom1 + " " + cognom2 +","+ nom);
		System.out.println(dia + "/" + mes + "/" + any);
	}
}
