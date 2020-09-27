package m2_Esctrutura_Dades;
import java.util.ArrayList;


public class ArrayListApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> lista=new ArrayList<>();
		lista.add("Elemento1");
		lista.add("Elemento2");
		lista.add("Elemento3");
		lista.add("Elemento4");
		
		
		for(Object o:lista) {
			System.out.println(o);
			System.out.println("El indice es: " + lista.indexOf(o));		
		}
		System.out.println("Numero de elementos: "+ lista.size());
		System.out.println("Està vacia?: "+ lista.isEmpty());
	}

}
