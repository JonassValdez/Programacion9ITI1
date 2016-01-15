
import javax.swing.JOptionPane;

/**
 * 
 * @author Jonathan Valdez Gayosso
 *
 */

public class AppDatos {

	/**
	 * 
	 * @param Nombre, edad, telefono, grupo, carrera, calle, cp, estado, municipio, correo
	 */
	public static void main(String[] args) {
		Alumno al = new Alumno("Jonathan","24","5512345678","9ITI1","ITI","31","55450","Mexico","Ecatepec","j_valdezg@hotmail.com");
		JOptionPane.showMessageDialog(null, String.format("Hola: %s\n Edad: %s años \n Telefono: %s\nGrupo: %s\nCarrera: %s\nCalle: %s\n Codigo Postal: %s\nEstado: %s\n Municipio: %s\nCorreo: %s", al.getNombre(), al.getEdad(),al.getTelefono(), al.getGrupo(), al.getCarrera(), al.getCalle(), al.getCp(), al.getEstado(), al.getMunicipo(),al.getCorreo()));

	}

}
