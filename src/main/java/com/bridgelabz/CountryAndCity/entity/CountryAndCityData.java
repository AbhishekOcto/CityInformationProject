package com.bridgelabz.CountryAndCity.entity;

import com.bridgelabz.CountryAndCity.dto.CountryAndCityDTO;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public @Data class CountryAndCityData {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String cityName;
    private int cityRanking;
    private String country;
    private String continent;

    public CountryAndCityData(int id, String cityName, int cityRanking, String country, String continent) {
        this.id = id;
        this.cityName = cityName;
        this.cityRanking = cityRanking;
        this.country = country;
        this.continent = continent;
    }

    public CountryAndCityData() {

    }

    public CountryAndCityData(CountryAndCityDTO countryAndCityDTO) {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityRanking() {
        return cityRanking;
    }

    public void setCityRanking(int cityRanking) {
        this.cityRanking = cityRanking;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }
}
