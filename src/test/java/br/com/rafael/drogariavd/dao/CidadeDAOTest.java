package br.com.rafael.drogariavd.dao;

import org.junit.Ignore;
import org.junit.Test;

import br.com.rafael.droariavd.dao.CidadeDAO;
import br.com.rafael.droariavd.dao.EstadoDAO;
import br.com.rafael.drogariavd.domain.Cidade;
import br.com.rafael.drogariavd.domain.Estado;

public class CidadeDAOTest {
	@Test
	@Ignore
	public void salvar() {
		EstadoDAO estadoDAO = new EstadoDAO();
		
		Estado estado = estadoDAO.buscar(1L);
		
		Cidade cidade = new Cidade();
		cidade.setNome("Rio de Janeiro");
		cidade.setEstado(estado);
		
		CidadeDAO cidadeDAO = new CidadeDAO();
		cidadeDAO.salvar(cidade);
	}
}
