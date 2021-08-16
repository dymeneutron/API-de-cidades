package com.github.diegolacarvalho.cidadesapi.countries.repository;

import com.github.diegolacarvalho.cidadesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country,Long> {
}
