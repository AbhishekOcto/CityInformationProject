package com.bridgelabz.CountryAndCity.service;

import com.bridgelabz.CountryAndCity.dto.CountryAndCityDTO;
import com.bridgelabz.CountryAndCity.entity.CountryAndCityData;

import java.util.List;
import java.util.Optional;

public interface ICityService {
    List<CountryAndCityData> getCountryAndCityData();

    Optional<CountryAndCityData> getCountryAndCityDataById(int Id);

    CountryAndCityData createCountryAndCityData(CountryAndCityDTO countryAndCityDTO);
}
