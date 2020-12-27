package com.geovani.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.geovani.cursomc.domain.City;

@Repository
public interface CityRepository extends JpaRepository<City, Integer>{}
