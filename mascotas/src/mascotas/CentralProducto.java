package mascotas;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class CentralProducto {

	public static Producto raiz;

	public void preorder(Producto raiz) {
		if (this.raiz != null) {
			if (raiz == null)
				raiz = this.raiz;
			preorder(raiz.getProductoIzquierda());
			System.out.println(raiz.getCodigo());
			preorder(raiz.getProductoDerecha());
		}
	}

	public int size() {
		return size(raiz);
	}

	private int size(Producto r) {
		if (r != null)
			return 1 + size(r.getProductoIzquierda()) + size(r.getProductoDerecha());
		return 0;
	}

	public void posorder(Producto raiz) {
		if (this.raiz != null) {
			if (raiz == null)
				raiz = this.raiz;
			preorder(raiz.getProductoDerecha());
			preorder(raiz.getProductoIzquierda());
			System.out.println(raiz.getCodigo());
		}
	}

	public void inorder(Producto raiz) {
		if (this.raiz != null) {
			if (raiz == null)
				raiz = this.raiz;
			System.out.println(raiz.getCodigo());
			preorder(raiz.getProductoIzquierda());
			preorder(raiz.getProductoDerecha());
		}
	}

	public void eliminar(Producto padre, int contenido) {

		if (this.raiz != null) {
			if (padre.getProductoDerecha().getCodigo() == contenido) {
				eliminarHijo(padre, padre.getProductoDerecha());
			} else if (padre.getProductoIzquierda().getCodigo() == contenido) {
				eliminarHijo(padre, padre.getProductoIzquierda());
			} else {
				eliminar(padre.getProductoDerecha(), contenido);
				eliminar(padre.getProductoIzquierda(), contenido);
			}
		}
	}

	private void eliminarHijo(Producto padre, Producto hijo) {

		if (padre.getProductoDerecha().getCodigo() == hijo.getCodigo()) {
			if (hijo.getProductoDerecha() != null) {
				Producto temporalHijoIzquierdo = null;
				if (hijo.getProductoIzquierda() != null) {
					temporalHijoIzquierdo = hijo.getProductoIzquierda();
				}
				padre.setProductoDerecha(hijo.getProductoDerecha());
				if (temporalHijoIzquierdo != null)
					insertarProducto(padre, temporalHijoIzquierdo);
			} else if (hijo.getProductoIzquierda() != null) {
				padre.setProductoDerecha(hijo.getProductoIzquierda());
			}
		} else {
			if (hijo.getProductoDerecha() != null) {
				Producto temporalHijoIzquierdo = null;
				if (hijo.getProductoIzquierda() != null) {
					temporalHijoIzquierdo = hijo.getProductoIzquierda();
				}
				padre.setProductoIzquierda(hijo.getProductoDerecha());
				insertarProducto(padre, temporalHijoIzquierdo);
			} else if (hijo.getProductoIzquierda() != null) {
				padre.setProductoIzquierda(hijo.getProductoIzquierda());
			}
		}

	}

	public Producto buscarProducto(Producto raiz, int buscar) {
		if (this.raiz != null) {
			if (raiz.getCodigo() == buscar) {
				return raiz;
			}
			if (raiz.getCodigo() > buscar) {
				if (raiz.getProductoIzquierda().getCodigo() == buscar) {
					return raiz.getProductoIzquierda();
				}
				buscarProducto(raiz.getProductoIzquierda(), buscar);
			} else {
				if (raiz.getProductoIzquierda().getCodigo() == buscar) {
					return raiz.getProductoDerecha();
				}
				buscarProducto(raiz.getProductoDerecha(), buscar);
			}
		}
		return null;
	}

	public void insertarProducto(Producto actual, Producto nuevo) {
		if (raiz != null) {
			if (actual == null)
				actual = raiz;
			if (actual.getCodigo() > nuevo.getCodigo()) {
				if (actual.getProductoIzquierda() != null) {
					insertarProducto(actual.getProductoIzquierda(), nuevo);
				} else {
					actual.setProductoIzquierda(nuevo);
				}
			} else {
				if (actual.getProductoDerecha() != null) {
					insertarProducto(actual.getProductoDerecha(), nuevo);
				} else {
					actual.setProductoDerecha(nuevo);
				}
			}
		} else {
			raiz = nuevo;
		}
	}
	
	public Producto buscarProductoEnPosPosorderInorder(Producto raiz, int pos) {
		int counter = 0;
		Stack<Producto> stack = new Stack<>();
		Producto actual = raiz;
		while (!stack.isEmpty() || actual != null) {
			if (actual != null) {
				stack.add(actual);
				actual = actual.getProductoIzquierda();
			} else {
				actual = stack.pop();
				if (counter == pos) {
					return actual;
				}
				counter++;
				actual = actual.getProductoDerecha();
			}
		}
		return null;
	}
	
	public Producto buscarProductoEnPosPreorder(Producto raiz, int pos) {
		int counter = 0;
		Stack<Producto> stack = new Stack<>();
		Producto actual = raiz;
		while (!stack.isEmpty() || actual != null) {
			if (actual != null) {
				stack.add(actual);
				actual = actual.getProductoDerecha();
			} else {
				actual = stack.pop();
				if (counter == pos) {
					return actual;
				}
				counter++;
				actual = actual.getProductoIzquierda();
			}
		}
		return null;
	}
	
	public Producto buscarProductoEnPosInOrder(Producto raiz, int pos) {
		int counter = 0;
		Stack<Producto> stack = new Stack<>();
		Producto actual = raiz;
		while (!stack.isEmpty() || actual != null) {
			if (actual != null) {
				stack.add(actual);
				actual = actual.getProductoDerecha();
			} else {
				actual = stack.pop();
				if (counter == pos) {
					return actual;
				}
				counter++;
				actual = actual.getProductoIzquierda();
			}
		}
		return null;
	}
}
