package AvaliaçãoSomativa;

public class Livro extends Produto {
	public String autor;
	public int paginas;
	
	public Livro () { 
	}
	
	public Livro(String autor, int paginas) {
		this.autor = autor;
		this.paginas = paginas;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getPaginas() {
		return paginas;
	}
	public void setPagianas(int paginas) {
		this.paginas = paginas;
	}

}
