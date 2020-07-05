package br.com.prog3.aula12_1.domain;

import br.com.prog3.aula12_1.enums.Modalidade;

public class Curso {

	private Long id;
	private String nome;
	private Integer cargaHoraria;
	private Modalidade modalidade;

	public Curso(Long id, String nome, Integer cargaHoraria, Modalidade modalidade) {
		this.id = id;
		this.nome = nome;
		this.cargaHoraria = cargaHoraria;
		this.modalidade = modalidade;
	}
	// get/set

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(Integer cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	public Modalidade getModalidade() {
		return modalidade;
	}

	public void setModalidade(Modalidade modalidade) {
		this.modalidade = modalidade;
	}

}
