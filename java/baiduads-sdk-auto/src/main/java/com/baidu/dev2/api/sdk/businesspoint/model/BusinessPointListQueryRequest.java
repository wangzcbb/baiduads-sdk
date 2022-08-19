/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.businesspoint.model;

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
 * BusinessPointListQueryRequest
 */
@JsonPropertyOrder({
  BusinessPointListQueryRequest.JSON_PROPERTY_NEED_PATH
})
@JsonTypeName("BusinessPointListQueryRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class BusinessPointListQueryRequest {
  public static final String JSON_PROPERTY_NEED_PATH = "needPath";
  private Boolean needPath;

  public BusinessPointListQueryRequest() { 
  }

  public BusinessPointListQueryRequest needPath(Boolean needPath) {
    
    this.needPath = needPath;
    return this;
  }

   /**
   * Get needPath
   * @return needPath
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NEED_PATH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getNeedPath() {
    return needPath;
  }


  @JsonProperty(JSON_PROPERTY_NEED_PATH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNeedPath(Boolean needPath) {
    this.needPath = needPath;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BusinessPointListQueryRequest businessPointListQueryRequest = (BusinessPointListQueryRequest) o;
    return Objects.equals(this.needPath, businessPointListQueryRequest.needPath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(needPath);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BusinessPointListQueryRequest {\n");
    sb.append("    needPath: ").append(toIndentedString(needPath)).append("\n");
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

