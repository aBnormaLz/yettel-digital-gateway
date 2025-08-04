package hu.yettel.homework.service.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public record ContactMedium(
    @JsonProperty("@type")
    String type,
    Boolean preferred,
    String contactType,
    ValidFor validFor,
    String phoneNumber,
    String city,
    String country,
    String postCode,
    String street1
) {
}
