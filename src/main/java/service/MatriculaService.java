package service;

import domain.Matricula;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.MatriculaRepository;

import java.util.Collection;

/**
 * Created by fredy on 01/07/17.
 */
@Service
public class MatriculaService {
    @Autowired
    MatriculaRepository matriculaRepository;

    public Collection<Object> srchAlumnoMatriculado(Long id,String semestre) {
        return matriculaRepository.srchCursoSemestre(id, semestre);
    }
}
