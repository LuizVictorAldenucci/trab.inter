package maven.demo;

public class Produto {
	private int id;
	private String produto;
	private int qtd;
	
	public Produto() {
		this.id = -1;
		this.produto = "";
		this.qtd = 0;
	}
	
	public Produto(int id, String produto, int qtd) {
		this.id = id;
		this.qtd = qtd;
		this.produto = produto;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}
	
	public int getQtd() {
		return qtd;
	}

	public void setQtd(int qtd) {
		this.qtd = qtd;
	}
	
	@Override
	public String toString() {
		return "Produto [id=" + id + ", produto=" + produto + ", qtd=" + qtd +  "]";
	}	
}
