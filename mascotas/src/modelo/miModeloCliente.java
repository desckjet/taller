package modelo;

import javax.swing.JOptionPane;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

import mascotas.Cliente;
import mascotas.centralCliente;

public class miModeloCliente implements TableModel {
	
	private centralCliente lista;
	private TableModelListener onAddListenerCliente; //pendiente de cuando hace una acción, cuando agrega algo va a hacer lo que tiene el listener
	private TableModelListener onRemoveListenerCliente;
	
	

	public miModeloCliente(centralCliente lista) {this.lista = lista;}

	@Override
	public int getRowCount() {
		return lista.longitud();
	}

	@Override
	public int getColumnCount() {
		return 4;
	}

	@Override
	public String getColumnName(int columnIndex) {
		switch (columnIndex) {
		case 0:
			return "IDENTIFICACIÓN";
		case 1:
			return "Nombre";
		case 2:
			return "Dirección";
		case 3:
			return "Teléfono";
		default:
			return null;
		}
	}

	@Override //lo que tengo ahi el tipo de dato
	public Class<?> getColumnClass(int columnIndex) {
		switch (columnIndex) {
		case 0:
			return Integer.class;
		case 1:
			return String.class;
		case 2:
			return String.class;
		case 3:
			return Integer.class;
		default:
			return null;
		}
	}

	@Override //noooo es editable
	public boolean isCellEditable(int rowIndex, int columnIndex) {
		return false;
	}

	@Override //obtener el valor que hay en esa posicion
	public Object getValueAt(int rowIndex, int columnIndex) {
		Cliente cliente = lista.buscarPosicion(rowIndex);
		switch (columnIndex) {
		case 0:
			return cliente.getIdentificacion();
		case 1:
			return cliente.getNombre();
		case 2:
			return cliente.getDireccion();
		case 3:
			return cliente.getTelefono();
		default:
			return null;
		}
	}
	@Override//Asignar los valores
	public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
		Cliente cliente = lista.buscarPosicion(rowIndex);
		switch (columnIndex) {
		case 0:
			cliente.setIdentificacion(Integer.valueOf((Integer)aValue));
			break;
		case 1:
			cliente.setNombre(String.valueOf(aValue));
			break;
		case 2:
			cliente.setDireccion(String.valueOf(aValue)); 
			break;
		case 3:
			cliente.setTelefono(Integer.valueOf((Integer)aValue));
			break;
		default:
			JOptionPane.showMessageDialog(null, "Lo que intenta ingresar no corresponde a ningun campo.");
		}
	}

	@Override
	public void addTableModelListener(TableModelListener l) {
		this.onAddListenerCliente = l;}

	@Override
	public void removeTableModelListener(TableModelListener l) {
		this.onRemoveListenerCliente = l;}

}
