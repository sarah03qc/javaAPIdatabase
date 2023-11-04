package com.mibdp.crudMIBDP.pelicula;

public class Pelicula {
    private Long id;
    private String titulo;
    private String sinopsis;
    private boolean enListaPorVer;

    public Pelicula() {
    }

    public Pelicula(Long id, String titulo, String sinopsis, boolean enListaPorVer) {
        this.id = id;
        this.titulo = titulo;
        this.sinopsis = sinopsis;
        this.enListaPorVer = enListaPorVer;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public boolean isEnListaPorVer() {
        return enListaPorVer;
    }

    public void setEnListaPorVer(boolean enListaPorVer) {
        this.enListaPorVer = enListaPorVer;
    }
}
