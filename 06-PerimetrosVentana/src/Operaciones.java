/**
 * 
 * @author Jonathan Valdez Gayosso
 *
 */
public class Operaciones {
	/**
	 * 
	 * @param n1
	 * @return
	 */
	public double perimetroCuadrado(double n1){
		return n1 * 4;
	}
	/**
	 * 
	 * @param n1
	 * @param n2
	 * @return
	 */
	public double perimetroRectangulo(double n1, double n2){
		return 2*(n1 + n2);
	}
	/**
	 * 
	 * @param n1
	 * @return
	 */
	public double ptEquilatero(double n1) {
		return 3 * n1;
	}
	
	/**
	 * 
	 * @param n1
	 * @return
	 */
	public double ptIsoceles(double n1, double n2) {
		return (n1 * 2) + n2;
	}
	
	/**
	 * 
	 * @param n1
	 * @return
	 */
	public double ptEscaleno(double n1, double n2, double n3) {
		return n1 + n2 + n3;
	}
	
	/**
	 * 
	 * @param n1
	 * @return
	 */
	public double perimetroCirculo(double n1) {
		return 2 * Math.PI * n1;
	}

}

