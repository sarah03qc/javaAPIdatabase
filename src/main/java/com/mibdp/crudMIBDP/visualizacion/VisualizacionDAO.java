package com.mibdp.crudMIBDP.visualizacion;

import java.util.List;

public interface VisualizacionDAO {

    int save(VisualizacionPeli visualizacionPeli);

    List<VisualizacionPeli> getAll();

    VisualizacionPeli getById(Long peli_id);
}