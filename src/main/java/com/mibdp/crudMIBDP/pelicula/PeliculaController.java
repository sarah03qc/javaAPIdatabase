package com.mibdp.crudMIBDP.pelicula;

import java.util.List;
import com.mibdp.crudMIBDP.entidades.Pelicula;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PeliculaController {

    @Autowired
    private PeliculaDAO pDAO;

    @GetMapping("/peliculas")
    public List<Pelicula> getPeliculas() {
        return pDAO.getAll();
    }

    @GetMapping("/peliculas/{id}")
    public Pelicula getPeliculaById(@PathVariable Long id) {
        return pDAO.getById(id);
    }

    @PostMapping("/peliculas")
    public String savePelicula(@RequestBody Pelicula pelicula) {
        return pDAO.save(pelicula) + " Numero de filas guardadas a la base de datos";
    }
}
