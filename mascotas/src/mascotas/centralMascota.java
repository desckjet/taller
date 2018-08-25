package mascotas;

public class centralMascota {

	private Mascota primero;
	
	centralCliente cliente = new centralCliente();

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

		int cont = 0;
		Mascota actual = primero;

		while (actual != null) {
			cont++;
			actual = actual.getSiguienteMascota();
		}
		return cont;
	}

	public void verMascotas(int codigo) {

		centralMascota actual = cliente.buscar(codigo).getMascota();
		
		for(int i = 0; i <= actual.total(); i++) {
			
			System.out.println(primero.getNombre());
			primero = primero.getSiguienteMascota();
			
		}
		
	}
	
	public String toString() {
		String mensaje = ("la mascota se llama " + primero.getNombre());
		return mensaje;
		
	}

}
