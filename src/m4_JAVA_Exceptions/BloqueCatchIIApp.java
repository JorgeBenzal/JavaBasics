package m4_JAVA_Exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileReader;

public class BloqueCatchIIApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FileReader fr=null;
		try {
			//Si el nombre del fichero no existe lanza el catch
			fr=new FileReader("casa");
			
			//Esta linea no se ejecuta
			System.out.println("No veras este mensaje");
		}catch(FileNotFoundException e) {
			System.out.println("Error E/S: el fichero no existe");
			
		}
		catch(IOException e) {
			System.out.println("Si el fichero no existe, este mensaje no se vera");
		}finally {
			System.out.println("Este mensaje siempre se ejecutara");
		}
		
	}

}
