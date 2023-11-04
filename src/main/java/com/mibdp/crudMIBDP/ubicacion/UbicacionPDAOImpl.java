package com.mibdp.crudMIBDP.ubicacion;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UbicacionPDAOImpl implements UbicacionPDAO {

    @Autowired
    JdbcTemplate jdbcTemplate3;

    @Override
    public List<UbicacionP> getAll() {
        return jdbcTemplate3.query("SELECT * FROM ubicacionP",
                new BeanPropertyRowMapper<UbicacionP>(UbicacionP.class));
    }

    @Override
    public UbicacionP getById(Long vId) {
        return jdbcTemplate3.queryForObject("SELECT * FROM ubicacionP WHERE vId=?",
                new BeanPropertyRowMapper<UbicacionP>(UbicacionP.class), vId);
    }
}
