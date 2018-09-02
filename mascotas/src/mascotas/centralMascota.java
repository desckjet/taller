package mascotas;

import exceptions.NoExisteException;

public class centralMascota {

	public Mascota primero;

	public void listar() {

		Mascota actual = primero;

		while (actual != null) {
			System.out.println(actual.getNombre());
			actual = actual.getSiguienteMascota();
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

	public void insertarAntesDe(int codigo, Mascota n) throws NoExisteException {

		Mascota actual = buscarMascota(codigo);

		if (actual == null)
			throw new NoExisteException(codigo);
		else {
			n.setSiguienteMascota(actual);
			n.setAnteriorMascota(actual.getAnteriorMascota());
			if (actual.getAnteriorMascota() != null) {
				actual.getAnteriorMascota().setSiguienteMascota(n);
			} else {
				primero = n;
			}
			actual.setAnteriorMascota(n);
		}
	}

	public void insertarDespuesDe(int codigo, Mascota n) throws NoExisteException {

		Mascota actual = buscarMascota(codigo);

		if (actual == null)
			throw new NoExisteException(codigo);
		else {
			n.setSiguienteMascota(actual.getSiguienteMascota());
			n.setAnteriorMascota(actual);
			if (actual.getSiguienteMascota() != null) {
				actual.getSiguienteMascota().setAnteriorMascota(n);
			}
			actual.setSiguienteMascota(n);
		}
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

	public void eliminarMascota(int codigo) {

		Mascota actual = buscarMascota(codigo);

		if (actual != null) {
			if (actual.getAnteriorMascota() == null) {
				primero = actual.getSiguienteMascota();
				primero.setAnteriorMascota(null);
			} else if (actual.getSiguienteMascota() == null) {
				actual.getAnteriorMascota().setSiguienteMascota(null);
			} else {
				actual.getAnteriorMascota().setSiguienteMascota(actual.getSiguienteMascota());
				actual.getSiguienteMascota().setAnteriorMascota(actual.getAnteriorMascota());
			}
		}

	}

	public String toString() {
		String mensaje = ("la mascota se llama " + primero.getNombre());
		return mensaje;

	}

	public Mascota sig() {

		primero = primero.getSiguienteMascota();
		return primero;
	}

}
