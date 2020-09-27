package m2_EntregaExercicis;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class M2Fase4App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

					
		//Pedimos el nombre y apellido por input y lo pasamos a una array
		String nombre = JOptionPane.showInputDialog("Introduce tu nombre, por favor");
		char[] nomUser = nombre.toCharArray();
				
		String apellido = JOptionPane.showInputDialog("Introduce tu apellido, por favor");
		char[] cognUser = apellido.toCharArray();
				
		//Declaramos una Lista a partir de una array del nombre y el apellido

		ArrayList<Character> nom=new ArrayList<>();
				
		ArrayList<Character> cognom=new ArrayList<>();
		
		ArrayList<Character> fullName=new ArrayList<>();
				
		// Bucle para introducir los datos a la List del nombre.
				
			for(int i=0;i<nomUser.length;i++) {
				nom.add(nomUser[i]);
			}
		// Bucle para introducir los datos a la List del apellido.
			
			for(int i=0;i<cognUser.length;i++) {
				cognom.add(cognUser[i]);
				//fullName.addAll(i,cognom);
			}							
				
		// Copiamos a la List fullName el contenido de nom, un espacio y cognom
			
			fullName.addAll(nom);
			int x = nom.size();
			char s = ' ';
			fullName.add(x,s);
			fullName.addAll(cognom);
			
		// Mostramos por consola las tres List pasadas a mayus.
			
			System.out.println(nom.toString().toUpperCase());
			System.out.println(cognom.toString().toUpperCase());
			System.out.println(fullName.toString().toUpperCase());
		
	}

}
