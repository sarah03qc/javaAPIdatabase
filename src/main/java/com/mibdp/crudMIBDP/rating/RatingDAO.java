package com.mibdp.crudMIBDP.rating;

import java.util.List;

import com.mibdp.crudMIBDP.entidades.Rating;

public interface RatingDAO {

    List<Rating> getAll();

    Rating getById(Long pelicula_id);
}
