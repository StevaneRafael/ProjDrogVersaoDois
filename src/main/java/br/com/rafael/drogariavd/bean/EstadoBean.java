package br.com.rafael.drogariavd.bean;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.omnifaces.util.Messages;

import br.com.rafael.drogariavd.domain.Estado;

@SuppressWarnings("serial")
@ManagedBean
@ViewScoped
public class EstadoBean implements Serializable{

	private Estado estado;

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public void novo() {
		estado = new Estado();
	}
	
	public void salvar() {
		Messages.addGlobalInfo("Nome: " + estado.getNome() + " Sigla: " + estado.getSigla());

		/*
		 * Metódo mais 'Antigo' String texto = "Programação Web com Java"; FacesMessage
		 * mensagem = new FacesMessage(FacesMessage.SEVERITY_ERROR, texto, texto);
		 * FacesContext contexto = FacesContext.getCurrentInstance();
		 * contexto.addMessage(null, mensagem);
		 */
	}
}
