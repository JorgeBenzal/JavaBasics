package m2_EntregaExercicis;
import java.util.ArrayList;

import javax.swing.JOptionPane;
public class M2Fase2App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Variable para seleccionar cuando un carácter es vocal o no.
		boolean ser = false;
		
		//Declaramos y iniciamos dos arrays de carácteres
		//char [] nomUser = {'j','o','r','d','i'};
		char [] vocales = {'a','e','i','o','u'};
		char [] numeros = {'0','1','2','3','4','5','6','7','8','9'};
		
		//Pedimos el nombre por input y lo pasamos a una array
		String nombre = JOptionPane.showInputDialog("Introduce tu nombre, por favor");
		char[] nomUser = nombre.toCharArray();
		
		//Declaramos una Lista a partir de una array

		ArrayList<Character> nom=new ArrayList<>();
		
		// Bucle para introducir los datos a la List y comparar 
		// con la array de vocales.
		for(int i=0;i<nomUser.length;i++) {
			nom.add(nomUser[i]);
			for(int j=0;j<vocales.length;j++) {
				if(nomUser[i] == vocales[j]) {
					System.out.println(nom.get(i)+":VOCAL");
					ser = true;
				}
			}
			//Bucle para comparar la List con numeros
			for(int n=0;n<numeros.length;n++) {
				if(nomUser[i] == numeros[n]) {
					System.out.println(nom.get(n)+":Els noms de persones no contenen números!");
					ser=true;
				}
			}
			//Es mostra si es una consonant.
			if(!ser) {
				System.out.println(nom.get(i)+":CONSONANT");
			}
			ser=false;
		}
		
		
		
	}

}
