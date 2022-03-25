package maven.demo;

public class Principal {
	
	public static void main(String[] args) {
		
		DAO dao = new DAO();
		
		dao.conectar();

		
		//Inserir um elemento na tabela
		Produto compra = new Produto(14, "chocolate", 1);
		if(dao.inserirProduto(compra) == true) {
			System.out.println("Inserção com sucesso -> " + compra.toString());
		}
		

		//Atualizar produto
		compra.setProduto("novo produto");
		dao.atualizarProduto(compra);

		
		//Excluir produto
		dao.excluirProduto(compra.getId());
		
		//Mostrar produtos
		Produto[] compras = dao.getProdutos();
		System.out.println("==== Mostrar produtos === ");		
		for(int i = 0; i < compras.length; i++) {
			System.out.println(compras[i].toString());
		}
		
		dao.close();
	}
}