package mascotas;

public class centralCliente {

	private static Cliente primero;

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

	public Cliente buscarCliente(int contenido) {

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

	public centralMascota verMascotas(int codigo) {

		centralMascota actual = buscarCliente(codigo).getMascota();
		
		/*int i = actual.total();
		while(i != 0) {
			System.out.println(actual.toString());
			actual.sig();
			i--;
		}*/
		
		return actual;
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

	public Cliente insertarAntesDe(int codigo, Cliente n){

		Cliente anterior = localizarAnterior(codigo);
		if (anterior == null) {
			return null;
		} else {
			n.setSiguienteCliente(anterior.getSiguienteCliente());
			anterior.setSiguienteCliente(n);
			return anterior;
		}
	}

	public Cliente insertarDespuesDe(int codigo, Cliente n){

		Cliente actual = buscarCliente(codigo);
		if (actual == null) {
			return null;
		} else {
			n.setSiguienteCliente(actual.getSiguienteCliente());
			actual.setSiguienteCliente(n);
			return actual;
		}
	}

	public Cliente eliminar(int codigo){
		
		Cliente actual = buscarCliente(codigo);
		if(actual != null) {
			if(actual == primero) {
				primero = actual.getSiguienteCliente();
			}else {
				Cliente anterior = localizarAnterior(codigo);
				anterior.setSiguienteCliente(actual.getSiguienteCliente());
			}
			return actual;
		} else {
			return null;
		}
	}
}
