package controller;

import domain.Curso;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import service.CursoService;

import java.util.Collection;

/**
 * Created by fredy on 01/07/17.
 */

@Controller
public class CursoContoller {
    @Autowired
    CursoService cursoService;

    @RequestMapping(value = "/cursos")
    @ResponseBody
    public Collection<Curso> showAll(){
        return cursoService.getAll();
    }

    @RequestMapping(value = "/srchCursoCod", method = RequestMethod.GET)
    @ResponseBody
    public Collection<Curso> srchCodigo(@RequestParam String codigo){
        return cursoService.srchCodigo(codigo);
    }

    @RequestMapping(value = "/srchCursoNom", method = RequestMethod.GET)
    @ResponseBody
    public Collection<Curso> srchNombre(@RequestParam String nombre){
        return cursoService.srchNombre(nombre);
    }

}
