package repository;

import domain.Alumno;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by fredy on 01/07/17.
 */
public interface AlumnoRepository extends CrudRepository<Alumno, Long> {
    // Sets the active boolean to true or false.

    @Query("UPDATE User SET active = TRUE WHERE id = ?1")
    void active(Long id);

}


