package br.com.emarques.forum.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.emarques.forum.model.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long>{

	Curso findByNome(String nomeCurso);

}
