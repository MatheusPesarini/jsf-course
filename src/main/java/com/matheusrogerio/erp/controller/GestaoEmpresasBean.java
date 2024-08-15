package com.matheusrogerio.erp.controller;

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
	private static Integer NUMERO = 0;
	
	public GestaoEmpresasBean() {
		NUMERO++;
	}
	
	public Integer getNumero() {
		return NUMERO;
	}
}
