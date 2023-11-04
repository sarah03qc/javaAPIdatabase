package com.mibdp.crudMIBDP.rating;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.mibdp.crudMIBDP.entidades.Rating;

@RestController
public class RatingController {

    @Autowired
    private RatingDAO rDAO;

    @GetMapping("/rating")
    public List<Rating> getRatings() {
        return rDAO.getAll();
    }

    @GetMapping("/rating/{pelicula_id}")
    public Rating getRatingById(@PathVariable Long pelicula_id) {
        return rDAO.getById(pelicula_id);
    }
}
