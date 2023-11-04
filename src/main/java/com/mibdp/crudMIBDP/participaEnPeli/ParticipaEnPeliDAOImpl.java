package com.mibdp.crudMIBDP.participaEnPeli;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.mibdp.crudMIBDP.entidades.ParticipaEnPeli;

@Repository
public class ParticipaEnPeliDAOImpl implements ParticipaEnPeliDAO {

    @Autowired
    JdbcTemplate jdbcTemplate5;

    @Override
    public List<ParticipaEnPeli> getAll() {
        return jdbcTemplate5.query("SELECT * FROM participaEnPeli",
                new BeanPropertyRowMapper<ParticipaEnPeli>(ParticipaEnPeli.class));
    }

    @Override
    public ParticipaEnPeli getById(Long id) {
        return jdbcTemplate5.queryForObject("SELECT * FROM participaEnPeli WHERE peli_id=?",
                new BeanPropertyRowMapper<ParticipaEnPeli>(ParticipaEnPeli.class), id);
    }

}
