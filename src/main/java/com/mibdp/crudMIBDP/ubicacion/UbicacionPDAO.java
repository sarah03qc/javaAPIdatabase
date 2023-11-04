package com.mibdp.crudMIBDP.ubicacion;

import java.util.List;

import com.mibdp.crudMIBDP.entidades.UbicacionP;

public interface UbicacionPDAO {

    List<UbicacionP> getAll();

    UbicacionP getById(Long vId);
}
