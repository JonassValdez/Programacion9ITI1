/**
 * 
 * @author Jonathan Valdez Gayosso
 *
 */
public class Operaciones {
	/**
	 * 
	 * @param n1
	 * @return n1 * n1
	 */
	public double cuadrado(double n1) {
		return n1 * n1;
	}
	
	/**
	 * 
	 * @param n1
	 * @param n2
	 * @return n1 * n2
	 */
	public double rectangulo(double n1, double n2) {
		return n1 * n2;
	}
	
	/**
	 * 
	 * @param n1
	 * @param n2
	 * @return (n1 * n2) / 2
	 */
	public double triangulo(double n1, double n2) {
		return (n1 * n2) / 2;
	}
	
	/**
	 * 
	 * @param n1
	 * @return Math.PI * (radio * radio)
	 */
	public double circulo(double n1) {
		double radio = n1*n1 ;
		return Math.PI * radio;
	}
	
}