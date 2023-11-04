package com.mibdp.crudMIBDP.visualizacion;

import java.util.List;

import com.mibdp.crudMIBDP.entidades.VisualizacionPeli;

public interface VisualizacionDAO {

    List<VisualizacionPeli> getAll();

    VisualizacionPeli getById(Long peli_id);
}