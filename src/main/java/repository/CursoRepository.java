package repository;

import domain.Curso;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Collection;

/**
 * Created by fredy on 01/07/17.
 */

public interface CursoRepository extends CrudRepository<Curso, Long> {
    @Query("SELECT c FROM Curso c")
    Collection<Curso> findAll();

    @Query("SELECT c FROM Curso c WHERE c.codigo LIKE CONCAT('%',?1, '%')")
    Collection<Curso> srchCodigo(String cod);

    @Query("SELECT c FROM Curso c WHERE c.nombre LIKE CONCAT('%',?1, '%')")
    Collection<Curso> srchNombre(String nombre);


}
