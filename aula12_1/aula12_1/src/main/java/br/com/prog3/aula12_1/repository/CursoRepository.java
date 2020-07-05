package br.com.prog3.aula12_1.repository;

import com.sun.tools.javac.util.List;

import br.com.prog3.aula12_1.domain.Curso;

public class CursoRepository implements ICursoRepository {

	@Override
	public List<Curso> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Curso findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Curso> findByModalidade(Modalidade modalidade) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Curso inserir(Curso curso) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Curso alterar(Curso curso) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
		public void excluir(Long id) {
		// TODO Auto-generated method stub
			
			@Override
			public List<Curso> findAll() {
			List<Curso> cursos = new ArrayList<>();
			cursos.add(new Curso(1L,"Java
			básico",40,Modalidade.PRESENCIAL));
			cursos.add(new Curso(2L,"Java
			intermediário",40,Modalidade.A_DISTANCIA));
			cursos.add(new Curso(3L,"Spring
			Boot",40,Modalidade.PRESENCIAL));
			cursos.add(new
			Curso(4L,"NodeJS",40,Modalidade.SEMI_PRESENCIAL));
			cursos.add(new Curso(5L,"VUEJS",40,Modalidade.PRESENCIAL));
			return cursos;
			}
			
			
			}

	@Override
	public br.com.prog3.aula12_1.repository.List<Curso> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public br.com.prog3.aula12_1.repository.List<Curso> findByModalidade(Modalidade modalidade) {
		// TODO Auto-generated method stub
		return null;
	}
}
