package com.github.diegolacarvalho.cidadesapi;



import com.github.diegolacarvalho.cidadesapi.countries.Country;
import com.github.diegolacarvalho.cidadesapi.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/countries")
public class CountryResource {

    @Autowired
    private CountryRepository repository;


    @GetMapping
    public List<Country> countries(){
    return repository.findAll();




    }
}
