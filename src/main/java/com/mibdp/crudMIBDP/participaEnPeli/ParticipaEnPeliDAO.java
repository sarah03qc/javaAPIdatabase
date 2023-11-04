package com.mibdp.crudMIBDP.participaEnPeli;

import java.util.List;

import com.mibdp.crudMIBDP.entidades.ParticipaEnPeli;

public interface ParticipaEnPeliDAO {

    List<ParticipaEnPeli> getAll();

    ParticipaEnPeli getById(Long id);
}