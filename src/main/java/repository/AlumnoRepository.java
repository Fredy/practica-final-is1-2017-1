package repository;

import domain.Alumno;
import org.hibernate.sql.Select;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Collection;

/**
 * Created by fredy on 01/07/17.
 */
public interface AlumnoRepository extends CrudRepository<Alumno, Long> {
    // Sets the active boolean to true or false.
    @Query("SELECT a FROM Alumno a WHERE a.apellidoPaterno LIKE CONCAT('%',?1, '%')")
    Collection<Alumno> srchApellido(String apellido);


}


