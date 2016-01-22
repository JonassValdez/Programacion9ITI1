package modelo;
/**
 * 
 * @author JonaasS
 *
 */

public class Rectangulo implements Operaciones{
	/**
	 * 
	 * @param base
	 * @param altura
	 * @return 2*(base+altura)
	 */
	public  static double perimetro(double base, double altura) {
		// TODO Auto-generated method stub
		return 2*(base+altura);
	}
	/**
	 * 
	 * @param base
	 * @param altura
	 * @return base*altura
	 */

	public static double area(double base, double altura) {
		// TODO Auto-generated method stub
		return base*altura;
	}

}
