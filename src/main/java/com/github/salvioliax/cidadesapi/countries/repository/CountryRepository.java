package com.github.salvioliax.cidadesapi.countries.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.salvioliax.cidadesapi.countries.Country;

public interface CountryRepository extends JpaRepository<Country, Long>{

}
