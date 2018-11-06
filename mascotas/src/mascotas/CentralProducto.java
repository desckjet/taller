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

	// This method mainly calls deleteRec() 
    public void eliminar(int key) 
    { 
        raiz = deleteRec(raiz, key); 
    } 
  
    /* A recursive function to insert a new key in BST */
    Producto deleteRec(Producto root, int key) 
    { 
        /* Base Case: If the tree is empty */
        if (root == null)  return root; 
  
        /* Otherwise, recur down the tree */
        if (key < root.getCodigo()) 
            root.setProductoIzquierda(deleteRec(root.getProductoIzquierda(), key)); 
        else if (key > root.getCodigo()) 
            root.setProductoDerecha(deleteRec(root.getProductoDerecha(), key));
  
        // if key is same as root's key, then This is the node 
        // to be deleted 
        else
        { 
            // node with only one child or no child 
            if (root.getProductoIzquierda() == null) 
                return root.getProductoDerecha(); 
            else if (root.getProductoDerecha() == null) 
                return root.getProductoIzquierda(); 
  
            // node with two children: Get the inorder successor (smallest 
            // in the right subtree) 
            root.setCodigo(minValue(root.getProductoDerecha())); 
  
            // Delete the inorder successor 
            root.setProductoDerecha(deleteRec(root.getProductoDerecha(), root.getCodigo()));
        } 
  
        return root; 
    } 
  
    int minValue(Producto root) 
    { 
        int minv = root.getCodigo(); 
        while (root.getProductoIzquierda() != null) 
        { 
            minv = root.getProductoIzquierda().getCodigo(); 
            root = root.getProductoIzquierda(); 
        } 
        return minv; 
    } 
	
	public Producto buscarProducto(Producto raiz, int key) {
		// Base Cases: root is null or key is present at root 
	    if (raiz==null || raiz.getCodigo()==key) 
	        return raiz; 
	  
	    // val is greater than root's key 
	    if (raiz.getCodigo() > key) 
	        return buscarProducto(raiz.getProductoIzquierda(), key); 
	  
	    // val is less than root's key 
	    return buscarProducto(raiz.getProductoDerecha(), key);
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
