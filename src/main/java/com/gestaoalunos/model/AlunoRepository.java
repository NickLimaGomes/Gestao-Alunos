package com.gestaoalunos.model;

//import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Long>  {
	// public Aluno save(Aluno curso);
	// public List<Aluno> findAll();
}