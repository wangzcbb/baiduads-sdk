/*
 * dev2 api schema
 * 'dev2.baidu.com' api schema
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.baidu.dev2.api.sdk.advice.model;

import java.util.Objects;
import java.util.Arrays;
import com.baidu.dev2.api.sdk.advice.model.PictureType;
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
 * VideoType
 */
@JsonPropertyOrder({
  VideoType.JSON_PROPERTY_VIDEO_ID,
  VideoType.JSON_PROPERTY_VIDEO_URL,
  VideoType.JSON_PROPERTY_WIDTH,
  VideoType.JSON_PROPERTY_HEIGHT,
  VideoType.JSON_PROPERTY_POSTER,
  VideoType.JSON_PROPERTY_HORIZONTAL_COVER,
  VideoType.JSON_PROPERTY_DURATION
})
@JsonTypeName("VideoType")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class VideoType {
  public static final String JSON_PROPERTY_VIDEO_ID = "videoId";
  private Long videoId;

  public static final String JSON_PROPERTY_VIDEO_URL = "videoUrl";
  private String videoUrl;

  public static final String JSON_PROPERTY_WIDTH = "width";
  private Integer width;

  public static final String JSON_PROPERTY_HEIGHT = "height";
  private Integer height;

  public static final String JSON_PROPERTY_POSTER = "poster";
  private List<PictureType> poster = null;

  public static final String JSON_PROPERTY_HORIZONTAL_COVER = "horizontalCover";
  private List<PictureType> horizontalCover = null;

  public static final String JSON_PROPERTY_DURATION = "duration";
  private Integer duration;

  public VideoType() { 
  }

  public VideoType videoId(Long videoId) {
    
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

  public Long getVideoId() {
    return videoId;
  }


  @JsonProperty(JSON_PROPERTY_VIDEO_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVideoId(Long videoId) {
    this.videoId = videoId;
  }


  public VideoType videoUrl(String videoUrl) {
    
    this.videoUrl = videoUrl;
    return this;
  }

   /**
   * Get videoUrl
   * @return videoUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_VIDEO_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getVideoUrl() {
    return videoUrl;
  }


  @JsonProperty(JSON_PROPERTY_VIDEO_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVideoUrl(String videoUrl) {
    this.videoUrl = videoUrl;
  }


  public VideoType width(Integer width) {
    
    this.width = width;
    return this;
  }

   /**
   * Get width
   * @return width
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_WIDTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getWidth() {
    return width;
  }


  @JsonProperty(JSON_PROPERTY_WIDTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWidth(Integer width) {
    this.width = width;
  }


  public VideoType height(Integer height) {
    
    this.height = height;
    return this;
  }

   /**
   * Get height
   * @return height
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_HEIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getHeight() {
    return height;
  }


  @JsonProperty(JSON_PROPERTY_HEIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHeight(Integer height) {
    this.height = height;
  }


  public VideoType poster(List<PictureType> poster) {
    
    this.poster = poster;
    return this;
  }

  public VideoType addPosterItem(PictureType posterItem) {
    if (this.poster == null) {
      this.poster = new ArrayList<>();
    }
    this.poster.add(posterItem);
    return this;
  }

   /**
   * Get poster
   * @return poster
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_POSTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<PictureType> getPoster() {
    return poster;
  }


  @JsonProperty(JSON_PROPERTY_POSTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPoster(List<PictureType> poster) {
    this.poster = poster;
  }


  public VideoType horizontalCover(List<PictureType> horizontalCover) {
    
    this.horizontalCover = horizontalCover;
    return this;
  }

  public VideoType addHorizontalCoverItem(PictureType horizontalCoverItem) {
    if (this.horizontalCover == null) {
      this.horizontalCover = new ArrayList<>();
    }
    this.horizontalCover.add(horizontalCoverItem);
    return this;
  }

   /**
   * Get horizontalCover
   * @return horizontalCover
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_HORIZONTAL_COVER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<PictureType> getHorizontalCover() {
    return horizontalCover;
  }


  @JsonProperty(JSON_PROPERTY_HORIZONTAL_COVER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHorizontalCover(List<PictureType> horizontalCover) {
    this.horizontalCover = horizontalCover;
  }


  public VideoType duration(Integer duration) {
    
    this.duration = duration;
    return this;
  }

   /**
   * Get duration
   * @return duration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getDuration() {
    return duration;
  }


  @JsonProperty(JSON_PROPERTY_DURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDuration(Integer duration) {
    this.duration = duration;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VideoType videoType = (VideoType) o;
    return Objects.equals(this.videoId, videoType.videoId) &&
        Objects.equals(this.videoUrl, videoType.videoUrl) &&
        Objects.equals(this.width, videoType.width) &&
        Objects.equals(this.height, videoType.height) &&
        Objects.equals(this.poster, videoType.poster) &&
        Objects.equals(this.horizontalCover, videoType.horizontalCover) &&
        Objects.equals(this.duration, videoType.duration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(videoId, videoUrl, width, height, poster, horizontalCover, duration);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VideoType {\n");
    sb.append("    videoId: ").append(toIndentedString(videoId)).append("\n");
    sb.append("    videoUrl: ").append(toIndentedString(videoUrl)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    poster: ").append(toIndentedString(poster)).append("\n");
    sb.append("    horizontalCover: ").append(toIndentedString(horizontalCover)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
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

