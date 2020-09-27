package m2_Esctrutura_Dades;

public class ArraysIIApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num[]=rellenarArrayDesde(5);
		imprimirArray(num);
	}
	
	//Metodo para imprimir por consola la lista
	public static void imprimirArray (int lista[]) {
		for(int i=0; i<lista.length;i++) {
			System.out.println(lista[i]);
		}
	}
	
	//Metodo para rellenar la lista
	public static int[] rellenarArrayDesde(int a) {
		int num[]= new int[10];
		for(int i=0; i<num.length;i++) {
			num[i]=a;
			a++;
		}
		return num;
	}

}
