package mascotas;

import exceptions.NoExisteException;

public class centralCliente {

	private static Cliente primero;
	centralMascota mas = new centralMascota();

	public void insertarInicio(Cliente n) {

		if (primero == null) {
			primero = n;
		} else {
			n.setSiguienteCliente(primero);
			primero = n;
		}
	}

	public void listar() {

		Cliente actual = primero;

		while (actual != null) {
			System.out.println(actual.getNombre());
			actual = actual.getSiguienteCliente();
		}
	}

	public Cliente buscarUltimo() {

		Cliente actual = primero;

		if (actual != null) {
			while (actual.getSiguienteCliente() != null) {
				actual = actual.getSiguienteCliente();
			}
		}

		return actual;
	}

	public void insertarFinal(Cliente n) {

		Cliente actual = primero;

		if (actual != null) {

			while (actual.getSiguienteCliente() != null) {
				actual = actual.getSiguienteCliente();
			}

			actual.setSiguienteCliente(n);
			n.setSiguienteCliente(null);

		} else {
			n.setSiguienteCliente(null);
			primero = n;
		}

	}

	public Cliente buscar(int contenido) {

		Cliente actual = primero;

		while (actual != null && actual.getIdentificacion() != contenido) {
			actual = actual.getSiguienteCliente();
		}

		return actual;
	}

	public Cliente buscarPosicion(int posicion) {
		if (posicion >= this.longitud()) {
			return null;
		}
		int contador = 0;
		Cliente actual = primero;
		while (contador != posicion && actual != null) {
			actual = actual.getSiguienteCliente();
			contador++;
		}
		return actual;
	}

	public int longitud() {
		int contador = 0;
		Cliente actual = primero;
		while (actual != null) {
			actual = actual.getSiguienteCliente();
			contador++;
		}
		return contador;
	}

	public void verMascotas(int codigo) {

		centralMascota actual = buscar(codigo).getMascota();
		System.out.println(actual);
		System.out.println(actual.total());
		for (int i = 0; i <= actual.total(); i++) {
			System.out.println(actual.toString());
			actual.sig();
		}
	}

	public Cliente localizarAnterior(int codigo) {

		Cliente anterior = null;
		Cliente actual = primero;
		while (actual != null && actual.getIdentificacion() != codigo) {
			anterior = actual;
			actual = actual.getSiguienteCliente();
		}
		return actual != null ? anterior : null;
	}

	public void insertarAntesDe(int codigo, Cliente n) throws NoExisteException {

		Cliente anterior = localizarAnterior(codigo);
		if (anterior == null) {
			throw new NoExisteException();
		} else {
			n.setSiguienteCliente(anterior.getSiguienteCliente());
			anterior.setSiguienteCliente(n);
		}
	}

	public void insertarDespuesDe(int codigo, Cliente n) throws NoExisteException {

		Cliente actual = buscar(codigo);
		if (actual == null) {
			throw new NoExisteException();
		} else {
			n.setSiguienteCliente(actual.getSiguienteCliente());
			actual.setSiguienteCliente(n);
		}
	}

	public void eliminar(int codigo) throws NoExisteException {
		
		Cliente actual = buscar(codigo);
		if(actual == primero) {
			primero = actual.getSiguienteCliente();
		}else {
		Cliente anterior = localizarAnterior(codigo);
		anterior.setSiguienteCliente(actual.getSiguienteCliente());}
	}
}
