package com.projeto.spring.curso.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.spring.curso.domain.Curso;
import com.projeto.spring.curso.domain.Sala;
import com.projeto.spring.curso.domain.Turma;

public interface CursoRepository extends JpaRepository<Curso,Long> {

	void save(Sala turma);

	void save(Turma turma1);

	

}
