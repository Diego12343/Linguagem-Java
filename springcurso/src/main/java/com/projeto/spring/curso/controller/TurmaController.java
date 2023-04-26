package com.projeto.spring.curso.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.projeto.spring.curso.domain.Curso;
import com.projeto.spring.curso.domain.Sala;
import com.projeto.spring.curso.domain.Turma;
import com.projeto.spring.curso.repository.CursoRepository;

public class TurmaController {
	
	@Autowired
	private CursoRepository cr;
	
	@GetMapping("/turma/listar")
	public List<Curso> listar(){
		return cr.findAll();
	}
	
	@GetMapping("/turma/listar/{id}")
	public Optional<Turma> listar(@PathVariable Long id) {
		return Optional.empty();
	}
    @PostMapping("/turma/cadastrar")
	public String cadastrar(@RequestBody Sala turma) {
		
		Turma turma1 = null;
		cr.save(turma1);
		return "Cadastrou";
	}
    
    @PutMapping("/turma/atualizar/{id}")
    public String atualizar(@PathVariable Long id, @RequestBody Sala sala) {
    	String msg = "";
    	Optional<Curso> c = cr.findById(id);
    	
    	if(c.isPresent()) {
    		sala.setIdsala(id);
    		Sala turma = null;
			cr.save (turma);
    		msg = "Turma atualizada";
    	}
    	else {
    		msg = "Turma não encontrada";
    	}
    	return msg;
    }
    @DeleteMapping("/turma/apagar/{id}")
    public String apagar(@PathVariable Long id) {
    	String msg = "";
    	Optional<Sala> c = Optional.empty();
    	
    	if(c.isPresent()) {
    		cr.deleteById(id);
    		msg = "Turma apagada";
    	}
    	else {
    		msg = "Turma não localizada";
    	}
    	return msg;
    }

}


