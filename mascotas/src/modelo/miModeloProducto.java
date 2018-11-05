package modelo;

import javax.swing.JOptionPane;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

import mascotas.CentralProducto;

public class miModeloProducto implements TableModel {
	
	private CentralProducto arbol;
	private String tipo;
	private TableModelListener onAddListenerCliente; //pendiente de cuando hace una acción, cuando agrega algo va a hacer lo que tiene el listener
	private TableModelListener onRemoveListenerCliente;

	public miModeloProducto(CentralProducto arbol, String tipo) {this.arbol = arbol; this.tipo = tipo;}

	@Override
	public int getRowCount() {
		return arbol.size();
	}

	@Override
	public int getColumnCount() {
		return 5;
	}

	@Override
	public String getColumnName(int columnIndex) {
		switch (columnIndex) {
		case 0:
			return "Código";
		case 1:
			return "Nombre";
		case 2:
			return "Descripción";
		case 3:
			return "Presentación";
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
//		Producto producto = arbol.buscarPosicionProducto(rowIndex);
//		switch (columnIndex) {
//		case 0:
//			return producto.getCodigo();
//		case 1:
//			return producto.getNombre();
//		case 2:
//			return producto.getDescripcion();
//		case 3:
//			return producto.getPresentacion();
//		case 4:
//			return producto.getUnidadesInventario();
//		default:
			return null;
//		}
	}

//	@Override
	public void setValueAt(Object aValue, int rowIndex, int columnIndex) {

//		Producto producto = arbol.buscarPosicionProducto(rowIndex);
//		switch (columnIndex) {
//		case 0:
//			producto.setCodigo(Integer.valueOf((Integer)aValue));
//			break;
//		case 1:
//			producto.setNombre(String.valueOf(aValue));
//			break;
//		case 2:
//			producto.setPresentacion(String.valueOf(aValue)); 
//			break;
//		case 3:
//			producto.setDescripcion(String.valueOf(aValue)); 
//			break;
//		case 4:
//			producto.setUnidadesInventario(Integer.valueOf((Integer)aValue));
//			break;
//		default:
//			JOptionPane.showMessageDialog(null, "Lo que intenta ingresar no corresponde a ningun campo.");
		}
//	}

	@Override
	public void addTableModelListener(TableModelListener l) {
		this.onAddListenerCliente = l;}
		
	@Override
	public void removeTableModelListener(TableModelListener l) {
		this.onRemoveListenerCliente = l;}
		
}
