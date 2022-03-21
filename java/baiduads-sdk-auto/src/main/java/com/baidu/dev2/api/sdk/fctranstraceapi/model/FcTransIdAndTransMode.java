/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.fctranstraceapi.model;

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
 * FcTransIdAndTransMode
 */
@JsonPropertyOrder({
  FcTransIdAndTransMode.JSON_PROPERTY_TRANS_ID,
  FcTransIdAndTransMode.JSON_PROPERTY_TRANS_MODE
})
@JsonTypeName("FcTransIdAndTransMode")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class FcTransIdAndTransMode {
  public static final String JSON_PROPERTY_TRANS_ID = "transId";
  private Long transId;

  public static final String JSON_PROPERTY_TRANS_MODE = "transMode";
  private Integer transMode;

  public FcTransIdAndTransMode() { 
  }

  public FcTransIdAndTransMode transId(Long transId) {
    
    this.transId = transId;
    return this;
  }

   /**
   * Get transId
   * @return transId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TRANS_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getTransId() {
    return transId;
  }


  @JsonProperty(JSON_PROPERTY_TRANS_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTransId(Long transId) {
    this.transId = transId;
  }


  public FcTransIdAndTransMode transMode(Integer transMode) {
    
    this.transMode = transMode;
    return this;
  }

   /**
   * Get transMode
   * @return transMode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TRANS_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTransMode() {
    return transMode;
  }


  @JsonProperty(JSON_PROPERTY_TRANS_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTransMode(Integer transMode) {
    this.transMode = transMode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FcTransIdAndTransMode fcTransIdAndTransMode = (FcTransIdAndTransMode) o;
    return Objects.equals(this.transId, fcTransIdAndTransMode.transId) &&
        Objects.equals(this.transMode, fcTransIdAndTransMode.transMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transId, transMode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FcTransIdAndTransMode {\n");
    sb.append("    transId: ").append(toIndentedString(transId)).append("\n");
    sb.append("    transMode: ").append(toIndentedString(transMode)).append("\n");
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

