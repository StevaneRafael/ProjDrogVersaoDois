package br.com.rafael.drogariavd.dao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import br.com.rafael.droariavd.dao.ClienteDAO;
import br.com.rafael.droariavd.dao.PessoaDAO;
import br.com.rafael.drogariavd.domain.Cliente;
import br.com.rafael.drogariavd.domain.Pessoa;

public class ClienteDAOTest {
	@Test
	@Ignore
	public void salvar() throws ParseException {
		PessoaDAO pessoaDAO = new PessoaDAO();
		Pessoa pessoa = pessoaDAO.buscar(2L);

		Cliente cliente = new Cliente();
		cliente.setDataCadastro(new SimpleDateFormat("dd/MM/yyyy").parse("16/07/2018"));
		cliente.setLiberado(false);
		cliente.setPessoa(pessoa);

		ClienteDAO clienteDAO = new ClienteDAO();
		clienteDAO.salvar(cliente);

		System.out.println("Cliente salvo com sucesso.");
	}

	@Test
	@Ignore
	public void listar() {
		ClienteDAO clienteDAO = new ClienteDAO();
		List<Cliente> resultado = clienteDAO.listar();

		System.out.println("Total de Registros Encontrados: " + resultado.size());

		for (Cliente cliente : resultado) {

			System.out.println("Código do Cliente: " + cliente.getCodigo());
			System.out.println("Nome do Cliente: " + cliente.getPessoa().getNome());
			System.out.println("Data do cadastro: " + cliente.getDataCadastro());
			if (cliente.getLiberado() == true) {
				System.out.println("Cliente Liberado: Sim");
			} else {
				System.out.println("Cliente Liberado: Não");
			}
			System.out.println("Código da Pessoa: " + cliente.getPessoa().getCodigo());
			System.out.println();
		}
	}

	@Test
	@Ignore
	public void buscar() {
		Long codigoCliente = 1L;

		ClienteDAO clienteDAO = new ClienteDAO();
		Cliente cliente = clienteDAO.buscar(codigoCliente);

		if (cliente == null) {
			System.out.println("Nenhum registro encontrado");
		} else {
			System.out.println("Código do Cliente: " + cliente.getCodigo());
			System.out.println("Nome do Cliente: " + cliente.getPessoa().getNome());
			System.out.println("Data do cadastro: " + cliente.getDataCadastro());
			if (cliente.getLiberado() == true) {
				System.out.println("Cliente Liberado: Sim");
			} else {
				System.out.println("Cliente Liberado: Não");
			}
			System.out.println("Código da Pessoa: " + cliente.getPessoa().getCodigo());
		}
	}

	@Test
	@Ignore
	public void excluir() {
		Long codigoCliente = 3L;
		ClienteDAO clienteDAO = new ClienteDAO();
		Cliente cliente = clienteDAO.buscar(codigoCliente);

		if (cliente == null) {
			System.out.println("Nenhum registro encontrado!");
		} else {
			clienteDAO.excluir(cliente);
			System.out.println("Código do Cliente: " + cliente.getCodigo());
			System.out.println("Nome do Cliente: " + cliente.getPessoa().getNome());
			System.out.println("Data do cadastro: " + cliente.getDataCadastro());
			if (cliente.getLiberado() == true) {
				System.out.println("Cliente Liberado: Sim");
			} else {
				System.out.println("Cliente Liberado: Não");
			}
			System.out.println("Código da Pessoa: " + cliente.getPessoa().getCodigo());
			System.out.println("Cliente excluido!");
		}
	}

	@Test
	@Ignore
	public void editar() throws ParseException {
		Long codigoCliente = 3L;
		Long codigoPessoa = 3L;

		PessoaDAO pessoaDAO = new PessoaDAO();
		Pessoa pessoa = pessoaDAO.buscar(codigoPessoa);

		ClienteDAO clienteDAO = new ClienteDAO();
		Cliente cliente = clienteDAO.buscar(codigoCliente);

		System.out.println("Cliente a ser editado:");
		System.out.println("Código do Cliente: " + cliente.getCodigo());
		System.out.println("Nome do Cliente: " + cliente.getPessoa().getNome());
		System.out.println("Data do cadastro: " + cliente.getDataCadastro());
		if (cliente.getLiberado() == true) {
			System.out.println("Cliente Liberado: Sim");
		} else {
			System.out.println("Cliente Liberado: Não");
		}
		System.out.println("Código da Pessoa: " + cliente.getPessoa().getCodigo());

		cliente.setDataCadastro(new SimpleDateFormat("dd/MM/yyyy").parse("05/06/2017"));
		cliente.setLiberado(false);
		cliente.setPessoa(pessoa);

		clienteDAO.editar(cliente);

		System.out.println("Cliente Editado:");
		System.out.println("Código do Cliente: " + cliente.getCodigo());
		System.out.println("Nome do Cliente: " + cliente.getPessoa().getNome());
		System.out.println("Data do cadastro: " + cliente.getDataCadastro());
		if (cliente.getLiberado() == true) {
			System.out.println("Cliente Liberado: Sim");
		} else {
			System.out.println("Cliente Liberado: Não");
		}
		System.out.println("Código da Pessoa: " + cliente.getPessoa().getCodigo());

		System.out.println("Produto Editado!");

	}
}
