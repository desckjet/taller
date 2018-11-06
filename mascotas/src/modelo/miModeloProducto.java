package modelo;

import javax.swing.JOptionPane;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

import mascotas.CentralProducto;
import mascotas.Producto;

public class miModeloProducto implements TableModel {

	private CentralProducto arbol;
	private String type;

	public miModeloProducto(CentralProducto arbol, String type) {
		this.arbol = arbol;
		this.type = type;
	}

	@Override
	public int getRowCount() {
		return arbol.tamaño();
	}

	@Override
	public int getColumnCount() {
		return 5;
	}

	@Override
	public String getColumnName(int columnIndex) {
		switch (columnIndex) {
		case 0:
			return "Codigo";
		case 1:
			return "Nombre";
		case 2:
			return "Descripcion";
		case 3:
			return "Presentacion";
		case 4:
			return "Unidades en existencia";
		default:
			return null;
		}
	}

	@Override
	public Class<?> getColumnClass(int columnIndex) {
		switch (columnIndex) {
		case 0:
			return Integer.class;
		case 1:
			return String.class;
		case 2:
			return String.class;
		case 3:
			return String.class;
		case 4:
			return Integer.class;
		default:
			return null;
		}
	}

	@Override
	public boolean isCellEditable(int rowIndex, int columnIndex) {
		return false;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		Producto producto = null;
		if(this.type.equalsIgnoreCase("inorder") || this.type.equalsIgnoreCase("postorder")) {
			producto = arbol.buscarProductoEnPosPosorderInorder(arbol.raiz, rowIndex);
		} else {
			producto = arbol.buscarProductoEnPosPreorder(arbol.raiz, rowIndex);
		}
		
		switch (columnIndex) {
		case 0:
			return producto.getCodigo();
		case 1:
			return producto.getNombre();
		case 2:
			return producto.getDescripcion();
		case 3:
			return producto.getPresentacion();
		case 4:
			return producto.getUnidadesInventario();
		default:
			return null;
		}
	}

	@Override
	public void setValueAt(Object aValue, int rowIndex, int columnIndex) {

	}

	@Override
	public void addTableModelListener(TableModelListener l) {

	}

	@Override
	public void removeTableModelListener(TableModelListener l) {

	}

}
