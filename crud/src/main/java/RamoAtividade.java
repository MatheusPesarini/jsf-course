package com.algaworks.erp.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "ramo_atividade")
public class RamoAtividade implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;
    private String nome;

    // Getters e Setters
}