package com.gestaoalunos.model;

import org.springframework.data.repository.Repository;

public interface CursoRepository extends Repository<Curso, Long> {
	public Curso findById(long id);
	public Curso save(Curso curso);
}

