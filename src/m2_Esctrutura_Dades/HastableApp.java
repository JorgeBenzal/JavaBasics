package m2_Esctrutura_Dades;
import java.util.Hashtable;
import java.util.Enumeration;

public class HastableApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hashtable<String, String> contenedor=new Hashtable<String, String>();
		contenedor.put("101", "Harry");
		contenedor.put("102", "Carla");
		contenedor.put("103", "Jordi");
		contenedor.put("104", "Pol");
		contenedor.put("105", "Jan");
		
		System.out.println(contenedor.get("105"));
		System.out.println(contenedor.get("102"));
		
		Enumeration<String> enumeration = contenedor.elements();
		while (enumeration.hasMoreElements()) {
			System.out.println("hashtable valores: " +enumeration.nextElement());
		}
		
		Enumeration<String>	llaves = contenedor.keys();
		while (llaves.hasMoreElements()) {
			System.out.println("hashtable llaves: " + llaves.nextElement());
		}
	}

}
