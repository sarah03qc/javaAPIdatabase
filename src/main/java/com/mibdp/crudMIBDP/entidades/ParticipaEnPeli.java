package com.mibdp.crudMIBDP.entidades;

public class ParticipaEnPeli {
    private Long celebID;
    private String rol;
    private Long peli_id;

    public ParticipaEnPeli() {

    }

    public Long getCelebID() {
        return celebID;
    }

    public void setCelebID(Long celebID) {
        this.celebID = celebID;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public Long getPeli_id() {
        return peli_id;
    }

    public void setPeli_id(Long peli_id) {
        this.peli_id = peli_id;
    }

}
