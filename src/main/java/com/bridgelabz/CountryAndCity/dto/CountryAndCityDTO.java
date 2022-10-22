package com.bridgelabz.CountryAndCity.dto;

import lombok.Data;
import lombok.ToString;

@Data
public @ToString class CountryAndCityDTO {

    private String cityName;
    private int cityRanking;
    private String country;
    private String continent;

}
