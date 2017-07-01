package service;

import domain.Alumno;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;
import repository.AlumnoRepository;

import java.util.Collection;

/**
 * Created by fredy on 01/07/17.
 */

@Service
public class AlumnoService {
    @Autowired
    AlumnoRepository alumnoRepository;

    public Collection<Alumno> srchApellido(String apellido) {
        return alumnoRepository.srchApellido(apellido);
    }
}
