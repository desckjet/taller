package mascotas;

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
	

	
	public Mascota sig() {
		
		primero = primero.getSiguienteMascota();
		return primero;
	}

}
