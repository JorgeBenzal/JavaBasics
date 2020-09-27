package m2_Esctrutura_Dades;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIIApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> lista=new ArrayList<>();
		
		//M�todo add. a�ade elementos
		lista.add(1);
		lista.add(2);
		lista.add(3);
		
		System.out.println("ADD");
		System.out.println(lista.toString());
		
		//M�todo remove, elimina elementos de nuestra lista mediante indice
		lista.remove(2); // Elimino el ultimo elemento, no el elemento 2
		
		System.out.println("REMOVE");
		System.out.println(lista.toString());
		
		//M�todo size, indica el n�mero de elementos de la lista
		
		System.out.println("SIZE");
		System.out.println(lista.size());
		
		//M�todo get, devolvemos un elemento de un indice
		
		System.out.println("GET");
		System.out.println(lista.get(0));
		
		//M�todo Iterator, util para recorrer un arrayList
		
		System.out.println("ITERATOR");
		Iterator<Integer> it= lista.iterator();
		int num;
		while (it.hasNext()) {
			num = it.next();
			System.out.println(num);
		}
		
		//M�todo indexOf, util para saber la posicion de un elemento
		System.out.println("INDEXOF");
		System.out.println(lista.indexOf(1));
		
		//M�todo Clear, elimina todos los elementos
		lista.clear();
		
		System.out.println("CLEAR");
		System.out.println(lista.toString());
	}

}
