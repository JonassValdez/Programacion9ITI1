package vista;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
/**
 * 
 * @author JonaasS
 *
 */
public class VentanaTriangulos extends JFrame implements ActionListener{
	

	private JButton btnEquilatero= new JButton("Equilatero");
	private JButton btnIsoceles= new JButton("Isoceles");
	private JButton btnEscaleno= new JButton("Escaleno");
	private Container c= getContentPane();
	public VentanaTriangulos(){
	
		super.setTitle("Tipos de Triángulos");
		super.setSize(280, 280);
		cargarControles();
		
	}
		
private void cargarControles() {
		c.setLayout(null);
		btnEquilatero.setBounds(50, 40, 150, 30);
		btnIsoceles.setBounds(50, 80, 150, 30);	
		btnEscaleno.setBounds(50, 120, 150, 30);	
		c.add(btnEquilatero);
		c.add(btnIsoceles);
		c.add(btnEscaleno);
		btnEquilatero.addActionListener(this);
		btnIsoceles.addActionListener(this);
		btnEscaleno.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent arg0) {
		if(arg0.getSource()==btnEquilatero){
		VentanaEquilatero vtn= new VentanaEquilatero();
		vtn.setVisible(true);
		}
		
		if(arg0.getSource()==btnIsoceles){
			VentanaIsoceles vtn= new VentanaIsoceles();
			vtn.setVisible(true);
			}
		if(arg0.getSource()==btnEscaleno){
			VentanaEscaleno vtn= new VentanaEscaleno();
			vtn.setVisible(true);
			}
	
	
	}
		
	
}
