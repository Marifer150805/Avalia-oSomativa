package AvaliaçãoSomativa;

public class Principal {
	public static void main (String[] args) {
	
		Pedidos pedidos = new Pedidos(526412, "Maria", 12345678);
		
		System.out.println("id"+pedidos.getId());
		System.out.println("produto"+pedidos.getProduto());
		System.out.println("quantidade"+pedidos.getQuantidade());
	
	}
}