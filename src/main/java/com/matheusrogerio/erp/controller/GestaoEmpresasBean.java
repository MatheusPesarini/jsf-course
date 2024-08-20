package com.matheusrogerio.erp.controller;

import com.matheusrogerio.erp.model.Empresa;
import com.matheusrogerio.erp.model.TipoEmpresa;

import java.io.Serializable;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named // O Named torna as instancias dessa classe visíveis às páginas XHTML
// @RequestScoped // Essa instancia é encerrada quando a requisição termina
@ViewScoped // Quando o usuário carrega a página, requisicoes não invocam a classe. Deve ser usado em uma classe que herde Serializable
// @SessionScoped // Ao atualizar a pagina a classe perde suas instancias
// @ApplicationScoped // Só suporta a criação de uma instancia
public class GestaoEmpresasBean implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Empresa empresa = new Empresa();
	
	public void salvar() {
		System.out.println("Salvando empresa: " + this.empresa.getRazaoSocial());
		System.out.println("Salvando empresa: " + this.empresa.getNomeFantasia());
		System.out.println("Salvando empresa: " + this.empresa.getTipo());
	}
	
	public String ajuda(){
		return "AjudaGestaoEmpresas";
	}

	public Empresa getEmpresa() {
		return empresa;
	}
	
	public TipoEmpresa[] getTiposEmpresas() {
		return TipoEmpresa.values();
	}
}
