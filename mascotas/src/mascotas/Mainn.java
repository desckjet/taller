package mascotas;

public class Mainn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
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
		
		cliente.listar();
		
		//mascota.verMascotas(1);
		mascota2.verMascotas(2);
		//System.out.println(mascota.total());
		
		//System.out.println(cliente.buscarUltimo().getNombre());
	}

}
