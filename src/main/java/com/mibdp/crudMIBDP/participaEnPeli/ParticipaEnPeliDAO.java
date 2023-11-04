package com.mibdp.crudMIBDP.participaEnPeli;

import java.util.List;

public interface ParticipaEnPeliDAO {

    List<ParticipaEnPeli> getAll();

    ParticipaEnPeli getById(Long celebID);
}