package com.mibdp.crudMIBDP;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.mibdp.crudMIBDP.entidades.General;

@RestController
public class GeneralController {

    @Autowired
    private GeneralDAO eDAO;

    @GetMapping("/pelicula/{id}")
    public General getMoviesById(@PathVariable Long id) {
        return eDAO.getGeneral(id);
    }
}
