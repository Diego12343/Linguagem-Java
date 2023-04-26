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
import com.projeto.spring.curso.repository.CursoRepository;

public class SalaController {
	
	@Autowired
	private CursoRepository cr;
	
	@GetMapping("/sala/listar")
	public List<Curso> listar(){
		return cr.findAll();
	}
	
	@GetMapping("/sala/listar/{id}")
	public Optional<Curso> listar(@PathVariable Long id) {
		return cr.findById(id);
	}
    @PostMapping("/sala/cadastrar")
	public String cadastrar(@RequestBody Sala curso) {
		
		Sala sala = null;
		cr.save(sala);
		return "Cadastrou";
	}
    
    @PutMapping("/sala/atualizar/{id}")
    public String atualizar(@PathVariable Long id, @RequestBody Sala sala) {
    	String msg = "";
    	Optional<Curso> c = cr.findById(id);
    	
    	if(c.isPresent()) {
    		sala.setIdsala(id);
    		cr.save (sala);
    		msg = "Sala atualizada";
    	}
    	else {
    		msg = "Sala não encontrada";
    	}
    	return msg;
    }
    @DeleteMapping("/sala/apagar/{id}")
    public String apagar(@PathVariable Long id) {
    	String msg = "";
    	Optional<Sala> c = Optional.empty();
    	
    	if(c.isPresent()) {
    		cr.deleteById(id);
    		msg = "Sala apagada";
    	}
    	else {
    		msg = "Sala não localizada";
    	}
    	return msg;
    }

}


