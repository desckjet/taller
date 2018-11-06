package mascotas.ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import mascotas.Mainn;

import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BuscarProducto extends javax.swing.JFrame {

    /**
     * Creates new form BuscarProducto
     */
    public BuscarProducto() {
    	setTitle("Buscar producto.");
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
        txtCodigoProductoaBuscar = new javax.swing.JTextField();
        txtCodigoProductoaBuscar.addKeyListener(new KeyAdapter() {
        	@Override
        	public void keyTyped(KeyEvent e) {
        		if (!Character.isDigit(e.getKeyChar())) {
        			e.consume();
        		}
        		return;
        	}
        });
        btnBuscarProducto = new javax.swing.JButton();
        btnBuscarProducto.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		if(!txtCodigoProductoaBuscar.getText().isEmpty()) {
        			if(Mainn.producto.buscarProducto(Mainn.producto.raiz, Integer.valueOf(txtCodigoProductoaBuscar.getText()))!=null) {
        				JOptionPane.showMessageDialog(null, "El producto Si existe");
        			}else {
        				JOptionPane.showMessageDialog(null, "El producto No existe");
        			}
        			new GestionDeInventario().setVisible(true);
        			dispose();
        		} else {
        			JOptionPane.showMessageDialog(null, "Por favor ingrese el código del producto a buscar", "Advertencia", JOptionPane.WARNING_MESSAGE);
        		}
        	}	
        });
        btnCancelarBuscarProducto = new javax.swing.JButton();
        btnCancelarBuscarProducto.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		new GestionDeInventario().setVisible(true);
        		BuscarProducto.this.dispose();
        	}
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel1.setText("Código del producto a buscar:");

        btnBuscarProducto.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        btnBuscarProducto.setText("Buscar");

        btnCancelarBuscarProducto.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        btnCancelarBuscarProducto.setText("Cancelar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(33)
        			.addComponent(btnCancelarBuscarProducto, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
        			.addComponent(btnBuscarProducto, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE)
        			.addGap(39))
        		.addGroup(layout.createSequentialGroup()
        			.addGap(17)
        			.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        				.addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 350, GroupLayout.PREFERRED_SIZE)
        				.addComponent(txtCodigoProductoaBuscar, GroupLayout.PREFERRED_SIZE, 356, GroupLayout.PREFERRED_SIZE))
        			.addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(25)
        			.addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
        			.addGap(18)
        			.addComponent(txtCodigoProductoaBuscar, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(btnCancelarBuscarProducto, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
        				.addComponent(btnBuscarProducto, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE))
        			.addContainerGap(17, Short.MAX_VALUE))
        );
        getContentPane().setLayout(layout);

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
            java.util.logging.Logger.getLogger(BuscarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuscarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuscarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuscarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BuscarProducto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton btnBuscarProducto;
    private javax.swing.JButton btnCancelarBuscarProducto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField txtCodigoProductoaBuscar;
    // End of variables declaration                   
}

