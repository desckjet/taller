package modelo;

import javax.swing.JOptionPane;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

import mascotas.Mascota;
import mascotas.centralMascota;

public class miModeloMascota implements TableModel {

	private centralMascota lista;
	private TableModelListener onAddListenerMascota;
	private TableModelListener onRemoveListenerMascota;

	// constructor
	public miModeloMascota(centralMascota lista) {
		this.lista = lista;
	}

	@Override
	public int getRowCount() {
		return lista.total();
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
			return "Raza";
		case 3:
			return "Color";
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
		Mascota mascota = lista.buscarPosicion(rowIndex);
		switch (columnIndex) {
		case 0:
			return mascota.getIdentificacion();
		case 1:
			return mascota.getNombre();
		case 2:
			return mascota.getRaza();
		case 3:
			return mascota.getColor();
		default:
			return null;
		}
	}

	@Override
	public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
		Mascota mascota = lista.buscarPosicion(rowIndex);
		switch (columnIndex) {
		case 0:
			mascota.setIdentificacion(Integer.valueOf((Integer)aValue));
			break;
		case 1:
			mascota.setNombre(String.valueOf(aValue));
			break;
		case 2:
			mascota.setRaza(String.valueOf(aValue)); 
			break;
		case 3:
			mascota.setColor(String.valueOf(aValue));
			break;
		default:
			JOptionPane.showMessageDialog(null, "Lo que intenta ingresar no corresponde a ningun campo.");
		}
	}

	@Override
	public void addTableModelListener(TableModelListener l) {
		this.onAddListenerMascota = l;
	}

	@Override
	public void removeTableModelListener(TableModelListener l) {
		this.onRemoveListenerMascota = l;
	}

}
