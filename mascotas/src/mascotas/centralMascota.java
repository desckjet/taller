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
	
	public void insertarAlComienzo (Mascota n) {
		if (primero == null) {
			primero = n;
		} else {
			n.setSiguienteMascota(primero);
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
	public Mascota buscar(int contenido) {

		Mascota actual = primero;

		while (actual != null && actual.getIdentificacion() != contenido) {
			actual = actual.getSiguienteMascota();
		}

		return actual;
	}

	public void insertarAntesDe(int codigo, Mascota n) throws NoExisteException {

		Mascota anterior = localizarAnterior(codigo);

		if (anterior == null) {
			throw new NoExisteException();
		} else {
			n.setAnteriorMascota(anterior);
			n.setSiguienteMascota(anterior.getSiguienteMascota());
			anterior.getSiguienteMascota().setAnteriorMascota(n);
			anterior.setSiguienteMascota(n);
		}
	}

	public void insertarDespuesDe(int codigo, Mascota n) throws NoExisteException {

		Mascota actual = buscar(codigo);

		if (actual == null) {
			throw new NoExisteException();
		} else {
			n.setAnteriorMascota(actual);
			n.setSiguienteMascota(actual.getSiguienteMascota());
			actual.getSiguienteMascota().setAnteriorMascota(n);
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

	public String toString() {
		String mensaje = ("la mascota se llama " + primero.getNombre());
		return mensaje;

	}
	//ubicar el numero de la fila que correspode a la tabla
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
	
	public void eliminarMascota(int codigo) {
		
		Mascota anterior = localizarAnterior(codigo);
		Mascota actual = buscar(codigo);
		Mascota siguientePrimero = actual.getSiguienteMascota();
		if(anterior == null) {
			siguientePrimero = actual.getSiguienteMascota();
			siguientePrimero.setAnteriorMascota(null);
		}else {
		siguientePrimero = actual.getSiguienteMascota();
		anterior = actual.getAnteriorMascota();
		siguientePrimero.setAnteriorMascota(anterior);
		}
	}

	
	
	public Mascota sig() {
		
		primero = primero.getSiguienteMascota();
		return primero;
	}

}
