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
public class VentanaEscaleno extends JFrame implements ActionListener {
	
	private JTextField txtN1= new JTextField();
	private JTextField txtN2= new JTextField();
	private JTextField txtN3= new JTextField();
	private JLabel lbN1= new JLabel("Ingresa el valor del lado 1:");
	private JLabel lbN2= new JLabel("Ingresa el valor del lado 2:");
	private JLabel lbN3= new JLabel("Ingresa el valor del lado 3:");
	private JLabel lbResultado= new JLabel("Resultado");
	private JButton btnCalcular= new JButton("Calcular");
	private Container c= getContentPane();

	
	public VentanaEscaleno(){
		super.setTitle("Tri�ngulo Escaleno");
		super.setSize(320,320);
		cargarControles();
	}

	private void cargarControles() {
		
		c.setLayout(null);
		lbN1.setBounds(10,10, 280, 30);
		txtN1.setBounds(10, 40, 280, 30);
		lbN2.setBounds(10,70, 280, 30);
		txtN2.setBounds(10, 100, 280, 30);
		lbN3.setBounds(10,130, 280, 30);
		txtN3.setBounds(10, 160, 280, 30);
		btnCalcular.setBounds(10, 200, 280, 30);		
		lbResultado.setBounds(10,230, 280,30);
		c.add(lbN1);
		c.add(txtN1);
		c.add(lbN2);
		c.add(txtN2);
		c.add(lbN3);
		c.add(txtN3);
		c.add(btnCalcular);
		c.add(lbResultado);
		btnCalcular.addActionListener(this);
		
	}

	public void actionPerformed(ActionEvent arg0) {
		double r = Triangulos.ptEscaleno(Double.parseDouble(txtN1.getText()), Double.parseDouble(txtN2.getText()), Double.parseDouble(txtN3.getText()));
		lbResultado.setText(String.format("El perimetro del tri�ngulo es de: %f", r)); 		
	}

}