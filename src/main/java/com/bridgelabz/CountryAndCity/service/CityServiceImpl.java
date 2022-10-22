package com.bridgelabz.CountryAndCity.service;

import com.bridgelabz.CountryAndCity.dto.CountryAndCityDTO;
import com.bridgelabz.CountryAndCity.entity.CountryAndCityData;
import com.bridgelabz.CountryAndCity.repository.CountryAndCityRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class CityServiceImpl implements ICityService{
    @Autowired
    private CountryAndCityRepository countryAndCityRepository;

    private List<CountryAndCityData> cityList = new ArrayList<>();

    @Override
    public List<CountryAndCityData> getCountryAndCityData() {
        return cityList;
    }

    @Override
    public Optional<CountryAndCityData> getCountryAndCityDataById(int Id) {
        return cityList.stream()
                .filter(countryAndCityData ->countryAndCityData.getId() == Id)
                .findFirst();
    }

    @Override
    public CountryAndCityData createCountryAndCityData(CountryAndCityDTO countryAndCityDTO) {
        CountryAndCityData countryAndCityData = null;
        countryAndCityData = new CountryAndCityData(countryAndCityDTO);
        cityList.add(countryAndCityData);
        return countryAndCityRepository.save(countryAndCityData);
    }

}
