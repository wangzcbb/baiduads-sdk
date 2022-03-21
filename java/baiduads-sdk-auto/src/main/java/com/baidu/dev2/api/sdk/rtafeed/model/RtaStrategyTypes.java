/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.rtafeed.model;

import java.util.Objects;
import java.util.Arrays;
import com.baidu.dev2.api.sdk.rtafeed.model.RtaStrategyType;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * RtaStrategyTypes
 */
@JsonPropertyOrder({
  RtaStrategyTypes.JSON_PROPERTY_TOTAL,
  RtaStrategyTypes.JSON_PROPERTY_RTA_STRATEGY_TYPES
})
@JsonTypeName("RtaStrategyTypes")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RtaStrategyTypes {
  public static final String JSON_PROPERTY_TOTAL = "total";
  private Integer total;

  public static final String JSON_PROPERTY_RTA_STRATEGY_TYPES = "rtaStrategyTypes";
  private List<RtaStrategyType> rtaStrategyTypes = null;

  public RtaStrategyTypes() { 
  }

  public RtaStrategyTypes total(Integer total) {
    
    this.total = total;
    return this;
  }

   /**
   * Get total
   * @return total
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TOTAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTotal() {
    return total;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTotal(Integer total) {
    this.total = total;
  }


  public RtaStrategyTypes rtaStrategyTypes(List<RtaStrategyType> rtaStrategyTypes) {
    
    this.rtaStrategyTypes = rtaStrategyTypes;
    return this;
  }

  public RtaStrategyTypes addRtaStrategyTypesItem(RtaStrategyType rtaStrategyTypesItem) {
    if (this.rtaStrategyTypes == null) {
      this.rtaStrategyTypes = new ArrayList<>();
    }
    this.rtaStrategyTypes.add(rtaStrategyTypesItem);
    return this;
  }

   /**
   * Get rtaStrategyTypes
   * @return rtaStrategyTypes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RTA_STRATEGY_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<RtaStrategyType> getRtaStrategyTypes() {
    return rtaStrategyTypes;
  }


  @JsonProperty(JSON_PROPERTY_RTA_STRATEGY_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRtaStrategyTypes(List<RtaStrategyType> rtaStrategyTypes) {
    this.rtaStrategyTypes = rtaStrategyTypes;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RtaStrategyTypes rtaStrategyTypes = (RtaStrategyTypes) o;
    return Objects.equals(this.total, rtaStrategyTypes.total) &&
        Objects.equals(this.rtaStrategyTypes, rtaStrategyTypes.rtaStrategyTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(total, rtaStrategyTypes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RtaStrategyTypes {\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    rtaStrategyTypes: ").append(toIndentedString(rtaStrategyTypes)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

