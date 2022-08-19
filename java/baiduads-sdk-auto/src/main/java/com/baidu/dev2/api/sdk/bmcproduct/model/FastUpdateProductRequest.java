/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.bmcproduct.model;

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
 * FastUpdateProductRequest
 */
@JsonPropertyOrder({
  FastUpdateProductRequest.JSON_PROPERTY_OUTER_ID,
  FastUpdateProductRequest.JSON_PROPERTY_CATALOG_ID,
  FastUpdateProductRequest.JSON_PROPERTY_PROPERTIES
})
@JsonTypeName("FastUpdateProductRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class FastUpdateProductRequest {
  public static final String JSON_PROPERTY_OUTER_ID = "outerId";
  private String outerId;

  public static final String JSON_PROPERTY_CATALOG_ID = "catalogId";
  private Long catalogId;

  public static final String JSON_PROPERTY_PROPERTIES = "properties";
  private java.util.Map properties;

  public FastUpdateProductRequest() { 
  }

  public FastUpdateProductRequest outerId(String outerId) {
    
    this.outerId = outerId;
    return this;
  }

   /**
   * Get outerId
   * @return outerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_OUTER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOuterId() {
    return outerId;
  }


  @JsonProperty(JSON_PROPERTY_OUTER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOuterId(String outerId) {
    this.outerId = outerId;
  }


  public FastUpdateProductRequest catalogId(Long catalogId) {
    
    this.catalogId = catalogId;
    return this;
  }

   /**
   * Get catalogId
   * @return catalogId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CATALOG_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getCatalogId() {
    return catalogId;
  }


  @JsonProperty(JSON_PROPERTY_CATALOG_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCatalogId(Long catalogId) {
    this.catalogId = catalogId;
  }


  public FastUpdateProductRequest properties(java.util.Map properties) {
    
    this.properties = properties;
    return this;
  }

   /**
   * Get properties
   * @return properties
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PROPERTIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.util.Map getProperties() {
    return properties;
  }


  @JsonProperty(JSON_PROPERTY_PROPERTIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProperties(java.util.Map properties) {
    this.properties = properties;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FastUpdateProductRequest fastUpdateProductRequest = (FastUpdateProductRequest) o;
    return Objects.equals(this.outerId, fastUpdateProductRequest.outerId) &&
        Objects.equals(this.catalogId, fastUpdateProductRequest.catalogId) &&
        Objects.equals(this.properties, fastUpdateProductRequest.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(outerId, catalogId, properties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FastUpdateProductRequest {\n");
    sb.append("    outerId: ").append(toIndentedString(outerId)).append("\n");
    sb.append("    catalogId: ").append(toIndentedString(catalogId)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
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

