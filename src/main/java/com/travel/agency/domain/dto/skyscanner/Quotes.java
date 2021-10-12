package com.travel.agency.domain.dto.skyscanner;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Quotes {
    @JsonProperty("MinPrice")
    private BigDecimal flightPrice;
    @JsonProperty("Direct")
    private boolean direct;
    @JsonProperty("OutboundLeg")
    private OutboundLeg outboundLeg;
    @JsonProperty("InboundLeg")
    private InboundLeg inboundLeg;
}
