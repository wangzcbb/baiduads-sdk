/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.negativeword.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * CampaignDistanceRangeFactor
 */
@JsonPropertyOrder({
  CampaignDistanceRangeFactor.JSON_PROPERTY_FACTOR_ID,
  CampaignDistanceRangeFactor.JSON_PROPERTY_TYPE,
  CampaignDistanceRangeFactor.JSON_PROPERTY_R_ID,
  CampaignDistanceRangeFactor.JSON_PROPERTY_PRICE_FACTOR,
  CampaignDistanceRangeFactor.JSON_PROPERTY_STATUS
})
@JsonTypeName("CampaignDistanceRangeFactor")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CampaignDistanceRangeFactor {
  public static final String JSON_PROPERTY_FACTOR_ID = "factorId";
  private Long factorId;

  public static final String JSON_PROPERTY_TYPE = "type";
  private Long type;

  public static final String JSON_PROPERTY_R_ID = "rId";
  private Long rId;

  public static final String JSON_PROPERTY_PRICE_FACTOR = "priceFactor";
  private Double priceFactor;

  public static final String JSON_PROPERTY_STATUS = "status";
  private Long status;

  public CampaignDistanceRangeFactor() { 
  }

  public CampaignDistanceRangeFactor factorId(Long factorId) {
    
    this.factorId = factorId;
    return this;
  }

   /**
   * Get factorId
   * @return factorId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FACTOR_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getFactorId() {
    return factorId;
  }


  @JsonProperty(JSON_PROPERTY_FACTOR_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFactorId(Long factorId) {
    this.factorId = factorId;
  }


  public CampaignDistanceRangeFactor type(Long type) {
    
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

  public Long getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(Long type) {
    this.type = type;
  }


  public CampaignDistanceRangeFactor rId(Long rId) {
    
    this.rId = rId;
    return this;
  }

   /**
   * Get rId
   * @return rId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_R_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getrId() {
    return rId;
  }


  @JsonProperty(JSON_PROPERTY_R_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setrId(Long rId) {
    this.rId = rId;
  }


  public CampaignDistanceRangeFactor priceFactor(Double priceFactor) {
    
    this.priceFactor = priceFactor;
    return this;
  }

   /**
   * Get priceFactor
   * @return priceFactor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PRICE_FACTOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getPriceFactor() {
    return priceFactor;
  }


  @JsonProperty(JSON_PROPERTY_PRICE_FACTOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPriceFactor(Double priceFactor) {
    this.priceFactor = priceFactor;
  }


  public CampaignDistanceRangeFactor status(Long status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(Long status) {
    this.status = status;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignDistanceRangeFactor campaignDistanceRangeFactor = (CampaignDistanceRangeFactor) o;
    return Objects.equals(this.factorId, campaignDistanceRangeFactor.factorId) &&
        Objects.equals(this.type, campaignDistanceRangeFactor.type) &&
        Objects.equals(this.rId, campaignDistanceRangeFactor.rId) &&
        Objects.equals(this.priceFactor, campaignDistanceRangeFactor.priceFactor) &&
        Objects.equals(this.status, campaignDistanceRangeFactor.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(factorId, type, rId, priceFactor, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignDistanceRangeFactor {\n");
    sb.append("    factorId: ").append(toIndentedString(factorId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    rId: ").append(toIndentedString(rId)).append("\n");
    sb.append("    priceFactor: ").append(toIndentedString(priceFactor)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

