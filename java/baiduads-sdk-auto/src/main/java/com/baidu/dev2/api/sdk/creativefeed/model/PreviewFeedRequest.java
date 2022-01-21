/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.creativefeed.model;

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
 * PreviewFeedRequest
 */
@JsonPropertyOrder({
  PreviewFeedRequest.JSON_PROPERTY_CREATIVE_FEED_ID,
  PreviewFeedRequest.JSON_PROPERTY_PREVIEW_SOURCE
})
@JsonTypeName("PreviewFeedRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PreviewFeedRequest {
  public static final String JSON_PROPERTY_CREATIVE_FEED_ID = "creativeFeedId";
  private Long creativeFeedId;

  public static final String JSON_PROPERTY_PREVIEW_SOURCE = "previewSource";
  private String previewSource;

  public PreviewFeedRequest() { 
  }

  public PreviewFeedRequest creativeFeedId(Long creativeFeedId) {
    
    this.creativeFeedId = creativeFeedId;
    return this;
  }

   /**
   * Get creativeFeedId
   * @return creativeFeedId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CREATIVE_FEED_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getCreativeFeedId() {
    return creativeFeedId;
  }


  @JsonProperty(JSON_PROPERTY_CREATIVE_FEED_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreativeFeedId(Long creativeFeedId) {
    this.creativeFeedId = creativeFeedId;
  }


  public PreviewFeedRequest previewSource(String previewSource) {
    
    this.previewSource = previewSource;
    return this;
  }

   /**
   * Get previewSource
   * @return previewSource
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PREVIEW_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPreviewSource() {
    return previewSource;
  }


  @JsonProperty(JSON_PROPERTY_PREVIEW_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPreviewSource(String previewSource) {
    this.previewSource = previewSource;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PreviewFeedRequest previewFeedRequest = (PreviewFeedRequest) o;
    return Objects.equals(this.creativeFeedId, previewFeedRequest.creativeFeedId) &&
        Objects.equals(this.previewSource, previewFeedRequest.previewSource);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creativeFeedId, previewSource);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PreviewFeedRequest {\n");
    sb.append("    creativeFeedId: ").append(toIndentedString(creativeFeedId)).append("\n");
    sb.append("    previewSource: ").append(toIndentedString(previewSource)).append("\n");
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

