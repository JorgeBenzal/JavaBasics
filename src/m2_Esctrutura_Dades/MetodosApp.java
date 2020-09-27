package m2_Esctrutura_Dades;

public class MetodosApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int operador1 = 3;
		int operador2 = 5;
		int resultado = sumaNumeros(operador1, operador2);
		System.out.println("El resultado de la suma es " + resultado);
		restaNumeros(operador2, operador1);
		
	}
	
	/*
	 *  Definimos un m�todo fuera del main, indicamos el tipo de dato 
	* y despu�s el nombre del m�todo y por �ltimo los par�metros que
	* utilizar� el m�todo. Estos valores vendr�n dados desde main.
	* 
	* Devuelve un int, por lo que tenemos que poner un return.
	* 
	* Ya tenemos el m�todo pero ahora debemos invocarlo en el main.
	*/
	public static int sumaNumeros (int num1, int num2) {
		
		int resultado=num1+num2;
		return resultado;
	}
	
	public static void restaNumeros (int num1, int num2) {
		
		int resultado=num1-num2;
		System.out.println("El resultado de la resta es " + resultado);
	}

}
