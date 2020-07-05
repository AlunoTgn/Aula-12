package br.com.prog3.aula12_1.resources;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class Aula121Resource {

	// @GetMapping
	// public String mensagem() {
	// return "Este é meu primeiro webservice. Que legal!!!!!!";

	// @GetMapping
	// public String mensagem1() {
	// return "Mensagem 1....";

	// @GetMapping("/mensagem")
	// public String mensagem() {
	// return "Este é meu primeiro webservice. Que legal!!!!!!";
	// }
	// @GetMapping("/mensagem1")
	// public String mensagem1() {
	// return "Mensagem 1....";

	// @GetMapping()
	// public String get() {
	// return "Método GET sendo chamado";
	// }
	// @PostMapping()
	// public String post() {
	// return "Método POST sendo chamado";
	// }
	// @PutMapping()
	// public String put() {
	// return "Método PUT sendo chamado";
	// }
	// @DeleteMapping()
	// public String delete() {
	// return "Método DELETE sendo chamado";

	// @GetMapping("/login")
	// public String login(@RequestParam("login") String login,
	// @RequestParam("senha") String senha) {
	// return "Login: " + login + ", Senha: " + senha;

	// @GetMapping("/login/{login}/senha/{senha}")
	// public String login(@PathVariable("login") String login,
	// @PathVariable("senha") String senha) {
	// return "Login: " + login + ", Senha: " + senha;

	// @GetMapping("/codigo/{codigo}")
	// public String findCursoById(@PathVariable("codigo") Long codigo) {
	// return "Código do curso: "+codigo;

	//@GetMapping("/cursos/modalidade/{modalidade}")
	//public String findCursoByModalidade(@PathVariable("modalidade") String modalidade) {
	//	return "Lista de cursos: " + modalidade;
	
	@PostMapping("/login")
	public String login(@RequestParam("login") String login,
	@RequestParam("senha") String senha) {
	return "Login: "+login+", Senha: "+senha;
	}
	}

