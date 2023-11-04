package com.mibdp.crudMIBDP.visualizacion;

public class VisualizacionPeli {
    private Long vId;
    private Long peli_id;
    private String vistoCuando;
    private Integer tiempoVisto;

    public Long getVId() {
        return vId;
    }

    public void setVId(Long vId) {
        this.vId = vId;
    }

    public Long getPeli_id() {
        return peli_id;
    }

    public void setPeli_id(Long peli_id) {
        this.peli_id = peli_id;
    }

    public String getVistoCuando() {
        return vistoCuando;
    }

    public void setVistoCuando(String vistoCuando) {
        this.vistoCuando = vistoCuando;
    }

    public Integer getTiempoVisto() {
        return tiempoVisto;
    }

    public void setTiempoVisto(Integer tiempoVisto) {
        this.tiempoVisto = tiempoVisto;
    }
}
