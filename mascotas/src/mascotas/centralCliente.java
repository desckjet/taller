package mascotas;

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

		for (int i = -1; i <= actual.total(); i++) {

			System.out.println(actual.toString());
			actual.sig();

		}

	}


}
