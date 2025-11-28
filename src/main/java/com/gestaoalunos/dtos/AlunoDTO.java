package com.gestaoalunos.dtos;

import com.gestaoalunos.model.Aluno;
import com.gestaoalunos.model.Curso;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class AlunoDTO {

	@NotBlank(message = "Nome do aluno precisa ser preenchido")
	private String nome;
	@NotBlank(message = "Informe o email do aluno")
	@Email(message = "email inválido")
	private String email;
	@NotBlank(message = "Informe a matrícula do aluno")
	private String matricula;
	@NotNull(message = "Selecione um curso")
	private Curso curso;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public Curso getCurso() {
		return curso;
	}
	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	
	public Aluno toAluno() {
		return new Aluno(this.nome, this.email, this.matricula, this.curso);
	}
}
