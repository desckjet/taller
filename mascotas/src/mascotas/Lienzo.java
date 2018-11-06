package mascotas;

import java.awt.Graphics;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Vector;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Lienzo extends JPanel implements MouseListener {

	private int id = 0;
	public static Vector<Establecimiento> vectorNodos;
	public static Vector<Enlace> vectorEnlaces;
	private Point p1, p2;

	private int idNodo = 0;
	private int idNodo2 = 0;

	private int tam = 0;
	private int[][] matriz;

	public Lienzo() {
		this.vectorNodos = new Vector<>();
		this.vectorEnlaces = new Vector<>();
		this.addMouseListener(this);
	}

	@Override
	public void paint(Graphics g) {
		for (Establecimiento nodos : vectorNodos) {
			nodos.pintar(g);
		}
		for (Enlace enlace : vectorEnlaces) {
			enlace.pintar(g);
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if (e.getButton() == MouseEvent.BUTTON1) {
			String nombre = JOptionPane.showInputDialog("Ingrese nombre del nodo: ");
			Lienzo.vectorNodos.add(new Establecimiento(e.getX(), e.getY(), id, nombre));
			id++;
			tam = vectorNodos.size();
			matriz = new int[tam][tam];
			repaint();
		}
		if (e.getButton() == MouseEvent.BUTTON2) {
			Establecimiento est = null;
			for (Establecimiento establecimiento : vectorNodos) {
				if (new Rectangle(establecimiento.getX() - establecimiento.d / 2,
						establecimiento.getY() - establecimiento.d / 2, establecimiento.d, establecimiento.d)
								.contains(e.getPoint())) {
					est = establecimiento;
				}
			}
			Vector<Enlace> vectorEnlacesEliminar = new Vector<>();
			
			for (Enlace enlace : vectorEnlaces) {
				if ((enlace.getX1() == est.getX() && enlace.getY1() == est.getY())
						|| (enlace.getX2() == est.getX() && enlace.getY2() == est.getY())) {
					vectorEnlacesEliminar.add(enlace);
				}
			}
			Lienzo.vectorNodos.remove(est);
			for (int i = 0; i < vectorEnlacesEliminar.size(); i++) {
				this.vectorEnlaces.remove(vectorEnlacesEliminar.get(i));
			}
			repaint();
		}
		if (e.getButton() == MouseEvent.BUTTON3) {
			for (Establecimiento establecimiento : vectorNodos) {
				if (new Rectangle(establecimiento.getX() - establecimiento.d / 2,
						establecimiento.getY() - establecimiento.d / 2, establecimiento.d, establecimiento.d)
								.contains(e.getPoint())) {
					if (p1 == null) {
						p1 = new Point(establecimiento.getX(), establecimiento.getY());
						idNodo = establecimiento.getId();
					} else {
						p2 = new Point(establecimiento.getX(), establecimiento.getY());
						idNodo2 = establecimiento.getId();
						agregar(idNodo, idNodo2);
						this.vectorEnlaces.add(new Enlace(p1.x, p1.y, p2.x, p2.y));
						repaint();
						p1 = null;
						p2 = null;
					}
				}
			}
			imprimir();
		}
	}

	public void imprimir() {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
	}

	public boolean buscarEstablecimiento(String nombre, Vector<Establecimiento> vectorNodos) {
		boolean a = false;
		for (Establecimiento establecimiento : vectorNodos) {
			if (nombre.equals(establecimiento.getNombre())) {
				a = true;
			}
		}
		return a;
	}

	public Vector<Establecimiento> buscarParticular(String nombre, Vector<Establecimiento> vectorNodos, Vector<Enlace> vectorEnlaces) {
		int x = 0;
		int y = 0;
		int x2 = 0;
		int y2 = 0;
		Vector<Establecimiento> vectorParticular = new Vector<>();
		for(Establecimiento establecimiento : vectorNodos) {
			if (nombre.equals(establecimiento.getNombre())) {
				x = establecimiento.getX();
				y = establecimiento.getY();
				for (Enlace enlace : vectorEnlaces) {
					if(enlace.getX1() == x && enlace.getY1() == y) {
						x2 = enlace.getX2();
						y2 = enlace.getY2();
						for(Establecimiento establecimiento2 : vectorNodos) {
							if(establecimiento2.getX() == x2 && establecimiento2.getY() == y2) {
								vectorParticular.add(establecimiento2);
							}
						}
					}
				}
			}
		}
		return vectorParticular;
	}

	public void agregar(int i, int j) {
		matriz[i][j] = 1;
	}

	public void remover(int i, int j) {
		if (matriz[i][j] > 0) {
			matriz[i][j] = 0;
		}
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

}
