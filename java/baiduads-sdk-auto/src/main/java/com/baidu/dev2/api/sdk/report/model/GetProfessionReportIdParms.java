/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.report.model;

import java.util.Objects;
import java.util.Arrays;
import com.baidu.dev2.api.sdk.report.model.ReportRequestType;
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
 * GetProfessionReportIdParms
 */
@JsonPropertyOrder({
  GetProfessionReportIdParms.JSON_PROPERTY_REPORT_REQUEST_TYPE,
  GetProfessionReportIdParms.JSON_PROPERTY_REPORT_FLOW_TYPE
})
@JsonTypeName("GetProfessionReportIdParms")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GetProfessionReportIdParms {
  public static final String JSON_PROPERTY_REPORT_REQUEST_TYPE = "reportRequestType";
  private ReportRequestType reportRequestType;

  public static final String JSON_PROPERTY_REPORT_FLOW_TYPE = "reportFlowType";
  private Integer reportFlowType;

  public GetProfessionReportIdParms() { 
  }

  public GetProfessionReportIdParms reportRequestType(ReportRequestType reportRequestType) {
    
    this.reportRequestType = reportRequestType;
    return this;
  }

   /**
   * Get reportRequestType
   * @return reportRequestType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_REPORT_REQUEST_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ReportRequestType getReportRequestType() {
    return reportRequestType;
  }


  @JsonProperty(JSON_PROPERTY_REPORT_REQUEST_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReportRequestType(ReportRequestType reportRequestType) {
    this.reportRequestType = reportRequestType;
  }


  public GetProfessionReportIdParms reportFlowType(Integer reportFlowType) {
    
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
    GetProfessionReportIdParms getProfessionReportIdParms = (GetProfessionReportIdParms) o;
    return Objects.equals(this.reportRequestType, getProfessionReportIdParms.reportRequestType) &&
        Objects.equals(this.reportFlowType, getProfessionReportIdParms.reportFlowType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reportRequestType, reportFlowType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetProfessionReportIdParms {\n");
    sb.append("    reportRequestType: ").append(toIndentedString(reportRequestType)).append("\n");
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

