import javax.swing.JOptionPane;
public class Fase2App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ANYTRASPAS = 1948;
		int quansAnysTraspas;
		
		String anyNeixement = JOptionPane.showInputDialog("Introdueixi la seva edat:");
		
		quansAnysTraspas = (Integer.parseInt(anyNeixement) - ANYTRASPAS)/4;
		
		System.out.println("El total d'anys de traspàs fins a la teva data de neixement son: " + quansAnysTraspas);
	}

}
