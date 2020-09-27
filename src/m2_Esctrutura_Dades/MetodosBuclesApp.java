package m2_Esctrutura_Dades;

public class MetodosBuclesApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int operador1 = 3;
		int operador2 = 5;
		
		if(sumaNumeros(operador1, operador2)) {
			System.out.println("El resultado es mayor que 0");
		}else {
			System.out.println("El resultado es menor que 0");
		}
		
	}
	
	public static boolean sumaNumeros(int num1, int num2) {
		
		int resultado = num1 + num2;
		
		if (resultado >= 0) {
			return true;
		}else {
			return false;
		}
	}

}
