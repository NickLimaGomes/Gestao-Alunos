package com.gestaoalunos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestaoalunos.dtos.CursoDTO;
import com.gestaoalunos.model.Curso;
import com.gestaoalunos.model.CursoRepository;

@RestController
@RequestMapping("/curso")
public class CursoController {
	
	@Autowired
	private CursoRepository repo;

//	@GetMapping("/")
//	public String home(Model model) {
//		model.addAttribute("livros", service.listarLivros());
//		model.addAttribute("livro", new Aluno());
//		model.addAttribute("op","Inserir novo livro:");
//		return "index";
//	}
	
//	@PostMapping("/cadastrar")
//	public String cadastrarLivro(Model model, @ModelAttribute Aluno livro) {
//		service.inserirLivro(livro);
//		return "redirect:";
//	}
//	
//	@PostMapping("/remover")
//	public String removerLivro(@RequestParam long idLivro) {
//		service.removerLivro(idLivro);
//		return "redirect:";
//	}
//	
//	@PostMapping("/editar")
//	public String editarLivro(Model model, @RequestParam long idLivro) {
//		Aluno livro = service.pesquisarLivro(idLivro);
//		model.addAttribute("livros", service.listarLivros());
//		model.addAttribute("livro", livro);
//		model.addAttribute("op","Editar livro:");
//		return "index";
//	}
	
	@PostMapping("/cadastrar")
	public Curso cadastrar(@RequestBody @Validated CursoDTO dto) {
		return repo.save(dto.toCurso());
	}
	
	@GetMapping("/listar")
	public List<Curso> listar() {
		return repo.findAll();
	}
}