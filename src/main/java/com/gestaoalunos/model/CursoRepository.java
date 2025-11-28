package com.gestaoalunos.model;

import java.util.List;

import org.springframework.data.repository.Repository;

public interface CursoRepository extends Repository<Curso, Long> {
	public Curso save(Curso curso);
	public List<Curso> findAll();
}

