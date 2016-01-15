import javax.swing.JOptionPane;

/**
 * 
 * @author Jonathan Valdez Gayosso
 *
 */

public class Saludo {
	
	/**
	 * 
	 * @param datos personales
	 */
	public static void main(String[] args) {
		String nombre="Jonathan";
		String edad="24";
		//System.out.print("hola "+ nombre);
		//%s para concatenar en lugar del +
		//System.out.printf("hola: %s", nombre);
		//%s=String imprecion %d=decimal
		JOptionPane.showMessageDialog(null,String.format("Hola: %s tu edad es de %s años", nombre,edad));
	}
}
