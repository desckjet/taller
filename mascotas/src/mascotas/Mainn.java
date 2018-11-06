package mascotas;

import mascotas.ui.MenuPrincipal;

public class Mainn {
	//Se crean globales para que no se vayan a perder
	public static centralCliente cliente = new centralCliente();
	public static centralMascota mascota = new centralMascota();
	public static centralMascota mascota2 = new centralMascota();
	public static centralMascota mascota3 = new centralMascota();
	public static CentralProducto producto = new CentralProducto();
	public static Lienzo lien = new Lienzo();
	
	public static void main(String[] args){
		
//		Aquí estan los datos, si se quieren pasar quemados
//		centralMascota mascota = new centralMascota();
		mascota.insertarAlFinal(new Mascota(1,"humo","malamute","rojo"));
		mascota.insertarAlFinal(new Mascota(2,"carbon","murcielago","verde"));
		mascota.insertarAlFinal(new Mascota(3,"n^2","rinoceronte","azul"));
		
		mascota2.insertarAlFinal(new Mascota(1,"kody","lobo","blanco"));
		mascota2.insertarAlFinal(new Mascota(2,"berta","toro","cafe"));
	
		mascota3.insertarAlFinal(new Mascota(1,"holi","lobo","blanco"));
		mascota3.insertarAlFinal(new Mascota(2,"laura","toro","cafe"));
		
		cliente.insertarFinal(new Cliente(1, "negro", "cra 28 # 45-26", 4523105, mascota));
		cliente.insertarFinal(new Cliente(5, "juicio", "cll 58 # 12-32", 4103652,mascota2));
		cliente.insertarFinal(new Cliente(6, "pedro", "cra 56 # 02-75", 9632051,mascota3));
		
		
		producto.insertarProducto(producto.raiz, new Producto(1, "a", "a", "asads", 123));
		producto.insertarProducto(producto.raiz, new Producto(2, "b", "a", "asads", 124));
		producto.insertarProducto(producto.raiz, new Producto(3, "c", "a", "asads", 125));
		producto.insertarProducto(producto.raiz, new Producto(4, "d", "a", "asads", 126));
		producto.insertarProducto(producto.raiz, new Producto(5, "e", "a", "asads", 127));
		/*cliente.insertarInicio(new Cliente(1, "negro", "cra 28 # 45-26", 4523105, mascota));
		cliente.insertarInicio(new Cliente(2, "juicio", "cll 58 # 12-32", 4103652,mascota2));
		cliente.insertarInicio(new Cliente(3, "pedro", "cra 56 # 02-75", 9632051,null));
		cliente.insertarInicio(new Cliente(4, "nulll", "cra 78 # 62-05", 5412035,null));
		cliente.insertarInicio(new Cliente(5, "chon", "cll 20 # 120-327", 7412035,null));*/
		
		//cliente.insertarAntesDe(1, new Cliente(3, "pedro", "cra 56 # 02-75", 9632051,null));
		//cliente.insertarDespuesDe(3, new Cliente(3, "pedro", "cra 56 # 02-75", 9632051,null));
		
		//cliente.listar();
		
		//cliente.verMascotas(1);
		
		// mascota.eliminarMascota(1);
		//mascota.insertarAlComienzo(new Mascota(4, "fsfnombre", "raza", "color"));
		//mascota.insertarDespuesDe(3, new Mascota(4, "fsfnombre", "raza", "color"));
		
		new MenuPrincipal().setVisible(true);
		
	}

}
