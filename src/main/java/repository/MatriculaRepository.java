package repository;

import domain.Matricula;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by fredy on 01/07/17.
 */
public interface MatriculaRepository extends CrudRepository<Matricula, Long> {
}
