package ejercicioArboles;

public class Main {

	public static void main(String[] args) {
		//Se crea la lista con los valores fijos que no cambian
		ListaVendedores lista = new ListaVendedores ();
		lista.dctoAfiliacion = 0.1;
		lista.porcentAfiliacion = 0.25;
		
		//Se crean los vendedores
		Vendedor v1 = new Vendedor (1000);
		Vendedor v2 = new Vendedor (5000);
		Vendedor v3 = new Vendedor (1000);
		Vendedor v4 = new Vendedor (1100);
		Vendedor v5 = new Vendedor (3000);
		Vendedor v6 = new Vendedor (500);
		Vendedor v7 = new Vendedor (12000);
		Vendedor v8 = new Vendedor (700);
		Vendedor v9 = new Vendedor (450);
		Vendedor v10 = new Vendedor (2000);
		
		//Se añaden los vendedores a la lista enlazada
		lista.insertar(v1);
		lista.insertar(v2);
		lista.insertar(v3);
		lista.insertar(v4);
		lista.insertar(v5);
		lista.insertar(v6);
		lista.insertar(v7);
		lista.insertar(v8);
		lista.insertar(v9);
		lista.insertar(v10);
		
		System.out.println("El vendedor v3 obtuvo un balance de "+lista.obtenerBalance(v3));
		System.out.println("El  total es "+lista.obtenerTotal());
		System.out.println("El mayor balance es de "+lista.mayor().balance);
		System.out.println("El menor balance es de "+lista.menor().balance);
		

		
		

	}

}
