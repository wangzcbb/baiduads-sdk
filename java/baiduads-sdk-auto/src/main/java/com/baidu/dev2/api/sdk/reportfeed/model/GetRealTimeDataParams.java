/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.reportfeed.model;

import java.util.Objects;
import java.util.Arrays;
import com.baidu.dev2.api.sdk.reportfeed.model.ReportRequestType;
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
 * GetRealTimeDataParams
 */
@JsonPropertyOrder({
  GetRealTimeDataParams.JSON_PROPERTY_REAL_TIME_REQUEST_TYPE,
  GetRealTimeDataParams.JSON_PROPERTY_REPORT_FLOW_TYPE
})
@JsonTypeName("GetRealTimeDataParams")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GetRealTimeDataParams {
  public static final String JSON_PROPERTY_REAL_TIME_REQUEST_TYPE = "realTimeRequestType";
  private ReportRequestType realTimeRequestType;

  public static final String JSON_PROPERTY_REPORT_FLOW_TYPE = "reportFlowType";
  private Integer reportFlowType;

  public GetRealTimeDataParams() { 
  }

  public GetRealTimeDataParams realTimeRequestType(ReportRequestType realTimeRequestType) {
    
    this.realTimeRequestType = realTimeRequestType;
    return this;
  }

   /**
   * Get realTimeRequestType
   * @return realTimeRequestType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_REAL_TIME_REQUEST_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ReportRequestType getRealTimeRequestType() {
    return realTimeRequestType;
  }


  @JsonProperty(JSON_PROPERTY_REAL_TIME_REQUEST_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRealTimeRequestType(ReportRequestType realTimeRequestType) {
    this.realTimeRequestType = realTimeRequestType;
  }


  public GetRealTimeDataParams reportFlowType(Integer reportFlowType) {
    
    this.reportFlowType = reportFlowType;
    return this;
  }

   /**
   * Get reportFlowType
   * @return reportFlowType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_REPORT_FLOW_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getReportFlowType() {
    return reportFlowType;
  }


  @JsonProperty(JSON_PROPERTY_REPORT_FLOW_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReportFlowType(Integer reportFlowType) {
    this.reportFlowType = reportFlowType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetRealTimeDataParams getRealTimeDataParams = (GetRealTimeDataParams) o;
    return Objects.equals(this.realTimeRequestType, getRealTimeDataParams.realTimeRequestType) &&
        Objects.equals(this.reportFlowType, getRealTimeDataParams.reportFlowType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(realTimeRequestType, reportFlowType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetRealTimeDataParams {\n");
    sb.append("    realTimeRequestType: ").append(toIndentedString(realTimeRequestType)).append("\n");
    sb.append("    reportFlowType: ").append(toIndentedString(reportFlowType)).append("\n");
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

