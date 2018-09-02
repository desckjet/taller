package mascotas;

import exceptions.NoExisteException;
import mascotas.ui.MenuPrincipal;

public class Mainn {

	public static void main(String[] args) throws NoExisteException {
		
		centralCliente cliente = new centralCliente();
		centralMascota mascota = new centralMascota();
		centralMascota mascota2 = new centralMascota();
		
		mascota.insertarAlFinal(new Mascota(1,"humo","malamute","rojo"));
		mascota.insertarAlFinal(new Mascota(2,"carbon","murcielago","verde"));
		mascota.insertarAlFinal(new Mascota(3,"n^2","rinoceronte","gris"));
		
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
		
		cliente.eliminar(4);
		
		// lista todos los clientes
		cliente.listar();
		
		//System.out.println(mascota.total());
		//recibe el id del cliente y muestra sus mascotas
		//cliente.verMascotas(2);
		
		
		//System.out.println(cliente.buscarUltimo().getNombre());
		new MenuPrincipal().setVisible(true);
	}

}
