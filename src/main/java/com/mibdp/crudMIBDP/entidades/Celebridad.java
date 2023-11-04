package com.mibdp.crudMIBDP.entidades;

public class Celebridad {
    private Long celebID;
    private String nombre;

    public Celebridad() {

    }

    public Long getCelebID() {
        return celebID;
    }

    public void setCelebID(Long celebID) {
        this.celebID = celebID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
