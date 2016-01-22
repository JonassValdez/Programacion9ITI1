package vista;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import modelo.Division;
import modelo.Multiplicacion;
import modelo.Resta;
import modelo.Suma;
/**
 * 
 * @author JonaasS
 *
 */


public class VentanaOperacion extends JFrame implements ActionListener{
	private JTextField txtN1= new JTextField();
	private JTextField txtN2= new JTextField();
	private JLabel lbN1= new JLabel("numero 1");
	private JLabel lbN2= new JLabel("numero 2");
	private JLabel lbResultado= new JLabel("Resultado");
	private JButton btnSuma= new JButton("+");
	private JButton btnResta= new JButton("-");
	private JButton btnMultiplicacion= new JButton("x");
	private JButton btnDivision= new JButton("/");
	private Container c= getContentPane();
	private Suma mas = new Suma();
	private Resta menos = new Resta();
	private Multiplicacion por = new Multiplicacion();
	private Division entre= new Division();
	
	
	public VentanaOperacion(){
		super.setTitle("Operaciones");
		super.setSize(280, 430);
		super.setDefaultCloseOperation(EXIT_ON_CLOSE);
		cargarControles();
	}

	private void cargarControles() {
		c.setLayout(null);
		lbN1.setBounds(20,10, 210, 30);
		txtN1.setBounds(20, 40, 210, 30);
		lbN2.setBounds(20,80, 210, 30);
		txtN2.setBounds(20, 120, 210, 30);
		btnSuma.setBounds(20, 170, 80, 30);
		btnResta.setBounds(150, 170, 80, 30);
		btnMultiplicacion.setBounds(20, 220, 80, 30);
		btnDivision.setBounds(150, 220,80, 30);
		lbResultado.setBounds(20,260, 280,30);
		c.add(lbN1);
		c.add(txtN1);
		c.add(lbN2);
		c.add(txtN2);
		c.add(btnSuma);
		c.add(btnResta);
		c.add(btnMultiplicacion);
		c.add(btnDivision);
		c.add(lbResultado);
		btnSuma.addActionListener(this);
		btnResta.addActionListener(this);
		btnMultiplicacion.addActionListener(this);
		btnDivision.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if(arg0.getSource()==btnSuma){
			int resSuma = mas.operaciones(Integer.parseInt(txtN1.getText()),Integer.parseInt(txtN2.getText()));
			lbResultado.setText(String.format("Resultado: %s + %s = %d", txtN1.getText(), txtN2.getText(), resSuma)); 
			}
		if(arg0.getSource()==btnResta){
			int resResta = menos.operaciones(Integer.parseInt(txtN1.getText()),Integer.parseInt(txtN2.getText()));
			lbResultado.setText(String.format("Resultado: %s - %s = %d", txtN1.getText(), txtN2.getText(), resResta));
			
		}
		if(arg0.getSource()==btnMultiplicacion){
			int resMultiplicacion = por.operaciones(Integer.parseInt(txtN1.getText()),Integer.parseInt(txtN2.getText()));
			lbResultado.setText(String.format("Resultado: %s * %s = %d", txtN1.getText(), txtN2.getText(), resMultiplicacion));
			
		}
		if(arg0.getSource()==btnDivision){
			double resDivision = entre.oper(Double.parseDouble(txtN1.getText()),Double.parseDouble(txtN2.getText()));
			lbResultado.setText(String.format("Resultado: %s / %s = %f", txtN1.getText(), txtN2.getText(), resDivision));
			
		}
	}
}
