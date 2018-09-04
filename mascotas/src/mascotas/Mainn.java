package mascotas;

import exceptions.NoExisteException;
import mascotas.ui.MenuPrincipal;

public class Mainn {
	//Se crean globales para que no se vayan a perder
	public static centralCliente cliente = new centralCliente();
	public static centralMascota mascota = new centralMascota();
	public static centralMascota mascota2 = new centralMascota();

	public static void main(String[] args) throws NoExisteException {
		
		mascota.insertarAlFinal(new Mascota(1,"humo","malamute","rojo"));
		mascota.insertarAlFinal(new Mascota(2,"carbon","murcielago","verde"));
		mascota.insertarAlFinal(new Mascota(3,"n^2","rinoceronte","gris"));
		mascota.insertarAlFinal(new Mascota(4,"n^2","rinoceronte","gris"));
		mascota.insertarAlFinal(new Mascota(5,"n^2","rinoceronte","gris"));


		
		mascota2.insertarAlFinal(new Mascota(1,"kody","lobo","blanco"));
		mascota2.insertarAlFinal(new Mascota(2,"berta","toro","cafe"));
		
		cliente.insertarFinal(new Cliente(1, "negro", "cra 28 # 45-26", 4523105, mascota));
		cliente.insertarFinal(new Cliente(2, "juicio", "cll 58 # 12-32", 4103652,mascota2));
		cliente.insertarFinal(new Cliente(3, "pedro", "cra 56 # 02-75", 9632051,null));
		cliente.insertarFinal(new Cliente(4, "nulll", "cra 78 # 62-05", 5412035,null));
		cliente.insertarFinal(new Cliente(5, "chon", "cll 20 # 120-327", 7412035,null));
		
		/*cliente.insertarInicio(new Cliente(1, "negro", "cra 28 # 45-26", 4523105, mascota));
		cliente.insertarInicio(new Cliente(2, "juicio", "cll 58 # 12-32", 4103652,mascota2));
		cliente.insertarInicio(new Cliente(3, "pedro", "cra 56 # 02-75", 9632051,null));
		cliente.insertarInicio(new Cliente(4, "nulll", "cra 78 # 62-05", 5412035,null));
		cliente.insertarInicio(new Cliente(5, "chon", "cll 20 # 120-327", 7412035,null));*/
		
		//cliente.insertarAntesDe(1, new Cliente(3, "pedro", "cra 56 # 02-75", 9632051,null));
		//cliente.insertarDespuesDe(3, new Cliente(3, "pedro", "cra 56 # 02-75", 9632051,null));
		
		cliente.buscar(4);
		cliente.buscarPosicion(4);
		
		// lista todos los clientes
		cliente.listar();
		// mascota.eliminarMascota(1);
		//mascota.insertarAlComienzo(new Mascota(4, "fsfnombre", "raza", "color"));
		
		new MenuPrincipal().setVisible(true);
	}

}
