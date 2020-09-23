/*
 * FASE 3 −Partint de l’any 1948 heu de fer un bucle for i mostrar 
 * els anys de traspàs fins arriba al vostre any de naixement. 
 * −ATENCIO!Haureu de canviar el tipus de variable de l’any 1948 
 * per poder modificar-la. 
 * −Creeu una variable bool que sera certa si l’any de naixement és 
 * de traspàs o falsa si no ho és.−En cas de que la variable bool sigui 
 * certa, heu de mostrar per consola una frase on ho digui, en cas de ser 
 * falsa mostrareu la frase pertinent. Creeu dues variables string 
 * per guardar les frases
 */

public class Fase3App {

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
		int anytraspas = 1948;
		boolean comparaAny = false;
		String anyTraspasUsuari;
		String anyNormalUsuari;
		//Constante
		int ANYTRASPAS = 1948;
		
		//Bucle for per calcular si hem nascut en un any traspàs.
		
		for(anytraspas=1948;anytraspas <= any;anytraspas+=4) {
			System.out.println(anytraspas);
			if(anytraspas == any) {
				comparaAny = true;
			}
		}
		//Mostrem per console segons si es traspàs o no.
		anyTraspasUsuari = "El meu any de naixement és de traspàs.";
		anyNormalUsuari = "El meu any de naixement no és de traspàs.";
		if(comparaAny == true) {
			System.out.println(anyTraspasUsuari);
		} else {
			System.out.println(anyNormalUsuari);
		}
	}

}
