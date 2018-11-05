package mascotas;

public class Nodo<T extends Comparable<T>> implements Cloneable {
	private Nodo<T> izquierdo;
	private Nodo<T> derecho;
	private T contenido;

	public Nodo(T contenido) {
		this.contenido = contenido;
	}

	public Nodo<T> getIzquierdo() {
		return izquierdo;
	}

	public void setIzquierdo(Nodo<T> izquierdo) {
		this.izquierdo = izquierdo;
	}

	public Nodo<T> getDerecho() {
		return derecho;
	}

	public void setDerecho(Nodo<T> derecho) {
		this.derecho = derecho;
	}

	public T getContenido() {
		return contenido;
	}

	public void setContenido(T contenido) {
		this.contenido = contenido;
	}
	
	@Override
	protected Object clone() {
		try {
			return super.clone();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
