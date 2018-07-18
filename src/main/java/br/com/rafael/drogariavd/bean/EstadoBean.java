package br.com.rafael.drogariavd.bean;

import javax.faces.bean.ManagedBean;

import org.omnifaces.util.Messages;

@ManagedBean
public class EstadoBean {
	public void salvar() {
		/* Metódo mais 'Antigo'
		String texto = "Programação Web com Java";
		FacesMessage mensagem = new FacesMessage(FacesMessage.SEVERITY_ERROR, texto, texto);
		
		FacesContext contexto =  FacesContext.getCurrentInstance();
		contexto.addMessage(null, mensagem);
		*/
		Messages.addGlobalInfo("Programação Web com Java");
		
	}
}
