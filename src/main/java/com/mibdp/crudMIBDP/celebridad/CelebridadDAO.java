package com.mibdp.crudMIBDP.celebridad;

import java.util.List;

public interface CelebridadDAO {

    List<Celebridad> getAll();

    Celebridad getById(Long celebID);
}