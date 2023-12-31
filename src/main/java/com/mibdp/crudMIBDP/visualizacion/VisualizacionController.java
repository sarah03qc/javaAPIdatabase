package com.mibdp.crudMIBDP.visualizacion;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VisualizacionController {

    @Autowired
    private VisualizacionDAO vDAO;

    @GetMapping("/visualizacion")
    public List<VisualizacionPeli> getVisualizaciones() {
        return vDAO.getAll();
    }

    @GetMapping("/visualizacion/{pelicula_id}")
    public VisualizacionPeli getRatingById(@PathVariable Long pelicula_id) {
        return vDAO.getById(pelicula_id);
    }

    @PostMapping("/visualizacion")
    public String savePelicula(@RequestBody VisualizacionPeli visualizacionPeli) {
        return vDAO.save(visualizacionPeli) + " Numero de filas guardadas a la base de datos";
    }
}
