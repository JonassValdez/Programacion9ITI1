import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 * 
 * @author Jonathan Valdez Gayosso
 *
 */

public class VentanaTriangulo extends JFrame implements ActionListener {
	
	private JTextField txtN1= new JTextField();
	private JTextField txtN2= new JTextField();
	
	private JLabel lbN1= new JLabel("Ingresa el valor de la base:");
	private JLabel lbN2= new JLabel("Ingresa el valor de la altura:");
	
	
	private JLabel lbResultado= new JLabel("Resultado");
	
	private JButton btnCalcular= new JButton("Calcular");
	
	private Container c= getContentPane();
	
	
private Operaciones op = new Operaciones();
	
	
	public VentanaTriangulo(){
		super.setTitle("Tri�ngulo");
		super.setSize(320, 280);
		cargarControles();
	}

	private void cargarControles() {
		
		c.setLayout(null);
		lbN1.setBounds(10,10, 280, 30);
		txtN1.setBounds(10, 40, 280, 30);
		
		lbN2.setBounds(10,70, 280, 30);
		txtN2.setBounds(10, 100, 280, 30);

		btnCalcular.setBounds(10, 150, 280, 30);
		
		lbResultado.setBounds(10,180, 280,30);
		c.add(lbN1);
		c.add(txtN1);
		c.add(lbN2);
		c.add(txtN2);
		c.add(btnCalcular);
		c.add(lbResultado);
		btnCalcular.addActionListener(this);
		
	}

	public void actionPerformed(ActionEvent arg0) {
		double r = op.triangulo(Double.parseDouble(txtN1.getText()), Double.parseDouble(txtN2.getText()));
		lbResultado.setText(String.format("El �rea del tri�ngulo es de: %f", r)); 		
	}

}
