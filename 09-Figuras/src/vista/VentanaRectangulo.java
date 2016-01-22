package vista;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import modelo.Rectangulo;
/**
 * 
 * @author JonaasS
 *
 */
public class VentanaRectangulo extends JFrame implements ActionListener {
	
	private JTextField txtN1= new JTextField();
	private JTextField txtN2= new JTextField();
	private JLabel lbN1= new JLabel("Ingresa la base:");
	private JLabel lbN2= new JLabel("Ingresa la altura:");
	private JLabel lbResultado= new JLabel("Resultado");
	private JButton btnPerimetro= new JButton("Perimetro");
	private JButton btnArea= new JButton("Area");
	private Container c= getContentPane();
		
public VentanaRectangulo(){
		super.setTitle("Rectangulo");
		super.setSize(320, 320);
		cargarControles();
	}

	private void cargarControles() {
		
		c.setLayout(null);
		lbN1.setBounds(10,10, 280, 30);
		txtN1.setBounds(10, 40, 280, 30);	
		lbN2.setBounds(10,70, 280, 30);
		txtN2.setBounds(10, 100, 280, 30);
		btnPerimetro.setBounds(10, 150, 280, 30);
		btnArea.setBounds(10, 190, 280, 30);
		lbResultado.setBounds(10,220, 280,30);
		c.add(lbN1);
		c.add(txtN1);
		c.add(lbN2);
		c.add(txtN2);
		c.add(btnPerimetro);
		c.add(btnArea);
		c.add(lbResultado);
		btnPerimetro.addActionListener(this);
		btnArea.addActionListener(this);
	}

	public void actionPerformed(ActionEvent arg0) {
		if(arg0.getSource()==btnPerimetro){
		double r = Rectangulo.perimetro(Double.parseDouble(txtN1.getText()), Double.parseDouble(txtN2.getText()));
		lbResultado.setText(String.format("El perimetro del rectángulo es de: %f", r)); 		
	}
		if(arg0.getSource()==btnArea){
			double r = Rectangulo.area(Double.parseDouble(txtN1.getText()), Double.parseDouble(txtN2.getText()));
			lbResultado.setText(String.format("El área del rectángulo es de: %f", r)); 		
		}
	
	}
}
