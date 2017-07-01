package controller;

import domain.Alumno;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import service.AlumnoService;

import java.util.Collection;

/**
 * Created by fredy on 01/07/17.
 */
@Controller
public class AlumnoContoller {
    @Autowired
    AlumnoService alumnoService;

    @RequestMapping(value = "/srchAlumno", method = RequestMethod.GET)
    @ResponseBody
    public Collection<Alumno> showAll(@RequestParam String apellido){
        return alumnoService.srchApellido(apellido);
    }
}
