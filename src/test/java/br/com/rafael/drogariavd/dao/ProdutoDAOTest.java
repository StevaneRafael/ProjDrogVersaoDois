package br.com.rafael.drogariavd.dao;

import java.math.BigDecimal;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import br.com.rafael.drogariavd.dao.FabricanteDAO;
import br.com.rafael.drogariavd.dao.ProdutoDAO;
import br.com.rafael.drogariavd.domain.Fabricante;
import br.com.rafael.drogariavd.domain.Produto;

public class ProdutoDAOTest {

	@Test
	@Ignore
	public void salvar() {
		FabricanteDAO fabricanteDAO = new FabricanteDAO();
		Fabricante fabricante = fabricanteDAO.buscar(new Long("1"));

		Produto produto = new Produto();
		produto.setDescricao("Cataflan 50mg com 20 Comprimidos");
		produto.setFabricante(fabricante);
		produto.setPreco(new BigDecimal("13.70"));
		produto.setQuantidade(new Short("7"));

		ProdutoDAO produtoDAO = new ProdutoDAO();
		produtoDAO.salvar(produto);

		System.out.println("Produto salvo com sucesso!");
	}

	@Test
	@Ignore
	public void listar() {
		ProdutoDAO produtoDAO = new ProdutoDAO();
		List<Produto> resultado = produtoDAO.listar();

		System.out.println("Total de Registros Encontrados: " + resultado.size());

		for (Produto produto : resultado) {
			System.out.println("Código do produto: " + produto.getCodigo());
			System.out.println("Descrição: " + produto.getDescricao());
			System.out.println("Preço: " + produto.getPreco());
			System.out.println("Quantidade: " + produto.getQuantidade());
			System.out.println("Código do fabricante: " + produto.getFabricante().getCodigo());
			System.out.println("Descrição do Fabricante: " + produto.getFabricante().getDescricao());
			System.out.println();
		}
	}

	@Test
	@Ignore
	public void buscar() {
		Long codigoProduto = 1L;

		ProdutoDAO produtoDAO = new ProdutoDAO();
		Produto produto = produtoDAO.buscar(codigoProduto);

		if (produto == null) {
			System.out.println("Nenhum registro encontrado");
		} else {
			System.out.println("Registro encontrado:");
			System.out.println("Código do produto: " + produto.getCodigo());
			System.out.println("Descrição: " + produto.getDescricao());
			System.out.println("Preço: " + produto.getPreco());
			System.out.println("Quantidade: " + produto.getQuantidade());
			System.out.println("Código do fabricante: " + produto.getFabricante().getCodigo());
			System.out.println("Descrição do Fabricante: " + produto.getFabricante().getDescricao());
		}
	}

	@Test
	public void excluir() {
		Long codigoProduto = 3L;
		ProdutoDAO produtoDAO = new ProdutoDAO();
		Produto produto = produtoDAO.buscar(codigoProduto);

		if (produto == null) {
			System.out.println("Nenhum registro encontrado!");
		} else {
			produtoDAO.excluir(produto);
			System.out.println("Registro removido: ");
			System.out.println("Código do produto: " + produto.getCodigo());
			System.out.println("Descrição: " + produto.getDescricao());
			System.out.println("Preço: " + produto.getPreco());
			System.out.println("Quantidade: " + produto.getQuantidade());
			System.out.println("Código do fabricante: " + produto.getFabricante().getCodigo());
			System.out.println("Descrição do Fabricante: " + produto.getFabricante().getDescricao());
		}
	}

	@Test
	@Ignore
	public void editar() {
		Long codigoProduto = 3L;
		Long codigoFabricante = 3L;

		FabricanteDAO fabricanteDAO = new FabricanteDAO();
		Fabricante fabricante = fabricanteDAO.buscar(codigoFabricante);

		ProdutoDAO produtoDAO = new ProdutoDAO();
		Produto produto = produtoDAO.buscar(codigoProduto);

		System.out.println("Produto a ser editado:");
		System.out.println("Código do produto: " + produto.getCodigo());
		System.out.println("Descrição: " + produto.getDescricao());
		System.out.println("Preço: " + produto.getPreco());
		System.out.println("Quantidade: " + produto.getQuantidade());
		System.out.println("Código do fabricante: " + produto.getFabricante().getCodigo());
		System.out.println("Descrição do Fabricante: " + produto.getFabricante().getDescricao());
		System.out.println();

		produto.setDescricao("Gel Massageador");
		produto.setPreco(new BigDecimal("5.50"));
		produto.setQuantidade(new Short("15"));
		produto.setFabricante(fabricante);
		
		produtoDAO.editar(produto);

		System.out.println("Produto Editado:");
		System.out.println("Código do produto: " + produto.getCodigo());
		System.out.println("Descrição: " + produto.getDescricao());
		System.out.println("Preço: " + produto.getPreco());
		System.out.println("Quantidade: " + produto.getQuantidade());
		System.out.println("Código do fabricante: " + produto.getFabricante().getCodigo());
		System.out.println("Descrição do Fabricante: " + produto.getFabricante().getDescricao());

		System.out.println("Produto Editado!");

	}

}
