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

//@RestController
@Controller
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
	
	// @PostMapping("/cadastrar")
	// public Curso cadastrar(@RequestBody @Validated CursoDTO dto) {
	// 	return repo.save(dto.toCurso());
	// }

	@PostMapping("/cadastrar")
	public String cadastrar(Curso curso) { // Removemos @RequestBody e DTO
    repo.save(curso);
    return "redirect:/curso/listar"; // Após salvar, recarrega a página de listagem
	}
	
	// @GetMapping("/listar")
	// public List<Curso> listar() {
	// 	return repo.findAll();
	// }

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