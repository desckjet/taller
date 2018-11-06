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

	public int tamano() {
		return tamano(raiz);
	}

	private int tamano(Producto contarRaiz) {
		if (contarRaiz != null)
			return 1 + tamano(contarRaiz.getProductoIzquierda()) + tamano(contarRaiz.getProductoDerecha());
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

    public void eliminar(int codigo) 
    { 
        raiz = borrar(raiz, codigo); 
    } 
  
    Producto borrar(Producto producto, int codigo) 
    { 
        if (producto == null)  return producto; 
        if (codigo < producto.getCodigo()) 
        	producto.setProductoIzquierda(borrar(producto.getProductoIzquierda(), codigo)); 
        else if (codigo > producto.getCodigo()) 
        	producto.setProductoDerecha(borrar(producto.getProductoDerecha(), codigo));
        else
        { 
            if (producto.getProductoIzquierda() == null) 
                return producto.getProductoDerecha(); 
            else if (producto.getProductoDerecha() == null) 
                return producto.getProductoIzquierda(); 
            producto.setCodigo(valorMinimo(producto.getProductoDerecha())); 
            producto.setProductoDerecha(borrar(producto.getProductoDerecha(), producto.getCodigo()));
        } 
        return producto; 
    } 
  
    int valorMinimo(Producto producto) 
    { 
        int minv = producto.getCodigo(); 
        while (producto.getProductoIzquierda() != null) 
        { 
            minv = producto.getProductoIzquierda().getCodigo(); 
            producto = producto.getProductoIzquierda(); 
        } 
        return minv; 
    } 
	
	public Producto buscarProducto(Producto raiz, int codigo) {
		
	    if (raiz==null || raiz.getCodigo()==codigo) 
	        return raiz; 
	    if (raiz.getCodigo() > codigo) 
	        return buscarProducto(raiz.getProductoIzquierda(), codigo); 
	    return buscarProducto(raiz.getProductoDerecha(), codigo);
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
