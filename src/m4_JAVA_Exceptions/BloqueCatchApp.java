package m4_JAVA_Exceptions;

import java.io.IOException;
import java.io.FileReader;

public class BloqueCatchApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			// si el nombre del fichero no existe lanza el catch
			FileReader fr=new FileReader("casa");
			
			//Esta linea no se ejecuta
			System.out.println("No veras este mensaje");
		}catch (IOException e) {
			System.out.println("Error E/S: el fichero no existe");
		}
	}

}
