package hu.yettel.homework.service.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public record Customer(
    @JsonProperty("@type")
    String type,
    String href,
    String id,
    String name,
    String status,
    EngagedParty engagedParty,
    List<ContactMedium> contactMedium,
    List<RelatedParty> relatedParty
) {
}
