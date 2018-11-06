package mascotas.ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.DefaultComboBoxModel;

public class GestionDeInventario extends javax.swing.JFrame {

   /**
    * Creates new form GestionDeInventario
    */
   public GestionDeInventario() {
   	setTitle("Gestión de inventario.");
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

       JtablaInventario = new javax.swing.JScrollPane();
       jTable1 = new javax.swing.JTable();
       btnBuscarInventario = new javax.swing.JButton();
       btnBuscarInventario.addActionListener(new ActionListener() {
       	public void actionPerformed(ActionEvent e) {
       		new BuscarProducto().setVisible(true);
       		dispose();
       	}
       });
       btnEliminarInventario = new javax.swing.JButton();
       btnEliminarInventario.addActionListener(new ActionListener() {
       	public void actionPerformed(ActionEvent e) {
       		new EliminarProducto().setVisible(true);
       		dispose();
       	}
       });
       btnAgregarInventario = new javax.swing.JButton();
       cboFormaDeOrdenarInventario = new javax.swing.JComboBox<>();
       jLabel1 = new javax.swing.JLabel();

       setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

       jTable1.setModel(new javax.swing.table.DefaultTableModel(
           new Object [][] {
               {null, null, null, null, null},
               {null, null, null, null, null},
               {null, null, null, null, null},
               {null, null, null, null, null}
           },
           new String [] {
               "Código", "Nombre", "Descripción", "Presentación", "Unid existentes"
           }
       ));
       JtablaInventario.setViewportView(jTable1);
       jTable1.getAccessibleContext().setAccessibleName("tablaInventario");

       btnBuscarInventario.setText("Buscar");

       btnEliminarInventario.setText("Eliminar");

       btnAgregarInventario.setText("Agregar");
       btnAgregarInventario.addActionListener(new java.awt.event.ActionListener() {
           public void actionPerformed(java.awt.event.ActionEvent evt) {
               btnAgregarInventarioActionPerformed(evt);
           }
       });

       cboFormaDeOrdenarInventario.setModel(new DefaultComboBoxModel(new String[] {"Inorder", "Preorder", "Postorder"}));

       jLabel1.setText("Ver listado en:");
       
       btnRegresar = new JButton();
       btnRegresar.addActionListener(new ActionListener() {
       	public void actionPerformed(ActionEvent e) {
       		new MenuPrincipal().setVisible(true);
       		dispose();
       	}
       });
       btnRegresar.setText("Regresar");

       javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
       layout.setHorizontalGroup(
       	layout.createParallelGroup(Alignment.TRAILING)
       		.addComponent(JtablaInventario, GroupLayout.DEFAULT_SIZE, 609, Short.MAX_VALUE)
       		.addGroup(layout.createSequentialGroup()
       			.addContainerGap()
       			.addGroup(layout.createParallelGroup(Alignment.TRAILING)
       				.addGroup(layout.createSequentialGroup()
       					.addComponent(btnAgregarInventario)
       					.addGap(18)
       					.addComponent(btnBuscarInventario)
       					.addGap(18)
       					.addComponent(btnEliminarInventario)
       					.addGap(186))
       				.addComponent(jLabel1))
       			.addPreferredGap(ComponentPlacement.RELATED)
       			.addGroup(layout.createParallelGroup(Alignment.TRAILING)
       				.addComponent(btnRegresar, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
       				.addComponent(cboFormaDeOrdenarInventario, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
       			.addContainerGap())
       );
       layout.setVerticalGroup(
       	layout.createParallelGroup(Alignment.LEADING)
       		.addGroup(layout.createSequentialGroup()
       			.addContainerGap()
       			.addComponent(JtablaInventario, GroupLayout.PREFERRED_SIZE, 212, GroupLayout.PREFERRED_SIZE)
       			.addPreferredGap(ComponentPlacement.RELATED)
       			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
       				.addComponent(cboFormaDeOrdenarInventario, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
       				.addComponent(jLabel1))
       			.addPreferredGap(ComponentPlacement.RELATED)
       			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
       				.addComponent(btnRegresar, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
       				.addComponent(btnAgregarInventario, GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
       				.addComponent(btnBuscarInventario, GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
       				.addComponent(btnEliminarInventario, GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE))
       			.addGap(17))
       );
       getContentPane().setLayout(layout);

       pack();
   }// </editor-fold>                        

   private void btnAgregarInventarioActionPerformed(java.awt.event.ActionEvent evt) {                                                     
	   new AgregarNuevoProducto().setVisible(true);
	   dispose();
   }                                                    

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
           java.util.logging.Logger.getLogger(GestionDeInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
       } catch (InstantiationException ex) {
           java.util.logging.Logger.getLogger(GestionDeInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
       } catch (IllegalAccessException ex) {
           java.util.logging.Logger.getLogger(GestionDeInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
       } catch (javax.swing.UnsupportedLookAndFeelException ex) {
           java.util.logging.Logger.getLogger(GestionDeInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
       }
       //</editor-fold>

       /* Create and display the form */
       java.awt.EventQueue.invokeLater(new Runnable() {
           public void run() {
               new GestionDeInventario().setVisible(true);
           }
       });
   }

   // Variables declaration - do not modify                     
   private javax.swing.JScrollPane JtablaInventario;
   private javax.swing.JButton btnAgregarInventario;
   private javax.swing.JButton btnBuscarInventario;
   private javax.swing.JButton btnEliminarInventario;
   private javax.swing.JLabel jLabel1;
   private javax.swing.JTable jTable1;
   private javax.swing.JComboBox<String> cboFormaDeOrdenarInventario;
   private JButton btnRegresar;
   // End of variables declaration                   
}