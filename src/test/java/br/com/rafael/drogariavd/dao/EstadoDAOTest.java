package br.com.rafael.drogariavd.dao;

import org.junit.Test;

import br.com.rafael.droariavd.dao.EstadoDAO;
import br.com.rafael.drogariavd.domain.Estado;

public class EstadoDAOTest {

	@Test
	public void salvar() {
		Estado estado =  new Estado();
		estado.setNome("Rio de Janeiro");
		estado.setSigla("RJ");
		
		EstadoDAO estadoDAO = new EstadoDAO();
		estadoDAO.salvar(estado);
	}
}
