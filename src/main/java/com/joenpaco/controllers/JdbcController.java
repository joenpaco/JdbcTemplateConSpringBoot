package com.joenpaco.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.joenpaco.models.Departamento;

@RestController
public class JdbcController {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @GetMapping("/departamentos")
    public List<Departamento> getDepartamentos(){
//        return jdbcTemplate.query("select * from departamento", new BeanPropertyRowMapper<>(Departamento.class));
    	System.out.println("####################################################");
    	System.out.println(jdbcTemplate.query("select * from departamento where departamento.id=1", new BeanPropertyRowMapper<>(Departamento.class)).get(0).getNombre());
        return jdbcTemplate.query("select * from departamento where departamento.id=1", new BeanPropertyRowMapper<>(Departamento.class));
    }
}