package mascotas;

public class Mascota {

	private int identificacion;
	private String nombre;
	private String raza;
	private String color;
	private Mascota siguienteMascota;
	private Mascota anteriorMascota;

	public Mascota(int identificacion, String nombre, String raza, String color) {
		this.identificacion = identificacion;
		this.nombre = nombre;
		this.raza = raza;
		this.color = color;
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

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Mascota getSiguienteMascota() {
		return siguienteMascota;
	}

	public void setSiguienteMascota(Mascota siguienteMascota) {
		this.siguienteMascota = siguienteMascota;
	}

	public Mascota getAnteriorMascota() {
		return anteriorMascota;
	}

	public void setAnteriorMascota(Mascota anteriorMascota) {
		this.anteriorMascota = anteriorMascota;
	}

}
