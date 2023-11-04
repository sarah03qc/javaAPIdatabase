package com.mibdp.crudMIBDP.celebridad;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CelebridadDAOImpl implements CelebridadDAO {

    @Autowired
    JdbcTemplate jdbcTemplate4;

    @Override
    public List<Celebridad> getAll() {
        return jdbcTemplate4.query("SELECT * FROM celebridad",
                new BeanPropertyRowMapper<Celebridad>(Celebridad.class));
    }

    @Override
    public Celebridad getById(Long celebID) {
        return jdbcTemplate4.queryForObject("SELECT * FROM celebridad WHERE celebID=?",
                new BeanPropertyRowMapper<Celebridad>(Celebridad.class), celebID);
    }

}
