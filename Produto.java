package entidades;

public class Produto {
	private double preco;
	private int quantidade;
	private String nome;

	public Produto(double preco, int quantidade, String nome) {
		this.preco = preco;
		this.quantidade = quantidade;
		this.nome = nome;
	}

	public Produto() {
		// TODO Auto-generated constructor stub
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double quantidadeTotalEstoque() {
		return preco * quantidade;
	}

	public void removerProdutos(int quantidade) {
		this.quantidade -= quantidade;
	}

	public void addProdutos(int quantidade) {
		this.quantidade += quantidade;
	}

	public String toString() {
		return nome + ", $ " + String.format("%.2f", preco) + ", " + quantidade + " unidades, Total: $ "
				+ String.format("%.2f", quantidadeTotalEstoque());
	}
}
