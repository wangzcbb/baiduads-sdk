/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.dsareport.model;

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
 * GetCreativeGroupReportRequest
 */
@JsonPropertyOrder({
  GetCreativeGroupReportRequest.JSON_PROPERTY_DEVICE,
  GetCreativeGroupReportRequest.JSON_PROPERTY_PLAN_IDS,
  GetCreativeGroupReportRequest.JSON_PROPERTY_UNIT_IDS,
  GetCreativeGroupReportRequest.JSON_PROPERTY_CREATIVE_GROUP_IDS,
  GetCreativeGroupReportRequest.JSON_PROPERTY_START_TIME,
  GetCreativeGroupReportRequest.JSON_PROPERTY_END_TIME,
  GetCreativeGroupReportRequest.JSON_PROPERTY_TIME_DIM,
  GetCreativeGroupReportRequest.JSON_PROPERTY_REPORT_WEEK_DAY,
  GetCreativeGroupReportRequest.JSON_PROPERTY_LIMIT,
  GetCreativeGroupReportRequest.JSON_PROPERTY_OFFSET
})
@JsonTypeName("GetCreativeGroupReportRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GetCreativeGroupReportRequest {
  public static final String JSON_PROPERTY_DEVICE = "device";
  private Integer device;

  public static final String JSON_PROPERTY_PLAN_IDS = "planIds";
  private List<Long> planIds = null;

  public static final String JSON_PROPERTY_UNIT_IDS = "unitIds";
  private List<Long> unitIds = null;

  public static final String JSON_PROPERTY_CREATIVE_GROUP_IDS = "creativeGroupIds";
  private List<Long> creativeGroupIds = null;

  public static final String JSON_PROPERTY_START_TIME = "startTime";
  private String startTime;

  public static final String JSON_PROPERTY_END_TIME = "endTime";
  private String endTime;

  public static final String JSON_PROPERTY_TIME_DIM = "timeDim";
  private Integer timeDim;

  public static final String JSON_PROPERTY_REPORT_WEEK_DAY = "reportWeekDay";
  private Integer reportWeekDay;

  public static final String JSON_PROPERTY_LIMIT = "limit";
  private Integer limit;

  public static final String JSON_PROPERTY_OFFSET = "offset";
  private Integer offset;

  public GetCreativeGroupReportRequest() { 
  }

  public GetCreativeGroupReportRequest device(Integer device) {
    
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


  public GetCreativeGroupReportRequest planIds(List<Long> planIds) {
    
    this.planIds = planIds;
    return this;
  }

  public GetCreativeGroupReportRequest addPlanIdsItem(Long planIdsItem) {
    if (this.planIds == null) {
      this.planIds = new ArrayList<>();
    }
    this.planIds.add(planIdsItem);
    return this;
  }

   /**
   * Get planIds
   * @return planIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PLAN_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Long> getPlanIds() {
    return planIds;
  }


  @JsonProperty(JSON_PROPERTY_PLAN_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPlanIds(List<Long> planIds) {
    this.planIds = planIds;
  }


  public GetCreativeGroupReportRequest unitIds(List<Long> unitIds) {
    
    this.unitIds = unitIds;
    return this;
  }

  public GetCreativeGroupReportRequest addUnitIdsItem(Long unitIdsItem) {
    if (this.unitIds == null) {
      this.unitIds = new ArrayList<>();
    }
    this.unitIds.add(unitIdsItem);
    return this;
  }

   /**
   * Get unitIds
   * @return unitIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_UNIT_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Long> getUnitIds() {
    return unitIds;
  }


  @JsonProperty(JSON_PROPERTY_UNIT_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUnitIds(List<Long> unitIds) {
    this.unitIds = unitIds;
  }


  public GetCreativeGroupReportRequest creativeGroupIds(List<Long> creativeGroupIds) {
    
    this.creativeGroupIds = creativeGroupIds;
    return this;
  }

  public GetCreativeGroupReportRequest addCreativeGroupIdsItem(Long creativeGroupIdsItem) {
    if (this.creativeGroupIds == null) {
      this.creativeGroupIds = new ArrayList<>();
    }
    this.creativeGroupIds.add(creativeGroupIdsItem);
    return this;
  }

   /**
   * Get creativeGroupIds
   * @return creativeGroupIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CREATIVE_GROUP_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Long> getCreativeGroupIds() {
    return creativeGroupIds;
  }


  @JsonProperty(JSON_PROPERTY_CREATIVE_GROUP_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreativeGroupIds(List<Long> creativeGroupIds) {
    this.creativeGroupIds = creativeGroupIds;
  }


  public GetCreativeGroupReportRequest startTime(String startTime) {
    
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


  public GetCreativeGroupReportRequest endTime(String endTime) {
    
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


  public GetCreativeGroupReportRequest timeDim(Integer timeDim) {
    
    this.timeDim = timeDim;
    return this;
  }

   /**
   * Get timeDim
   * @return timeDim
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TIME_DIM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTimeDim() {
    return timeDim;
  }


  @JsonProperty(JSON_PROPERTY_TIME_DIM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTimeDim(Integer timeDim) {
    this.timeDim = timeDim;
  }


  public GetCreativeGroupReportRequest reportWeekDay(Integer reportWeekDay) {
    
    this.reportWeekDay = reportWeekDay;
    return this;
  }

   /**
   * Get reportWeekDay
   * @return reportWeekDay
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_REPORT_WEEK_DAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getReportWeekDay() {
    return reportWeekDay;
  }


  @JsonProperty(JSON_PROPERTY_REPORT_WEEK_DAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReportWeekDay(Integer reportWeekDay) {
    this.reportWeekDay = reportWeekDay;
  }


  public GetCreativeGroupReportRequest limit(Integer limit) {
    
    this.limit = limit;
    return this;
  }

   /**
   * Get limit
   * @return limit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getLimit() {
    return limit;
  }


  @JsonProperty(JSON_PROPERTY_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLimit(Integer limit) {
    this.limit = limit;
  }


  public GetCreativeGroupReportRequest offset(Integer offset) {
    
    this.offset = offset;
    return this;
  }

   /**
   * Get offset
   * @return offset
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_OFFSET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getOffset() {
    return offset;
  }


  @JsonProperty(JSON_PROPERTY_OFFSET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOffset(Integer offset) {
    this.offset = offset;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetCreativeGroupReportRequest getCreativeGroupReportRequest = (GetCreativeGroupReportRequest) o;
    return Objects.equals(this.device, getCreativeGroupReportRequest.device) &&
        Objects.equals(this.planIds, getCreativeGroupReportRequest.planIds) &&
        Objects.equals(this.unitIds, getCreativeGroupReportRequest.unitIds) &&
        Objects.equals(this.creativeGroupIds, getCreativeGroupReportRequest.creativeGroupIds) &&
        Objects.equals(this.startTime, getCreativeGroupReportRequest.startTime) &&
        Objects.equals(this.endTime, getCreativeGroupReportRequest.endTime) &&
        Objects.equals(this.timeDim, getCreativeGroupReportRequest.timeDim) &&
        Objects.equals(this.reportWeekDay, getCreativeGroupReportRequest.reportWeekDay) &&
        Objects.equals(this.limit, getCreativeGroupReportRequest.limit) &&
        Objects.equals(this.offset, getCreativeGroupReportRequest.offset);
  }

  @Override
  public int hashCode() {
    return Objects.hash(device, planIds, unitIds, creativeGroupIds, startTime, endTime, timeDim, reportWeekDay, limit, offset);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetCreativeGroupReportRequest {\n");
    sb.append("    device: ").append(toIndentedString(device)).append("\n");
    sb.append("    planIds: ").append(toIndentedString(planIds)).append("\n");
    sb.append("    unitIds: ").append(toIndentedString(unitIds)).append("\n");
    sb.append("    creativeGroupIds: ").append(toIndentedString(creativeGroupIds)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    timeDim: ").append(toIndentedString(timeDim)).append("\n");
    sb.append("    reportWeekDay: ").append(toIndentedString(reportWeekDay)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
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

