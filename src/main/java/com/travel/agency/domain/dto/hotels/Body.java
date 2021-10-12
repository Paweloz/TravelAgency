package com.travel.agency.domain.dto.hotels;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Body {
    @JsonProperty("propertyDescription")
    private PropertyDescription propertyDescription;
//    @JsonProperty("roomsAndRates")
//    private RoomsAndRates roomsAndRates;
}
