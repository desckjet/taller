package mascotas.ui;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.eclipse.wb.swing.FocusTraversalOnArray;

public class MenuPrincipal extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public MenuPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Menú principal.");
		setBounds(100, 100, 389, 234);
		contentPane = new JPanel();
		contentPane.setForeground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton btnGestionarCliente = new JButton("GESTIONAR CLIENTE");
		btnGestionarCliente.setForeground(new Color(0, 0, 0));
		btnGestionarCliente.setFont(new Font("Comic Sans MS", Font.BOLD, 13));
		btnGestionarCliente.setToolTipText("Opcion para gestionar un cliente");
		btnGestionarCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new GestionDeClientes().setVisible(true);
				dispose();
			}
		});
		
		JButton btnGestionInventario = new JButton("GESTIÓN DE INVENTARIO");
		btnGestionInventario.setForeground(new Color(0, 0, 0));
		btnGestionInventario.setFont(new Font("Comic Sans MS", Font.BOLD, 13));
		btnGestionInventario.setToolTipText("Opcion para gestionar el inventario");
		btnGestionInventario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new GestionDeInventario().setVisible(true);
				dispose();
			}
		});
		
		JButton btnGestionReferencia = new JButton("GESTIÓN RED DE REFERENCIA");
		btnGestionReferencia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new GestionDeReferencia().setVisible(true);
				dispose();
			}
		});
		btnGestionReferencia.setFont(new Font("Comic Sans MS", Font.BOLD, 13));
		contentPane.setLayout(new GridLayout(0, 1, 0, 0));
		contentPane.add(btnGestionInventario);
		contentPane.add(btnGestionReferencia);
		contentPane.add(btnGestionarCliente);
		contentPane.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{btnGestionarCliente, btnGestionInventario, btnGestionReferencia}));
	}
}
