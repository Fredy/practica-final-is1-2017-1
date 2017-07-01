package service;

import domain.Curso;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.CursoRepository;

import javax.transaction.Transactional;
import java.util.Collection;

/**
 * Created by fredy on 01/07/17.
 */
@Service
public class CursoService {
    @Autowired
    CursoRepository cursoRepository;

    @Transactional
    public void save(Curso curso) {
        cursoRepository.save(curso);
    }

    public Collection<Curso> getAll() {
        return cursoRepository.findAll();
    }

    public Curso getById(Long id) {
        return cursoRepository.findOne(id);
    }

    public Collection<Curso> srchCodigo(String codigo) {
        return cursoRepository.srchCodigo(codigo);
    }

    public Collection<Curso> srchNombre(String nombre) {
        return cursoRepository.srchNombre(nombre);
    }
}
