package com.gestaoalunos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gestaoalunos.model.Curso;
import com.gestaoalunos.model.CursoRepository;

@Controller
@RequestMapping("/curso")
public class CursoController {
	
	@Autowired
	private CursoRepository repo;


	@PostMapping("/cadastrar")
	public String cadastrar(Curso curso) {
    repo.save(curso);
    return "redirect:/curso/listar";
	}

	@GetMapping("/listar")
	public String listar(Model model){
		List<Curso> lista = repo.findAll();
		model.addAttribute("cursos", lista);
		return "cursos/lista";
	}

	@GetMapping("/novo")
	public String novo(Model model){
		model.addAttribute("curso", new Curso());
		return "cursos/formulario";
	}
}