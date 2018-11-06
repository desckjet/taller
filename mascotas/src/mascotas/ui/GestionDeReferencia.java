package mascotas.ui;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import mascotas.Lienzo;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GestionDeReferencia extends JFrame {
	
	public GestionDeReferencia() {
		super("Red de referencia");
    	getContentPane().setLayout(new BorderLayout(0, 0));
    	Lienzo lienzo = new Lienzo();
    	getContentPane().add(lienzo);
    	
    	JPanel panel = new JPanel();
    	getContentPane().add(panel, BorderLayout.SOUTH);
    	
    	JButton btnBuscarEst = new JButton("Buscar Establecimiento");
    	btnBuscarEst.addActionListener(new ActionListener() {
    		public void actionPerformed(ActionEvent arg0) {
    			new BuscarEstablecimiento().setVisible(true);
    		}
    	});
    	panel.add(btnBuscarEst);
    	
    	JButton btnParticular = new JButton("Buscar Particular");
    	btnParticular.addActionListener(new ActionListener() {
    		public void actionPerformed(ActionEvent e) {
    			new BuscarParticular().setVisible(true);
    		}
    	});
    	panel.add(btnParticular);
    	
    	JButton btnAtras = new JButton("Atras");
    	btnAtras.addActionListener(new ActionListener() {
    		public void actionPerformed(ActionEvent e) {
    			new MenuPrincipal().setVisible(true);
    			dispose();
    		}
    	});
    	panel.add(btnAtras);
    	
    	setSize(400, 400);
    	setLocationRelativeTo(null);
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void actualizarPantalla() {
		JPanel temp = (JPanel) this.getContentPane();
		SwingUtilities.updateComponentTreeUI(temp);
		temp.validate();
	}

}
