package mascotas;

public class ArbolBinario <T extends Comparable<T>> {
	public Nodo<T> raiz;
	
	public void preorder(Nodo<T> raiz) {
		if(this.raiz != null) {
			if (raiz == null)
				raiz = this.raiz;
			preorder(raiz.getIzquierdo());
			System.out.println(raiz.getContenido());
			preorder(raiz.getDerecho());
		}
	}
}
