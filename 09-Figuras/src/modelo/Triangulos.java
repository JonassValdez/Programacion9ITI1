package modelo;
/**
 * 
 * @author JonaasS
 *
 */

public class Triangulos implements Operaciones {

	public static double area(double lt1, double lt2) {
		return (lt1 * lt2) / 2;
	}
	/**
	 * 
	 * @param lt1
	 * @return 3*lt1
	 */
	public static double ptEquilatero(double lt1) {
		return 3 * lt1;
	}
	
	/**
	 * 
	 * @param lt1, t2
	 * @return (lt1 * 2) + lt2
	 */
	public static double ptIsoceles(double lt1, double lt2) {
		return (lt1 * 2) + lt2;
	}
	
	/**
	 * 
	 * @param lt1
	 * @return lt1 + lt2 + lt3
	 */
	public static double ptEscaleno(double lt1, double lt2, double lt3) {
		return lt1 + lt2 + lt3;
	}
}
