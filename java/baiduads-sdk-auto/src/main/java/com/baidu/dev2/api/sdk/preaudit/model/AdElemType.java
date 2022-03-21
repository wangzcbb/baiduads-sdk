/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.preaudit.model;

import java.util.Objects;
import java.util.Arrays;
import com.baidu.dev2.api.sdk.preaudit.model.AdContItemType;
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
 * AdElemType
 */
@JsonPropertyOrder({
  AdElemType.JSON_PROPERTY_TYPE,
  AdElemType.JSON_PROPERTY_AD_CONTS
})
@JsonTypeName("AdElemType")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AdElemType {
  public static final String JSON_PROPERTY_TYPE = "type";
  private Integer type;

  public static final String JSON_PROPERTY_AD_CONTS = "adConts";
  private List<AdContItemType> adConts = null;

  public AdElemType() { 
  }

  public AdElemType type(Integer type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(Integer type) {
    this.type = type;
  }


  public AdElemType adConts(List<AdContItemType> adConts) {
    
    this.adConts = adConts;
    return this;
  }

  public AdElemType addAdContsItem(AdContItemType adContsItem) {
    if (this.adConts == null) {
      this.adConts = new ArrayList<>();
    }
    this.adConts.add(adContsItem);
    return this;
  }

   /**
   * Get adConts
   * @return adConts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AD_CONTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<AdContItemType> getAdConts() {
    return adConts;
  }


  @JsonProperty(JSON_PROPERTY_AD_CONTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdConts(List<AdContItemType> adConts) {
    this.adConts = adConts;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdElemType adElemType = (AdElemType) o;
    return Objects.equals(this.type, adElemType.type) &&
        Objects.equals(this.adConts, adElemType.adConts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, adConts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdElemType {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    adConts: ").append(toIndentedString(adConts)).append("\n");
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

