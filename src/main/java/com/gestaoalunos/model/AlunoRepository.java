package com.gestaoalunos.model;

import java.util.List;

import org.springframework.data.repository.Repository;

public interface AlunoRepository extends Repository<Aluno, Long> {
	public Aluno findById(long id);
	public Aluno save(Aluno curso);
	public List<Aluno> findAll();
}