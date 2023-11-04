package com.mibdp.crudMIBDP.celebridad;

import java.util.List;

import com.mibdp.crudMIBDP.entidades.Celebridad;

public interface CelebridadDAO {

    List<Celebridad> getAll();

    Celebridad getById(Long celebID);
}