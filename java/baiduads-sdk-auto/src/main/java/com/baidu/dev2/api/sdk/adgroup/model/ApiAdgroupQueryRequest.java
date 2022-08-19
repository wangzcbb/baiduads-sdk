/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.adgroup.model;

import java.util.Objects;
import java.util.Arrays;
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
 * ApiAdgroupQueryRequest
 */
@JsonPropertyOrder({
  ApiAdgroupQueryRequest.JSON_PROPERTY_IDS,
  ApiAdgroupQueryRequest.JSON_PROPERTY_ADGROUP_FIELDS,
  ApiAdgroupQueryRequest.JSON_PROPERTY_ID_TYPE,
  ApiAdgroupQueryRequest.JSON_PROPERTY_GET_TEMP
})
@JsonTypeName("ApiAdgroupQueryRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ApiAdgroupQueryRequest {
  public static final String JSON_PROPERTY_IDS = "ids";
  private List<Long> ids = null;

  public static final String JSON_PROPERTY_ADGROUP_FIELDS = "adgroupFields";
  private List<String> adgroupFields = null;

  public static final String JSON_PROPERTY_ID_TYPE = "idType";
  private Integer idType;

  public static final String JSON_PROPERTY_GET_TEMP = "getTemp";
  private Integer getTemp;

  public ApiAdgroupQueryRequest() { 
  }

  public ApiAdgroupQueryRequest ids(List<Long> ids) {
    
    this.ids = ids;
    return this;
  }

  public ApiAdgroupQueryRequest addIdsItem(Long idsItem) {
    if (this.ids == null) {
      this.ids = new ArrayList<>();
    }
    this.ids.add(idsItem);
    return this;
  }

   /**
   * Get ids
   * @return ids
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Long> getIds() {
    return ids;
  }


  @JsonProperty(JSON_PROPERTY_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIds(List<Long> ids) {
    this.ids = ids;
  }


  public ApiAdgroupQueryRequest adgroupFields(List<String> adgroupFields) {
    
    this.adgroupFields = adgroupFields;
    return this;
  }

  public ApiAdgroupQueryRequest addAdgroupFieldsItem(String adgroupFieldsItem) {
    if (this.adgroupFields == null) {
      this.adgroupFields = new ArrayList<>();
    }
    this.adgroupFields.add(adgroupFieldsItem);
    return this;
  }

   /**
   * Get adgroupFields
   * @return adgroupFields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ADGROUP_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getAdgroupFields() {
    return adgroupFields;
  }


  @JsonProperty(JSON_PROPERTY_ADGROUP_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdgroupFields(List<String> adgroupFields) {
    this.adgroupFields = adgroupFields;
  }


  public ApiAdgroupQueryRequest idType(Integer idType) {
    
    this.idType = idType;
    return this;
  }

   /**
   * Get idType
   * @return idType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ID_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getIdType() {
    return idType;
  }


  @JsonProperty(JSON_PROPERTY_ID_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIdType(Integer idType) {
    this.idType = idType;
  }


  public ApiAdgroupQueryRequest getTemp(Integer getTemp) {
    
    this.getTemp = getTemp;
    return this;
  }

   /**
   * Get getTemp
   * @return getTemp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_GET_TEMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getGetTemp() {
    return getTemp;
  }


  @JsonProperty(JSON_PROPERTY_GET_TEMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGetTemp(Integer getTemp) {
    this.getTemp = getTemp;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiAdgroupQueryRequest apiAdgroupQueryRequest = (ApiAdgroupQueryRequest) o;
    return Objects.equals(this.ids, apiAdgroupQueryRequest.ids) &&
        Objects.equals(this.adgroupFields, apiAdgroupQueryRequest.adgroupFields) &&
        Objects.equals(this.idType, apiAdgroupQueryRequest.idType) &&
        Objects.equals(this.getTemp, apiAdgroupQueryRequest.getTemp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ids, adgroupFields, idType, getTemp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiAdgroupQueryRequest {\n");
    sb.append("    ids: ").append(toIndentedString(ids)).append("\n");
    sb.append("    adgroupFields: ").append(toIndentedString(adgroupFields)).append("\n");
    sb.append("    idType: ").append(toIndentedString(idType)).append("\n");
    sb.append("    getTemp: ").append(toIndentedString(getTemp)).append("\n");
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

