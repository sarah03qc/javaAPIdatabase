package com.mibdp.crudMIBDP.ubicacion;

import java.util.List;

public interface UbicacionPDAO {

    List<UbicacionP> getAll();

    UbicacionP getById(Long vId);
}
