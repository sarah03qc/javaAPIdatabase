package com.mibdp.crudMIBDP.participaEnPeli;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ParticipaEnPeliController {

    @Autowired
    private ParticipaEnPeliDAO parDAO;

    @GetMapping("/participacion")
    public List<ParticipaEnPeli> getParticipaciones() {
        return parDAO.getAll();
    }

    @GetMapping("/participacion/{celebID}")
    public ParticipaEnPeli getParticipacionById(@PathVariable Long celebID) {
        return parDAO.getById(celebID);
    }
}