package com.mibdp.crudMIBDP;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mibdp.crudMIBDP.celebridad.CelebridadDAO;
import com.mibdp.crudMIBDP.entidades.General;
import com.mibdp.crudMIBDP.participaEnPeli.ParticipaEnPeliDAO;
import com.mibdp.crudMIBDP.pelicula.PeliculaDAO;
import com.mibdp.crudMIBDP.rating.RatingDAO;
import com.mibdp.crudMIBDP.visualizacion.VisualizacionDAO;

@Repository
public class GeneralDAOImpl implements GeneralDAO {

    @Autowired
    private PeliculaDAO peliculaDAO;
    @Autowired
    private RatingDAO ratingDAO;
    @Autowired
    private CelebridadDAO celebridadDAO;
    @Autowired
    private ParticipaEnPeliDAO participaEnPeliDAO;
    @Autowired
    private VisualizacionDAO visualizacionDAO;

    @Override
    public General getGeneral(Long id) {
        General movies = new General();

        movies.setPelicula(peliculaDAO.getById(id));
        movies.setRating(ratingDAO.getById(id));
        movies.setParticipaEnPeli(participaEnPeliDAO.getById(id));
        movies.setCelebridad(celebridadDAO.getById(participaEnPeliDAO.getById(id).getPeli_id()));
        movies.setVisualizacionPeli(visualizacionDAO.getById(id));
        return movies;
    }
}