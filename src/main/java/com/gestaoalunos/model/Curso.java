package com.gestaoalunos.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Curso {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String nome;
	private Integer cargaHoraria;
	private String descricao;
	
	public Curso() {
		
	}
	
	public Curso(String nome, Integer cargaHoraria, String descricao) {
		super();
		this.nome = nome;
		this.cargaHoraria = cargaHoraria;
		this.descricao = descricao;
	}
	
	public long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}
	public Integer getCargaHoraria() {
		return cargaHoraria;
	}
	public String getDescricao() {
		return descricao;
	}

	public void setId(long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCargaHoraria(Integer cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}

