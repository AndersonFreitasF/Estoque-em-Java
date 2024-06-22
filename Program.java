package questao;

import java.util.Locale;
import java.util.Scanner;

import entidades.Produto;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Insira as informações do produto: ");

		System.out.print("Nome: ");
		String nome = sc.nextLine();

		System.out.print("Preço: ");
		double preco = sc.nextDouble();

		System.out.print("Quantidade no estoque: ");
		int quantidade = sc.nextInt();

		Produto product = new Produto(preco, quantidade, nome);

		System.out.println();
		System.out.println("Informações do produto: " + product);
		System.out.println();
		System.out.print("Informe quantos produtos serão adicionas ao estoque: ");
		quantidade = sc.nextInt();
		product.addProdutos(quantidade);
		System.out.println();
		System.out.println(" Informações atualizadas: " + product);
		System.out.println();
		System.out.print("Informe quantos produtos serão retirados do estoque: ");
		quantidade = sc.nextInt();
		product.removerProdutos(quantidade);
		System.out.println();
		System.out.println("Informações atualizadas: " + product);
		sc.close();
	}
}