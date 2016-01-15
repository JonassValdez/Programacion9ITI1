/**
 * 
 * @author Jonathan Valdez Gayosso
 *
 */

public class Alumno {

	private String nombre;
	private String edad;
	private String telefono;
	private String grupo;
	private String carrera;
	private String calle;
	private String cp;
	private String estado;
	private String municipo;
	private String correo;
	
	public Alumno(){}
	
	/**
	 * 
	 * @param nombre
	 * @param edad
	 * @param telefono
	 * @param calle
	 * @param colonia
	 * @param municipio
	 * @param cp
	 * @param estado
	 * @param correo
	 * @param apellidos
	 */
	
	public Alumno(String nombre, String edad, String telefono, String grupo, String carrera, String calle,
			String cp, String estado, String municipio, String correo) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.telefono = telefono;
		this.grupo = grupo;
		this.carrera = carrera;
		this.calle = calle;
		this.cp = cp;
		this.estado = estado;
		this.municipo =municipio;
		this.correo = correo;
	}
/**
 * 
 * @return nombre
 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * 
	 * @return edad
	 */
	public String getEdad() {
		return edad;
	}
	/**
	 * 
	 * @param edad
	 */
	public void setEdad(String edad) {
		this.edad = edad;
	}
	/**
	 * 
	 * @return telefono
	 */
	public String getTelefono() {
		return telefono;
	}
	/**
	 * 
	 * @param telefono
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	/**
	 * 
	 * @return grupo
	 */
	public String getGrupo() {
		return grupo;
	}
	/**
	 * 
	 * @param grupo
	 */
	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}
	/**
	 * 
	 * @return carrera
	 */
	public String getCarrera() {
		return carrera;
	}
	/**
	 * 
	 * @param carrera
	 */
	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}
	/**
	 * 
	 * @return calle
	 */
	public String getCalle() {
		return calle;
	}
	/**
	 * 
	 * @param calle
	 */
	public void setCalle(String calle) {
		this.calle = calle;
	}
	/**
	 * 
	 * @return cp
	 */
	public String getCp() {
		return cp;
	}
	/**
	 * 
	 * @param cp
	 */
	public void setCp(String cp) {
		this.cp = cp;
	}
	/**
	 * 
	 * @return estado
	 */
	public String getEstado() {
		return estado;
	}
	/**
	 * 
	 * @param estado
	 */
	public void setEstado(String estado) {
		this.estado = estado;
	}
	/**
	 * 
	 * @return municipio
	 */
	public String getMunicipo() {
		return municipo;
	}
	/**
	 * 
	 * @param municipo
	 */
	public void setMunicipo(String municipo) {
		this.municipo = municipo;
	}
	/**
	 * 
	 * @return correo
	 */
	public String getCorreo() {
		return correo;
	}
	/**
	 * 
	 * @param correo
	 */
	public void setCorreo(String correo) {
		this.correo = correo;
	}

}
