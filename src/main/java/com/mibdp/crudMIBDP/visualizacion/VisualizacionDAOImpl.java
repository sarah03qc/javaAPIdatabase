package com.mibdp.crudMIBDP.visualizacion;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.mibdp.crudMIBDP.entidades.VisualizacionPeli;

@Repository
public class VisualizacionDAOImpl implements VisualizacionDAO {

    @Autowired
    JdbcTemplate jdbcTemplate2;

    @Override
    public List<VisualizacionPeli> getAll() {
        return jdbcTemplate2.query("SELECT * FROM visualizacionPeli",
                new BeanPropertyRowMapper<VisualizacionPeli>(VisualizacionPeli.class));
    }

    @Override
    public VisualizacionPeli getById(Long pelicula_id) {
        return jdbcTemplate2.queryForObject("SELECT * FROM visualizacionPeli WHERE peli_id=?",
                new BeanPropertyRowMapper<VisualizacionPeli>(VisualizacionPeli.class), pelicula_id);
    }
}
