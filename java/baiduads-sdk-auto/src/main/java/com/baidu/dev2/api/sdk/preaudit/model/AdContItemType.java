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
 * AdContItemType
 */
@JsonPropertyOrder({
  AdContItemType.JSON_PROPERTY_INDEX,
  AdContItemType.JSON_PROPERTY_CONT
})
@JsonTypeName("AdContItemType")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AdContItemType {
  public static final String JSON_PROPERTY_INDEX = "index";
  private Integer index;

  public static final String JSON_PROPERTY_CONT = "cont";
  private String cont;

  public AdContItemType() { 
  }

  public AdContItemType index(Integer index) {
    
    this.index = index;
    return this;
  }

   /**
   * Get index
   * @return index
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getIndex() {
    return index;
  }


  @JsonProperty(JSON_PROPERTY_INDEX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIndex(Integer index) {
    this.index = index;
  }


  public AdContItemType cont(String cont) {
    
    this.cont = cont;
    return this;
  }

   /**
   * Get cont
   * @return cont
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CONT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCont() {
    return cont;
  }


  @JsonProperty(JSON_PROPERTY_CONT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCont(String cont) {
    this.cont = cont;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdContItemType adContItemType = (AdContItemType) o;
    return Objects.equals(this.index, adContItemType.index) &&
        Objects.equals(this.cont, adContItemType.cont);
  }

  @Override
  public int hashCode() {
    return Objects.hash(index, cont);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdContItemType {\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    cont: ").append(toIndentedString(cont)).append("\n");
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

