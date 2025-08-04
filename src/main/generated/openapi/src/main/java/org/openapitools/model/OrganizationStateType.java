package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Valid values for the lifecycle state of the organization
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-08-04T19:13:14.807273600+02:00[Europe/Budapest]", comments = "Generator version: 7.4.0")
public enum OrganizationStateType {
  
  INITIALIZED("initialized"),
  
  VALIDATED("validated"),
  
  CLOSED("closed");

  private String value;

  OrganizationStateType(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static OrganizationStateType fromValue(String value) {
    for (OrganizationStateType b : OrganizationStateType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

