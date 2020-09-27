package m2_Esctrutura_Dades;
import java.util.*;
public class EjerHashMapApp {
	
	public static void main(String[] args) {
		
		HashMap<String, Empleado> personal = new HashMap<String, Empleado>();
		
		personal.put("145", new Empleado("Jordi"));
		personal.put("146", new Empleado("Pepe"));
		personal.put("147", new Empleado("Pedro"));
		personal.put("148", new Empleado("Maria"));
		
		System.out.println(personal);
		
		personal.remove("147");
		
		System.out.println(personal);
		
		System.out.println(personal.get("148"));
		System.out.println(personal.entrySet());
		
		for(Map.Entry<String, Empleado> entrada: personal.entrySet()) {
			
			String clave=entrada.getKey();
			Empleado valor=entrada.getValue();
			System.out.println("Clave=" + clave + ", Valor=" + valor);
		}
		
	}
}

class Empleado {
	
	public Empleado(String n) {
		
		nombre=n;
		
		sueldo=2000;
	}
	
	public String toString() {
		
		return "[Nombre=" + nombre + ", sueldo=" + sueldo + "]";
	}
	
	
	private String nombre;
	
	private double sueldo;
}
