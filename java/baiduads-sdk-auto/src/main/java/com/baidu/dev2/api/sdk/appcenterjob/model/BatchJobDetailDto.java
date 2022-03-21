/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.appcenterjob.model;

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
 * BatchJobDetailDto
 */
@JsonPropertyOrder({
  BatchJobDetailDto.JSON_PROPERTY_PACKAGE_ID,
  BatchJobDetailDto.JSON_PROPERTY_CHANNEL_NAME,
  BatchJobDetailDto.JSON_PROPERTY_STATUS,
  BatchJobDetailDto.JSON_PROPERTY_RESULT_DESC
})
@JsonTypeName("BatchJobDetailDto")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class BatchJobDetailDto {
  public static final String JSON_PROPERTY_PACKAGE_ID = "packageId";
  private Long packageId;

  public static final String JSON_PROPERTY_CHANNEL_NAME = "channelName";
  private String channelName;

  public static final String JSON_PROPERTY_STATUS = "status";
  private String status;

  public static final String JSON_PROPERTY_RESULT_DESC = "resultDesc";
  private String resultDesc;

  public BatchJobDetailDto() { 
  }

  public BatchJobDetailDto packageId(Long packageId) {
    
    this.packageId = packageId;
    return this;
  }

   /**
   * Get packageId
   * @return packageId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PACKAGE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getPackageId() {
    return packageId;
  }


  @JsonProperty(JSON_PROPERTY_PACKAGE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPackageId(Long packageId) {
    this.packageId = packageId;
  }


  public BatchJobDetailDto channelName(String channelName) {
    
    this.channelName = channelName;
    return this;
  }

   /**
   * Get channelName
   * @return channelName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CHANNEL_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getChannelName() {
    return channelName;
  }


  @JsonProperty(JSON_PROPERTY_CHANNEL_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setChannelName(String channelName) {
    this.channelName = channelName;
  }


  public BatchJobDetailDto status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(String status) {
    this.status = status;
  }


  public BatchJobDetailDto resultDesc(String resultDesc) {
    
    this.resultDesc = resultDesc;
    return this;
  }

   /**
   * Get resultDesc
   * @return resultDesc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RESULT_DESC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getResultDesc() {
    return resultDesc;
  }


  @JsonProperty(JSON_PROPERTY_RESULT_DESC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResultDesc(String resultDesc) {
    this.resultDesc = resultDesc;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BatchJobDetailDto batchJobDetailDto = (BatchJobDetailDto) o;
    return Objects.equals(this.packageId, batchJobDetailDto.packageId) &&
        Objects.equals(this.channelName, batchJobDetailDto.channelName) &&
        Objects.equals(this.status, batchJobDetailDto.status) &&
        Objects.equals(this.resultDesc, batchJobDetailDto.resultDesc);
  }

  @Override
  public int hashCode() {
    return Objects.hash(packageId, channelName, status, resultDesc);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BatchJobDetailDto {\n");
    sb.append("    packageId: ").append(toIndentedString(packageId)).append("\n");
    sb.append("    channelName: ").append(toIndentedString(channelName)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    resultDesc: ").append(toIndentedString(resultDesc)).append("\n");
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

