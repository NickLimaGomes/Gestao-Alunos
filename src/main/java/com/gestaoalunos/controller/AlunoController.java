package com.gestaoalunos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestaoalunos.model.Aluno;
import com.gestaoalunos.model.AlunoRepository;

@RestController
@RequestMapping("/aluno")
public class AlunoController {
	
	@Autowired
	private AlunoRepository repo;

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
	public Aluno cadastrar(@RequestBody Aluno aluno) {
		return repo.save(aluno);
	}
	
	@GetMapping("/listar")
	public List<Aluno> listar() {
		return repo.findAll();
	}
}