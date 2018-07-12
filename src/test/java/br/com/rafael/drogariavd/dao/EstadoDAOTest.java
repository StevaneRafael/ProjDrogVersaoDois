package br.com.rafael.drogariavd.dao;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import br.com.rafael.droariavd.dao.EstadoDAO;
import br.com.rafael.drogariavd.domain.Estado;

public class EstadoDAOTest {

	@Test
	@Ignore
	public void salvar() {
		Estado estado = new Estado();
		estado.setNome("Rio de Janeiro");
		estado.setSigla("RJ");

		EstadoDAO estadoDAO = new EstadoDAO();
		estadoDAO.salvar(estado);
	}

	@Test
	@Ignore
	public void listar() {
		EstadoDAO estadoDAO = new EstadoDAO();
		List<Estado> resultado = estadoDAO.listar();

		System.out.println("Total de registros encontrados: " + resultado.size());

		for (Estado estado : resultado) {
			System.out.println(estado.getSigla() + " - " + estado.getNome());
		}
	}
	
	@Test
	public void buscar() {
		Long codigo = 1L;
		EstadoDAO estadoDAO = new EstadoDAO();
		Estado estado = estadoDAO.buscar(codigo);
		
		if(estado == null) {
			System.out.println("Nenhum registro encontrado!");
		} else {
			System.out.println("Registro encontrado: ");
			System.out.println(estado.getSigla() + " - " + estado.getNome());
		}
	}
}
