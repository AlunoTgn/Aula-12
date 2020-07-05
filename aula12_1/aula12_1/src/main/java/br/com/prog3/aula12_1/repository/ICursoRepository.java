package br.com.prog3.aula12_1.repository;

import com.sun.tools.javac.util.List;

import br.com.prog3.aula12_1.domain.Curso;

public interface ICursoRepository {

	List<Curso> findAll();

	Curso findById(Long id);

	List<Curso> findByModalidade(Modalidade modalidade);

	Curso inserir(Curso curso);

	Curso alterar(Curso curso);

	void excluir(Long id);
}