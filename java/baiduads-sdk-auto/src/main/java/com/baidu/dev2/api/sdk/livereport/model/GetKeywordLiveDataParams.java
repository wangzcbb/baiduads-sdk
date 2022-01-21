/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.livereport.model;

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
 * GetKeywordLiveDataParams
 */
@JsonPropertyOrder({
  GetKeywordLiveDataParams.JSON_PROPERTY_KEYWORD_IDS,
  GetKeywordLiveDataParams.JSON_PROPERTY_DEVICE,
  GetKeywordLiveDataParams.JSON_PROPERTY_START_TIME,
  GetKeywordLiveDataParams.JSON_PROPERTY_END_TIME,
  GetKeywordLiveDataParams.JSON_PROPERTY_REGION_TARGET
})
@JsonTypeName("GetKeywordLiveDataParams")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GetKeywordLiveDataParams {
  public static final String JSON_PROPERTY_KEYWORD_IDS = "keywordIds";
  private List<Long> keywordIds = null;

  public static final String JSON_PROPERTY_DEVICE = "device";
  private Integer device;

  public static final String JSON_PROPERTY_START_TIME = "startTime";
  private String startTime;

  public static final String JSON_PROPERTY_END_TIME = "endTime";
  private String endTime;

  public static final String JSON_PROPERTY_REGION_TARGET = "regionTarget";
  private List<Integer> regionTarget = null;

  public GetKeywordLiveDataParams() { 
  }

  public GetKeywordLiveDataParams keywordIds(List<Long> keywordIds) {
    
    this.keywordIds = keywordIds;
    return this;
  }

  public GetKeywordLiveDataParams addKeywordIdsItem(Long keywordIdsItem) {
    if (this.keywordIds == null) {
      this.keywordIds = new ArrayList<>();
    }
    this.keywordIds.add(keywordIdsItem);
    return this;
  }

   /**
   * Get keywordIds
   * @return keywordIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_KEYWORD_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Long> getKeywordIds() {
    return keywordIds;
  }


  @JsonProperty(JSON_PROPERTY_KEYWORD_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKeywordIds(List<Long> keywordIds) {
    this.keywordIds = keywordIds;
  }


  public GetKeywordLiveDataParams device(Integer device) {
    
    this.device = device;
    return this;
  }

   /**
   * Get device
   * @return device
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DEVICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getDevice() {
    return device;
  }


  @JsonProperty(JSON_PROPERTY_DEVICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDevice(Integer device) {
    this.device = device;
  }


  public GetKeywordLiveDataParams startTime(String startTime) {
    
    this.startTime = startTime;
    return this;
  }

   /**
   * Get startTime
   * @return startTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_START_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStartTime() {
    return startTime;
  }


  @JsonProperty(JSON_PROPERTY_START_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }


  public GetKeywordLiveDataParams endTime(String endTime) {
    
    this.endTime = endTime;
    return this;
  }

   /**
   * Get endTime
   * @return endTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_END_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEndTime() {
    return endTime;
  }


  @JsonProperty(JSON_PROPERTY_END_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }


  public GetKeywordLiveDataParams regionTarget(List<Integer> regionTarget) {
    
    this.regionTarget = regionTarget;
    return this;
  }

  public GetKeywordLiveDataParams addRegionTargetItem(Integer regionTargetItem) {
    if (this.regionTarget == null) {
      this.regionTarget = new ArrayList<>();
    }
    this.regionTarget.add(regionTargetItem);
    return this;
  }

   /**
   * Get regionTarget
   * @return regionTarget
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_REGION_TARGET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Integer> getRegionTarget() {
    return regionTarget;
  }


  @JsonProperty(JSON_PROPERTY_REGION_TARGET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRegionTarget(List<Integer> regionTarget) {
    this.regionTarget = regionTarget;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetKeywordLiveDataParams getKeywordLiveDataParams = (GetKeywordLiveDataParams) o;
    return Objects.equals(this.keywordIds, getKeywordLiveDataParams.keywordIds) &&
        Objects.equals(this.device, getKeywordLiveDataParams.device) &&
        Objects.equals(this.startTime, getKeywordLiveDataParams.startTime) &&
        Objects.equals(this.endTime, getKeywordLiveDataParams.endTime) &&
        Objects.equals(this.regionTarget, getKeywordLiveDataParams.regionTarget);
  }

  @Override
  public int hashCode() {
    return Objects.hash(keywordIds, device, startTime, endTime, regionTarget);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetKeywordLiveDataParams {\n");
    sb.append("    keywordIds: ").append(toIndentedString(keywordIds)).append("\n");
    sb.append("    device: ").append(toIndentedString(device)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    regionTarget: ").append(toIndentedString(regionTarget)).append("\n");
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

