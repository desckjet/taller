package mascotas;

public class Producto {
	
	private int codigo;
	private String nombre;
	private String descripcion;
	private String presentacion;
	private int unidadesInventario;
	private Producto productoDerecha;
	private Producto productoIzquierda;
	
	public Producto(int codigo, String nombre, String descripcion, String presentacion, int unidadesInventario) {

		this.codigo = codigo;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.presentacion = presentacion;
		this.unidadesInventario = unidadesInventario;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getPresentacion() {
		return presentacion;
	}

	public void setPresentacion(String presentacion) {
		this.presentacion = presentacion;
	}

	public int getUnidadesInventario() {
		return unidadesInventario;
	}

	public void setUnidadesInventario(int unidadesInventario) {
		this.unidadesInventario = unidadesInventario;
	}
	
	public Producto getProductoDerecha() {
		return productoDerecha;
	}

	public void setProductoDerecha(Producto productoDerecha) {
		this.productoDerecha = productoDerecha;
	}

	public Producto getProductoIzquierda() {
		return productoIzquierda;
	}

	public void setProductoIzquierda(Producto productoIzquierda) {
		this.productoIzquierda = productoIzquierda;
	}

}
