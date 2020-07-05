package br.com.prog3.aula12_1.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.prog3.aula12_1.service.CursoService;

public class CursoResource {

	// @RequestMapping("/cursos")
	// @GetMapping()
	// public String get() {
	// return "Lista de cursos";

	@RequestMapping("/api/v1/cursos")
	@GetMapping()
	public List<Curso> get() {
		CursoService cursoService = new CursoService();
		return cursoService.findAll();
	}
}
