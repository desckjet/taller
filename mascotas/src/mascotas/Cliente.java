package mascotas;

public class Cliente {

	private int identificacion;
	private String nombre;
	private String direccion;
	private int telefono;
	private Cliente siguienteCliente;
	private centralMascota mascota;

	public Cliente(int identificacion, String nombre, String direccion, int telefono, centralMascota mascota) {

		this.identificacion = identificacion;
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
		this.mascota = mascota;
	}

	public int getIdentificacion() {
		return identificacion;
	}

	public void setIdentificacion(int identificacion) {
		this.identificacion = identificacion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public Cliente getSiguienteCliente() {
		return siguienteCliente;
	}

	public void setSiguienteCliente(Cliente siguienteCliente) {
		this.siguienteCliente = siguienteCliente;
	}

	public centralMascota getMascota() {
		return mascota;
	}

	public void setMascota(centralMascota mascota) {
		this.mascota = mascota;
	}

}
