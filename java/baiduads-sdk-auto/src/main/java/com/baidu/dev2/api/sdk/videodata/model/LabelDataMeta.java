/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.videodata.model;

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
 * LabelDataMeta
 */
@JsonPropertyOrder({
  LabelDataMeta.JSON_PROPERTY_VIDEO_ID,
  LabelDataMeta.JSON_PROPERTY_POSITIVE_LABELS,
  LabelDataMeta.JSON_PROPERTY_NEGATIVE_LABELS
})
@JsonTypeName("LabelDataMeta")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class LabelDataMeta {
  public static final String JSON_PROPERTY_VIDEO_ID = "videoId";
  private Integer videoId;

  public static final String JSON_PROPERTY_POSITIVE_LABELS = "positiveLabels";
  private String positiveLabels;

  public static final String JSON_PROPERTY_NEGATIVE_LABELS = "negativeLabels";
  private String negativeLabels;

  public LabelDataMeta() { 
  }

  public LabelDataMeta videoId(Integer videoId) {
    
    this.videoId = videoId;
    return this;
  }

   /**
   * Get videoId
   * @return videoId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_VIDEO_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getVideoId() {
    return videoId;
  }


  @JsonProperty(JSON_PROPERTY_VIDEO_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVideoId(Integer videoId) {
    this.videoId = videoId;
  }


  public LabelDataMeta positiveLabels(String positiveLabels) {
    
    this.positiveLabels = positiveLabels;
    return this;
  }

   /**
   * Get positiveLabels
   * @return positiveLabels
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_POSITIVE_LABELS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPositiveLabels() {
    return positiveLabels;
  }


  @JsonProperty(JSON_PROPERTY_POSITIVE_LABELS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPositiveLabels(String positiveLabels) {
    this.positiveLabels = positiveLabels;
  }


  public LabelDataMeta negativeLabels(String negativeLabels) {
    
    this.negativeLabels = negativeLabels;
    return this;
  }

   /**
   * Get negativeLabels
   * @return negativeLabels
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NEGATIVE_LABELS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNegativeLabels() {
    return negativeLabels;
  }


  @JsonProperty(JSON_PROPERTY_NEGATIVE_LABELS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNegativeLabels(String negativeLabels) {
    this.negativeLabels = negativeLabels;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LabelDataMeta labelDataMeta = (LabelDataMeta) o;
    return Objects.equals(this.videoId, labelDataMeta.videoId) &&
        Objects.equals(this.positiveLabels, labelDataMeta.positiveLabels) &&
        Objects.equals(this.negativeLabels, labelDataMeta.negativeLabels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(videoId, positiveLabels, negativeLabels);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LabelDataMeta {\n");
    sb.append("    videoId: ").append(toIndentedString(videoId)).append("\n");
    sb.append("    positiveLabels: ").append(toIndentedString(positiveLabels)).append("\n");
    sb.append("    negativeLabels: ").append(toIndentedString(negativeLabels)).append("\n");
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

