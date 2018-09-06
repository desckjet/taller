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

	// Obtenemos el total de filas que tiene nuestra tabla
	public int getRowCount() {
		return lista.total();
	}

	// Como sabemos que la cantidad de columnas no va a cambiar, ponemos 4 que
	// equivalen a la identificacion
	// nombre, raza y color de la mascota
	public int getColumnCount() {
		return 4;
	}

	// Retornamos el nombre que tiene cada columna de nuestra tabla
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

	// Indicamos el tipo de dato al que pertenece cada columna
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

	// Como nuestra tabla no es editable desde el formulario sino desde los botones,
	// retornamos un falso
	public boolean isCellEditable(int rowIndex, int columnIndex) {
		return false;
	}

	// Obtenemos los valores para cada columna de la lista mascotas
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

	// Aqui asignamos los valores en la posicion de la tabla, en su respectiva
	// columna y adicionalmente
	// como aValue puede ser cualquier cosa, hacemos la conversion al tipo de dato
	// que se espera
	public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
		Mascota mascota = lista.buscarPosicion(rowIndex);
		switch (columnIndex) {
		case 0:
			mascota.setIdentificacion(Integer.valueOf((Integer) aValue));
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

	// Aquí hacemos la reaccion cuando se agrega una nueva mascota
	public void addTableModelListener(TableModelListener l) {
		this.onAddListenerMascota = l;
	}

	// Aquí hacemos la reaccion cuando se elimina una nueva mascota
	public void removeTableModelListener(TableModelListener l) {
		this.onRemoveListenerMascota = l;
	}

}
