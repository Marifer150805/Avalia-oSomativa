package AvaliaçãoSomativa;

public class Principal2 extends Livro{

	public Principal2(String autor, int paginas) {
		super(autor, paginas);
	}
	public static void main(String[] args) {
		
		Livro livro = new Livro("Marifer", "15", "Senai");
		System.out.println("autor: "+livro.getAutor());
		System.out.println("paginas: "+livro.getPaginas());
		System.out.println("nome: "+livro.getNome());
	}
}