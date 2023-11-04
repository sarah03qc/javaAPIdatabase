package com.mibdp.crudMIBDP.rating;

import java.util.List;

public interface RatingDAO {

    List<Rating> getAll();

    Rating getById(Long pelicula_id);
}
