package com.mibdp.crudMIBDP.pelicula;

import java.util.List;

public interface PeliculaDAO {

    int save(Pelicula peli);

    int update(Pelicula peli, Long id);

    int delete(Long id);

    List<Pelicula> getAll();

    Pelicula getById(Long id);

}
