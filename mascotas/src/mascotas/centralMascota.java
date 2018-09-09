package mascotas;

public class centralMascota {

	public Mascota primero;
	
	public void insertarAlComienzo (Mascota n) {
		
		if (primero == null) {
			primero = n;
		} else {
			n.setSiguienteMascota(primero);
			primero = n;
		}
	}
	
	public void insertarAlFinal(Mascota n) {

		Mascota actual = primero;

		if (actual != null) {

			while (actual.getSiguienteMascota() != null) {
				actual = actual.getSiguienteMascota();
			}

			actual.setSiguienteMascota(n);
			n.setAnteriorMascota(actual);
			n.setSiguienteMascota(null);

		} else {
			n.setSiguienteMascota(null);
			primero = n;
		}

	}

	
	public Mascota localizarAnterior(int codigo) {

		Mascota anterior = null;

		Mascota actual = primero;

		while (actual != null && actual.getIdentificacion() != codigo) {
			anterior = actual;
			actual = actual.getSiguienteMascota();
		}
		return actual != null ? anterior : null;

	}

	public Boolean insertarAntesDe(int codigo, Mascota n){

		Mascota actual = buscarMascota(codigo);

		if (actual == null) {
			return false;
		}else if(actual.getAnteriorMascota() == null) {
			insertarAlComienzo(n);
			return true;
		} else {
			n.setAnteriorMascota(actual.getAnteriorMascota());
			n.setSiguienteMascota(actual);
			actual.getAnteriorMascota().setSiguienteMascota(n);
			actual.setAnteriorMascota(n);
			return true;
		}
	}

	public Boolean insertarDespuesDe(int codigo, Mascota n){

		Mascota actual = buscarMascota(codigo);

		if (actual == null) {
			return false;
		} else if (actual.getSiguienteMascota() == null) {
			insertarAlFinal(n);
			return true;
		} else {
			n.setAnteriorMascota(actual);
			n.setSiguienteMascota(actual.getSiguienteMascota());
			actual.getSiguienteMascota().setAnteriorMascota(n);
			actual.setSiguienteMascota(n);
			return true;
		}
	}

	public void insertarInicio(Mascota n) {

		n.setAnteriorMascota(null);

		if (primero != null) {
			n.setSiguienteMascota(primero);
			primero.setAnteriorMascota(n);
		} else {
			n.setSiguienteMascota(null);
		}
		primero = n;
	}

	public int total() {

		int contador = 0;
		Mascota actual = primero;

		while (actual != null) {
			contador++;
			actual = actual.getSiguienteMascota();
		}
		return contador;
	}

	// ubicar el numero de la fila que correspode a la tabla
	public Mascota buscarPosicion(int posicion) {
		if (posicion >= this.total()) {
			return null;
		}
		int contador = 0;
		Mascota actual = primero;
		while (contador != posicion && actual != null) {
			actual = actual.getSiguienteMascota();
			contador++;
		}
		return actual;
	}

	public Mascota buscarMascota(int codigo) {

		Mascota actual = primero;

		while (actual != null && actual.getIdentificacion() != codigo) {
			actual = actual.getSiguienteMascota();
		}
		return actual;

	}

	public Boolean eliminarMascota(int codigo) {

		Mascota actual = buscarMascota(codigo);

		if (actual != null) {
			if (actual.getAnteriorMascota() == null) {
				primero = actual.getSiguienteMascota();
				primero.setAnteriorMascota(null);
				return true;
			} else if (actual.getSiguienteMascota() == null) {
				actual.getAnteriorMascota().setSiguienteMascota(null);
				return true;
			} else {
				actual.getAnteriorMascota().setSiguienteMascota(actual.getSiguienteMascota());
				actual.getSiguienteMascota().setAnteriorMascota(actual.getAnteriorMascota());
				return true;
			}
		} else {
			return false;
		}

	}

}
