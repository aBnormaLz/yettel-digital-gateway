package hu.yettel.homework.service.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public record EngagedParty(
    @JsonProperty("@type")
    String type,
    String href,
    String id,
    String name,
    @JsonProperty("@referredType")
    String referredType
) {
}
