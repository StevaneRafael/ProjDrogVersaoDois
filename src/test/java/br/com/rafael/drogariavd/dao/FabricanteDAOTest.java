package br.com.rafael.drogariavd.dao;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import br.com.rafael.droariavd.dao.FabricanteDAO;
import br.com.rafael.drogariavd.domain.Fabricante;

public class FabricanteDAOTest {
	@Test
	public void salvar() {
		Fabricante fabricante = new Fabricante();
		fabricante.setDescricao("Aché");

		FabricanteDAO fabricanteDAO = new FabricanteDAO();
		fabricanteDAO.salvar(fabricante);
	}

	@Test
	@Ignore
	public void listar() {
		FabricanteDAO fabricanteDAO = new FabricanteDAO();
		List<Fabricante> resultado = fabricanteDAO.listar();

		System.out.println("Total de Registros Encontrados: " + resultado.size());

		for (Fabricante fabricante : resultado) {
			System.out.println(fabricante.getCodigo() + " - " + fabricante.getDescricao());
		}
	}

	@Test
	@Ignore
	public void buscar() {
		Long codigo = 2L;

		FabricanteDAO fabricanteDAO = new FabricanteDAO();
		Fabricante fabricante = fabricanteDAO.buscar(codigo);

		if (fabricante == null) {
			System.out.println("Nenhum registro encontrado");
		} else {
			System.out.println("Registro encontrado:");
			System.out.println(fabricante.getCodigo() + " - " + fabricante.getDescricao());
		}
	}

	@Test
	@Ignore
	public void excluir() {
		Long codigo = 4L;
		FabricanteDAO fabricanteDAO = new FabricanteDAO();
		Fabricante fabricante = fabricanteDAO.buscar(codigo);

		if (fabricante == null) {
			System.out.println("Nenhum registro encontrado!");
		} else {
			fabricanteDAO.excluir(fabricante);
			System.out.println("Registro removido: ");
			System.out.println(fabricante.getCodigo() + " - " + fabricante.getDescricao());
		}
	}

	@Test
	@Ignore
	public void editar() {
		Long codigo = 3L;
		FabricanteDAO fabricanteDAO = new FabricanteDAO();
		Fabricante fabricante = fabricanteDAO.buscar(codigo);

		if (fabricante == null) {
			System.out.println("Nenhum registro encontrado!");
		} else {
			System.out.println("Registro editado - Antes: ");
			System.out.println(fabricante.getCodigo() + " - " + fabricante.getDescricao());

			fabricante.setDescricao("Aché");
			fabricanteDAO.editar(fabricante);

			System.out.println("Registro editado - depois: ");
			System.out.println(fabricante.getCodigo() + " - " + fabricante.getDescricao());
		}
	}
}