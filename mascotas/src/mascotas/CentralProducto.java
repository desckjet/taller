package mascotas;


public class CentralProducto {
	
	private static Producto raiz;
	
	public void preorder(Producto raiz) {
		if(this.raiz != null){
			if (raiz == null)
				raiz = this.raiz;
			preorder(raiz.getProductoIzquierda());
			System.out.println(raiz.getCodigo());
			preorder(raiz.getProductoDerecha());
		}
	}
	
	public Producto buscarProducto (Producto raiz, int buscar) {
		if(this.raiz != null) {
			if( raiz.getCodigo() == buscar) {
				return raiz;
			}
			if (raiz.getCodigo() > buscar) {
				if (raiz.getProductoIzquierda().getCodigo() == buscar) {
					return raiz.getProductoIzquierda();
				}
				buscarProducto(raiz.getProductoIzquierda(), buscar); 
				}
			else { if (raiz.getProductoIzquierda().getCodigo() == buscar) {
				return raiz.getProductoDerecha();
			}
				buscarProducto(raiz.getProductoDerecha(), buscar);		
			}
		}
		return null;
	}
	
	public void insertarProducto (Producto actual, Producto nuevo) {
		if(raiz != null) {
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
}


