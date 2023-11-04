package com.mibdp.crudMIBDP.celebridad;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CelebridadController {

    @Autowired
    private CelebridadDAO cDAO;

    @GetMapping("/celebridad")
    public List<Celebridad> getCelebridades() {
        return cDAO.getAll();
    }

    @GetMapping("/celebridad/{celebID}")
    public Celebridad getCelebridadById(@PathVariable Long celebID) {
        return cDAO.getById(celebID);
    }
}
