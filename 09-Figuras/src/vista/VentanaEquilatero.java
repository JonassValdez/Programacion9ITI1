package vista;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import modelo.Triangulos;
/**
 * 
 * @author JonaasS
 *
 */
public class VentanaEquilatero extends JFrame implements ActionListener{
	
	private JTextField txtN1= new JTextField();
	private JLabel lbN1= new JLabel("Ingresa el valor de un lado:");
	private JLabel lbResultado= new JLabel("Resultado");
	private JButton btnCalcular= new JButton("Calcular");
	private Container c= getContentPane();

	public VentanaEquilatero(){
		super.setTitle("Triángulo Equilatero");
		super.setSize(320, 280);
		cargarControles();
	}

	private void cargarControles() {
		
		c.setLayout(null);
		lbN1.setBounds(10,10, 280, 30);
		txtN1.setBounds(10, 40, 280, 30);
		btnCalcular.setBounds(10, 80, 280, 30);		
		lbResultado.setBounds(10,130, 280,30);
		c.add(lbN1);
		c.add(txtN1);
		c.add(btnCalcular);
		c.add(lbResultado);
		btnCalcular.addActionListener(this);
		
	}

	public void actionPerformed(ActionEvent arg0) {
		double r = Triangulos.ptEquilatero(Double.parseDouble(txtN1.getText()));
		lbResultado.setText(String.format("El perímetro del Triángulo es: %f" ,r)); 		
	}
}
