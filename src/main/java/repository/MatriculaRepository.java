package repository;

import domain.Matricula;
import domain.Alumno;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Collection;

/**
 * Created by fredy on 01/07/17.
 */
public interface MatriculaRepository extends CrudRepository<Matricula, Long> {
    @Query("SELECT a , m.nota FROM Alumno a JOIN Matricula m " +
            "WHERE m.alumno.id = a.id AND m.curso.id = ?1 AND m.semestre = ?2 ")
    Collection<Object> srchCursoSemestre(Long id, String semestre);
}
