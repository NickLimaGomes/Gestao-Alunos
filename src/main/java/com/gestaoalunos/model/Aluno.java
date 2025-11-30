package com.gestaoalunos.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Aluno {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String nome;
	private String email;
	private String matricula;
	@ManyToOne
	@JoinColumn
	private Curso curso;
	
	public Aluno() {
		
	}
	
	public Aluno(String nome, String email, String matricula, Curso curso) {
		super();
		this.nome = nome;
		this.email = email;
		this.matricula = matricula;
		this.curso = curso;
	}

	public long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email;
	}

	public String getMatricula() {
		return matricula;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setId(long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
}

