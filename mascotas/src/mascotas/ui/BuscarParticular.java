package mascotas.ui;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import mascotas.Establecimiento;
import mascotas.Lienzo;
import mascotas.Mainn;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Vector;
import java.awt.event.ActionEvent;

public class BuscarParticular extends JFrame{
	private JTextField txtEstablecimiento;
	public BuscarParticular() {
		getContentPane().setLayout(null);
		
		setSize(300, 300);
		
		JLabel lblNombreDelEstablecimiento = new JLabel("Nombre del establecimiento");
		lblNombreDelEstablecimiento.setBounds(24, 11, 140, 14);
		getContentPane().add(lblNombreDelEstablecimiento);
		
		txtEstablecimiento = new JTextField();
		txtEstablecimiento.setBounds(24, 36, 140, 20);
		getContentPane().add(txtEstablecimiento);
		txtEstablecimiento.setColumns(10);
		
		JLabel lblMost = new JLabel("");
		lblMost.setBounds(81, 101, 46, 14);
		getContentPane().add(lblMost);
		
		JButton btnBuscarParticular = new JButton("Buscar");
		btnBuscarParticular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblMost.setText("");
				Vector<Establecimiento> vectorParticular = new Vector<>();
				vectorParticular = Mainn.lien.buscarParticular(txtEstablecimiento.getText(), Lienzo.vectorNodos, Lienzo.vectorEnlaces);
				for(int i = 0; i < vectorParticular.size(); i++) {
					lblMost.setText(lblMost.getText() + "-" + vectorParticular.get(i).getNombre());
				}
			}
		});
		btnBuscarParticular.setBounds(46, 67, 89, 23);
		getContentPane().add(btnBuscarParticular);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
