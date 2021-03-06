package mascotas.ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import mascotas.Mainn;
import mascotas.centralMascota;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Window.Type;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class BuscarMascota extends JFrame {

	private JPanel contentPane;

	/**
	 * Creates new form BuscarMascota
	 */
	private centralMascota mascotas;
	public BuscarMascota(centralMascota mascotas) {
		this.mascotas = mascotas;
		setTitle("Buscar mascota.");
		setType(Type.POPUP);
		initComponents();
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jLabel1 = new javax.swing.JLabel();
		txtIdentificacionMascotaBuscar = new javax.swing.JTextField();
		txtIdentificacionMascotaBuscar.addKeyListener(new KeyAdapter() {

//		Validación ingreso de texto.
			public void keyTyped(KeyEvent e) {
				if (!Character.isDigit(e.getKeyChar())) {
        			e.consume();
                }
                return;
			}
		});
		btnBuscarMascota = new javax.swing.JButton();
		btnBuscarMascota.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(! txtIdentificacionMascotaBuscar.getText().isEmpty()) {
					if (BuscarMascota.this.mascotas.buscarMascota(Integer.valueOf(txtIdentificacionMascotaBuscar.getText())) != null) {
						JOptionPane.showMessageDialog(null, "La mascota si existe");
					} else {
						JOptionPane.showMessageDialog(null, "La mascota no existe");
					}
					dispose();
					GestionDeMascotas vista = new GestionDeMascotas(mascotas);
					vista.setVisible(true);
				} else {
					JOptionPane.showMessageDialog(null, "ingrese la identificacion de la mascota" , "Advertencia", JOptionPane.WARNING_MESSAGE);
				}
				
			}
		});
		btnCancelarBuscarMascota = new javax.swing.JButton();
		btnCancelarBuscarMascota.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GestionDeMascotas vista = new GestionDeMascotas(mascotas);
				vista.setVisible(true);
			}
		});

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
		jLabel1.setText("Identificación de la mascota:");

		btnBuscarMascota.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
		btnBuscarMascota.setText("Buscar");

		btnCancelarBuscarMascota.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
		btnCancelarBuscarMascota.setText("Cancelar");

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addGap(17, 17, 17)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(txtIdentificacionMascotaBuscar, javax.swing.GroupLayout.PREFERRED_SIZE,
										356, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 350,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addContainerGap(27, Short.MAX_VALUE))
				.addGroup(layout.createSequentialGroup().addGap(33, 33, 33)
						.addComponent(btnCancelarBuscarMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 107,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnBuscarMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 107,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(39, 39, 39)));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addGap(25, 25, 25)
						.addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(18, 18, 18)
						.addComponent(txtIdentificacionMascotaBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 46,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(btnCancelarBuscarMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 46,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(btnBuscarMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 46,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addContainerGap(27, Short.MAX_VALUE)));

		pack();
	}// </editor-fold>

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		// <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
		// (optional) ">
		/*
		 * If Nimbus (introduced in Java SE 6) is not available, stay with the default
		 * look and feel. For details see
		 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(BuscarMascota.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(BuscarMascota.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(BuscarMascota.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(BuscarMascota.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		}
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new BuscarMascota(null).setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify
	private javax.swing.JButton btnBuscarMascota;
	private javax.swing.JButton btnCancelarBuscarMascota;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JTextField txtIdentificacionMascotaBuscar;
	// End of variables declaration
}
