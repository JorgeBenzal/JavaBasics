/*
 * FASE 4 −Creeu una variable on juntareu el nom i els cognoms 
 * (tot en una variable) i un altre on juntareu la data de naixement 
 * separada per “/” (tot en una variable). Mostreu per consola les 
 * variables del nom complet, la data de naixement i si l’any de 
 * naixement es de traspàs o no.
 */
public class Fase4App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Variables
		String nom = "Jordi";
		String cognom1 = "Benzal";
		String cognom2 = "Iñigo";
		int dia = 2;
		int mes = 8;
		int any = 1977;
		int quansAnysTraspas; // Variable per calcular la suma dels anys traspàs.
		int anytraspas = 1948; //Variable per el bucle for.
		boolean comparaAny = false;
		String anyTraspasUsuari;
		String anyNormalUsuari;
		String nomComplet;
		String anyComplet;
		// Constante
		int ANYTRASPAS = 1948; 
		
		
		//Bucle for per calcular si hem nascut en un any traspàs
		for(anytraspas=1948;anytraspas <= any;anytraspas+=4) {
			if(anytraspas == any) {
				comparaAny = true;
			}
		}
		anyTraspasUsuari = "El meu any de naixement és de traspàs.";
		anyNormalUsuari = "El meu any de naixement no és de traspàs.";
		
		nomComplet = nom +" "+ cognom1 +" "+ cognom2;
		anyComplet = dia +"/"+ mes +"/"+ any +".";
		
		System.out.println("El meu no és " + nomComplet);
		System.out.println("Vaig néixer el " + anyComplet );
		
		if(comparaAny == true) {
			System.out.println(anyTraspasUsuari);
		} else {
			System.out.println(anyNormalUsuari);
		}
			
	}

}
