package com.bridgelabz.CountryAndCity.controllers;

import com.bridgelabz.CountryAndCity.dto.CountryAndCityDTO;
import com.bridgelabz.CountryAndCity.dto.ResponseDTO;
import com.bridgelabz.CountryAndCity.entity.CountryAndCityData;
import com.bridgelabz.CountryAndCity.service.CityServiceImpl;
import com.bridgelabz.CountryAndCity.service.ICityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/city")
public class CountryAndCityController {
    @Autowired
    ICityService cityServiceImpl;

    @RequestMapping(value = {"","/","/get"})
    public ResponseEntity<ResponseDTO> getCountryAndCityData()
    {
        List<CountryAndCityData> cityList = null;
        cityList = cityServiceImpl.getCountryAndCityData();
        ResponseDTO respDTO = new ResponseDTO("Get Call Success", cityList);
        return new ResponseEntity<ResponseDTO> (respDTO, HttpStatus.OK);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<ResponseDTO> getCountryAndCityData(@PathVariable("id") int id)
    {
        Optional<CountryAndCityData> countryAndCityData = null;
        countryAndCityData =cityServiceImpl.getCountryAndCityDataById(id);
        ResponseDTO respDTO = new ResponseDTO("Get Call for Id Successfull", countryAndCityData);
        return new ResponseEntity<ResponseDTO> (respDTO, HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<ResponseDTO> createCountryAndCityData(@RequestBody CountryAndCityDTO countryAndCityDTO){
        CountryAndCityData countryAndCityData = null;
        countryAndCityData = cityServiceImpl.createCountryAndCityData(countryAndCityDTO);
        ResponseDTO respDTO = new ResponseDTO("Created Data Successfully", countryAndCityData);
        return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
    }
}
