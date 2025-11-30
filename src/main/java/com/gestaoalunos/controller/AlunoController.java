package com.gestaoalunos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.gestaoalunos.model.Aluno;
import com.gestaoalunos.model.AlunoRepository;

//@RestController
@Controller
@RequestMapping("/aluno")
public class AlunoController {
	
	@Autowired
	private AlunoRepository repo;

	@Autowired
	private com.gestaoalunos.model.CursoRepository cursoRepo;

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
	
	// @PostMapping("/cadastrar")
	// public Aluno cadastrar(@RequestBody @Validated AlunoDTO dto) {
	// 	return repo.save(dto.toAluno());
	// }

	@PostMapping("/cadastrar")
	public String cadastrar(Aluno aluno, @RequestParam Long cursoId) {
		com.gestaoalunos.model.Curso cursoSelecionado = cursoRepo.findById(cursoId).orElse(null);
		aluno.setCurso(cursoSelecionado);
		repo.save(aluno);
		return  "redirect:/aluno/listar";
	}
	
	// @GetMapping("/listar")
	// public List<Aluno> listar() {
	// 	return repo.findAll();
	// }

	@GetMapping("/listar")
	public String listar(Model model){
		model.addAttribute("alunos", repo.findAll());
		return "alunos/lista";
	}

	@GetMapping("/novo")
	public String novo(Model model){
		model.addAttribute("aluno", new Aluno());
		model.addAttribute("listaCursos", cursoRepo.findAll());
		return "alunos/formulario";
	}
}