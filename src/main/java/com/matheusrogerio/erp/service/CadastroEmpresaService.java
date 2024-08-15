package com.matheusrogerio.erp.service;

import java.io.Serializable;

import javax.inject.Inject;

import com.matheusrogerio.erp.model.Empresa;
import com.matheusrogerio.erp.repository.Empresas;
import com.matheusrogerio.erp.util.Transacional;

public class CadastroEmpresaService implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private Empresas empresas;
	
	@Transacional
	public void salvar(Empresa empresa) {
		empresas.guardar(empresa);
	}
	
	@Transacional
	public void excluir(Empresa empresa) {
		empresas.remover(empresa);
	}

}
