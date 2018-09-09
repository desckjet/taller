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

public class EliminarMascota extends JFrame {

	private JPanel contentPane;

	 /**
     * Creates new form EliminarMascota
     */
	private centralMascota mascotas;
    public EliminarMascota(centralMascota mascotas) {
    	this.mascotas = mascotas;
	 	setTitle("ELIMINAR MASCOTA");
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

        txtIdentificacionMascotaEliminar = new javax.swing.JTextField();
        txtIdentificacionMascotaEliminar.addKeyListener(new KeyAdapter() {

//      Validación ingreso de texto
        	public void keyTyped(KeyEvent e) {
        		if (!Character.isDigit(e.getKeyChar())) {
        			e.consume();
                }
                return;
        	}
        });
        btnEliminarMascota = new javax.swing.JButton();
        btnEliminarMascota.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		if(! txtIdentificacionMascotaEliminar.getText().isEmpty()) {
        			if(mascotas.eliminarMascota(Integer.valueOf(txtIdentificacionMascotaEliminar.getText())) != false) {
        				JOptionPane.showMessageDialog(null, "Se ha eliminado exitosamente");
            			new GestionDeMascotas(mascotas).setVisible(true);
            			EliminarMascota.this.dispose();
        			} else {
        				JOptionPane.showMessageDialog(null, "la mascota ingresada no existe" , "Advertencia", JOptionPane.WARNING_MESSAGE);
        			}
        			
        		} else {
        			JOptionPane.showMessageDialog(null, "ingrese la identificacion de la mascota", "Advertencia", JOptionPane.WARNING_MESSAGE);
        		}
        	}
        });
        btnCancelarEliminarMascota = new javax.swing.JButton();
        btnCancelarEliminarMascota.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		new GestionDeMascotas(mascotas).setVisible(true);
        		EliminarMascota.this.dispose();
        	}
        });
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnEliminarMascota.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        btnEliminarMascota.setText("Eliminar");

        btnCancelarEliminarMascota.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        btnCancelarEliminarMascota.setText("Cancelar");

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel1.setText("Identificación de la mascota a eliminar:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(btnCancelarEliminarMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addComponent(btnEliminarMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtIdentificacionMascotaEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtIdentificacionMascotaEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelarEliminarMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminarMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>                        

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EliminarMascota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EliminarMascota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EliminarMascota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EliminarMascota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EliminarMascota(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton btnCancelarEliminarMascota;
    private javax.swing.JButton btnEliminarMascota;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField txtIdentificacionMascotaEliminar;
    // End of variables declaration                   
}
