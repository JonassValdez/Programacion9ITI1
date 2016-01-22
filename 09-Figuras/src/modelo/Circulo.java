package modelo;
/**
 * 
 * @author JonaasS
 *
 */
public class Circulo implements Operaciones{
	/**
	 * 
	 * @param diametro
	 * @return  2 * Math.PI * diametro
	 */
	public static  double perimetro(double diametro) {
		// TODO Auto-generated method stub
		return   2 * Math.PI * diametro;
	}
	/**
	 * 
	 * @param diametro
	 * @return Math.PI * (Math.pow(diametro, 2))
	 */

	public static double area(double diametro) {
		// TODO Auto-generated method stub
		return Math.PI * (Math.pow(diametro, 2));
	}

}
