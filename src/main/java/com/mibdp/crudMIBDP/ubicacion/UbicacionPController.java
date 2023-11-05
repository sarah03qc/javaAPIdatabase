package com.mibdp.crudMIBDP.ubicacion;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UbicacionPController {

    @Autowired
    private UbicacionPDAO uDAO;

    @GetMapping("/ubicacion")
    public List<UbicacionP> getUbicaciones() {
        return uDAO.getAll();
    }

    @GetMapping("/ubicacion/{vId}")
    public UbicacionP getUbicacionById(@PathVariable Long vId) {
        return uDAO.getById(vId);
    }

}
