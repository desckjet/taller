package mascotas.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import mascotas.Lienzo;
import mascotas.Mainn;

public class BuscarEstablecimiento extends JFrame {
	private JTextField textFieldBuscar;
	public BuscarEstablecimiento() {
		super("Buscar");
		getContentPane().setLayout(null);
		
		setSize(240, 170);
		textFieldBuscar = new JTextField();
		textFieldBuscar.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldBuscar.setBounds(26, 50, 172, 20);
		getContentPane().add(textFieldBuscar);
		textFieldBuscar.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Ingrese nombre del establecimiento");
		lblNewLabel.setBounds(26, 25, 172, 14);
		getContentPane().add(lblNewLabel);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Mainn.lien.buscarEstablecimiento(textFieldBuscar.getText(), Lienzo.vectorNodos)) {
					JOptionPane.showMessageDialog(null, "El establecimiento existe");
				} else {
					JOptionPane.showMessageDialog(null, "El establecimiento no existe");
				}
			}
		});
		btnBuscar.setBounds(69, 81, 89, 23);
		getContentPane().add(btnBuscar);
	}
}
