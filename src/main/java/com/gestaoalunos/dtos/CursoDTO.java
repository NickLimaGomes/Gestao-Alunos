package com.gestaoalunos.dtos;

import com.gestaoalunos.model.Curso;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class CursoDTO {

	@NotBlank(message = "Nome do curso precisa ser preenchido")
	private String nome;
	@NotNull(message = "Informe a carga horária do curso")
	private Integer cargaHoraria;
	private String descricao;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(Integer cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Curso toCurso() {
		return new Curso(this.nome, this.cargaHoraria, this.descricao);
	}
}
