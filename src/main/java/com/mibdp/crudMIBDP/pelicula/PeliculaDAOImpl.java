package com.mibdp.crudMIBDP.pelicula;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class PeliculaDAOImpl implements PeliculaDAO {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public int save(Pelicula peli) {
        return jdbcTemplate.update("INSERT INTO pelicula(titulo, sinopsis, enListaPorVer) VALUES(?, ?, ?)",
                new Object[] { peli.getTitulo(), peli.getSinopsis(), peli.isEnListaPorVer() });
    }

    @Override
    public int update(Pelicula peli, Long id) {
        return 0;
    }

    @Override
    public int delete(Long id) {
        return 0;
    }

    @Override
    public List<Pelicula> getAll() {
        return jdbcTemplate.query("SELECT * FROM pelicula",
                new BeanPropertyRowMapper<Pelicula>(Pelicula.class));
    }

    @Override
    public Pelicula getById(Long id) {
        return jdbcTemplate.queryForObject("SELECT * FROM pelicula WHERE id=?",
                new BeanPropertyRowMapper<Pelicula>(Pelicula.class), id);
    }

}
