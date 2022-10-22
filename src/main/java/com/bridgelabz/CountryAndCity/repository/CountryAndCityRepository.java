package com.bridgelabz.CountryAndCity.repository;

import com.bridgelabz.CountryAndCity.entity.CountryAndCityData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryAndCityRepository extends JpaRepository<CountryAndCityData, Integer> {
}
