package ejercicioArboles;

public class ListaVendedores {
	NodoVendedor head;
	
	double dctoAfiliacion;
	double porcentAfiliacion;
	
	

	
	public void insertar(Vendedor v ) {
		NodoVendedor nuevoNodo = new NodoVendedor();
		v.balance = v.vlrAfiliacion - (v.vlrAfiliacion*dctoAfiliacion);
		nuevoNodo.valor = v;
		if (head == null) {
			head = nuevoNodo;
		}
		else {
			NodoVendedor ultimo = head;
			while (ultimo.next != null) {
				ultimo = ultimo.next;
			}
			ultimo.valor.balance = ultimo.valor.balance + (nuevoNodo.valor.balance * porcentAfiliacion);
			ultimo.next = nuevoNodo;
		}
		
	}
	
	public double obtenerBalance(Vendedor v) {
		return v.balance;
	}
	
	public double obtenerTotal() {
		double resultado = 0;
			NodoVendedor ultimo = head;
			while (ultimo.next != null) {
				resultado = resultado + ultimo.valor.balance;
				ultimo = ultimo.next;
			}
			return resultado;	
	}
	
	public Vendedor mayor() {
		double resultado = 0;
			NodoVendedor ultimo = head;
			Vendedor mayor = head.valor;
			while (ultimo.next != null) {
				if(ultimo.valor.balance > mayor.balance) {
					mayor = ultimo.valor;
				}
				ultimo = ultimo.next;
			}
			return mayor;	
	}
	
	public Vendedor menor() {
		double resultado = 0;
			NodoVendedor ultimo = head;
			Vendedor menor = head.valor;
			while (ultimo.next != null) {
				if(ultimo.valor.balance < menor.balance) {
					menor = ultimo.valor;
				}
				ultimo = ultimo.next;
			}
			return menor;	
	}
	
	

}
