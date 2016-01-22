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

public class VentanaPeriTriangulos extends JFrame implements ActionListener{
	

	private JButton btnPerimetro= new JButton("Perimetro");
	private JButton btnArea= new JButton("�rea");
	private Container c= getContentPane();
	public VentanaPeriTriangulos(){
		super.setTitle("Tri�ngulos");
		super.setSize(280, 280);
		cargarControles();
		
	}
	
private void cargarControles() {
		c.setLayout(null);
		btnPerimetro.setBounds(50, 40, 150, 30);
		btnArea.setBounds(50, 80, 150, 30);	
		c.add(btnPerimetro);
		c.add(btnArea);
		btnPerimetro.addActionListener(this);
		btnArea.addActionListener(this);
		
	}
	
	public void actionPerformed(ActionEvent arg0) {
		if(arg0.getSource()==btnPerimetro){
		VentanaTriangulos vtn= new VentanaTriangulos();
		vtn.setVisible(true);
		}
		
		if(arg0.getSource()==btnArea){
			VentanaAreaTriangulos vtn= new VentanaAreaTriangulos();
			vtn.setVisible(true);
			}
	
	
	}
		
	
}
