package com.travel.agency.domain.dto.hotels;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class FetchedHotelsDto {
    @JsonProperty("term")
    private String location;
    @JsonProperty("suggestions")
    private List<Suggestions> suggestions;
}
