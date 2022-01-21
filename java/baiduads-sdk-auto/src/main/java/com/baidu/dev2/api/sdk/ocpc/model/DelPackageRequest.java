/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.ocpc.model;

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
 * DelPackageRequest
 */
@JsonPropertyOrder({
  DelPackageRequest.JSON_PROPERTY_TARGET_PACKAGE_IDS
})
@JsonTypeName("DelPackageRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DelPackageRequest {
  public static final String JSON_PROPERTY_TARGET_PACKAGE_IDS = "targetPackageIds";
  private List<Long> targetPackageIds = null;

  public DelPackageRequest() { 
  }

  public DelPackageRequest targetPackageIds(List<Long> targetPackageIds) {
    
    this.targetPackageIds = targetPackageIds;
    return this;
  }

  public DelPackageRequest addTargetPackageIdsItem(Long targetPackageIdsItem) {
    if (this.targetPackageIds == null) {
      this.targetPackageIds = new ArrayList<>();
    }
    this.targetPackageIds.add(targetPackageIdsItem);
    return this;
  }

   /**
   * Get targetPackageIds
   * @return targetPackageIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TARGET_PACKAGE_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Long> getTargetPackageIds() {
    return targetPackageIds;
  }


  @JsonProperty(JSON_PROPERTY_TARGET_PACKAGE_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTargetPackageIds(List<Long> targetPackageIds) {
    this.targetPackageIds = targetPackageIds;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DelPackageRequest delPackageRequest = (DelPackageRequest) o;
    return Objects.equals(this.targetPackageIds, delPackageRequest.targetPackageIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(targetPackageIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DelPackageRequest {\n");
    sb.append("    targetPackageIds: ").append(toIndentedString(targetPackageIds)).append("\n");
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

