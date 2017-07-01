package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import service.MatriculaService;

import java.util.Collection;


/**
 * Created by fredy on 01/07/17.
 */
@Controller
public class MatriculaContoller {
    @Autowired
    MatriculaService matriculaService;

    @RequestMapping(value = "/matriculados")
    @ResponseBody
    public Collection<Object> srchAlumnoMatriculado(@RequestParam Long id, @RequestParam String semestre){
        return matriculaService.srchAlumnoMatriculado(id, semestre);
    }

}
