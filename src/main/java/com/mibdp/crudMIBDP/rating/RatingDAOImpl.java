package com.mibdp.crudMIBDP.rating;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class RatingDAOImpl implements RatingDAO {

    @Autowired
    JdbcTemplate jdbcTemplate1;

    @Override
    public List<Rating> getAll() {
        return jdbcTemplate1.query("SELECT * FROM rating WHERE pelicula_id",
                new BeanPropertyRowMapper<Rating>(Rating.class));
    }

    @Override
    public Rating getById(Long pelicula_id) {
        return jdbcTemplate1.queryForObject("SELECT * FROM rating WHERE pelicula_id=?",
                new BeanPropertyRowMapper<Rating>(Rating.class), pelicula_id);
    }

}
