package com.mibdp.crudMIBDP.entidades;

import java.util.List;

public class General {

    private Pelicula pelicula = new Pelicula();
    private Rating rating = new Rating();

    private Celebridad celebridad;
    private ParticipaEnPeli participaEnPeli;

    private VisualizacionPeli visualizacionPeli;

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public Rating getRating() {
        return rating;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }

    public Celebridad getCelebridad() {
        return celebridad;
    }

    public void setCelebridad(Celebridad celebridad) {
        this.celebridad = celebridad;
    }

    public ParticipaEnPeli getParticipaEnPeli() {
        return participaEnPeli;
    }

    public void setParticipaEnPeli(ParticipaEnPeli participaEnPeli) {
        this.participaEnPeli = participaEnPeli;
    }

    public VisualizacionPeli getVisualizacionPeli() {
        return visualizacionPeli;
    }

    public void setVisualizacionPeli(VisualizacionPeli visualizacionPeli) {
        this.visualizacionPeli = visualizacionPeli;
    }

}
